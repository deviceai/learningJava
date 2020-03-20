package javaReflection.TestClass;

import javaInterface.myInterface.MyClass;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectionTestClass {
    public static void main(String[] args) {

        SomeClass something = new SomeClass("a", 1);
        System.out.println(something.toString());

        String name;
        //something.getName();     We cant get name, getter is commented
        //using Reflection

        try {
            //Changing and getting filds
            Field field = something.getClass().getDeclaredField("name");
            field.setAccessible(true);
            name = (String) field.get(something);  // get value
            System.out.println("Name field in SomeClass is: " + name);

            field.set(something, (String) "new value");  //set new value to field in class
            System.out.println("New value is: " + (String)field.get(something));

            //Using private method in class with Reflection
            Method method = something.getClass().getDeclaredMethod("myPrivatePrintMethod");
            method.setAccessible(true);
            method.invoke(something);

            System.out.println(SomeClass.class.getName()); //return name of class

            //Make class instance with reflection
            SomeClass myclass = null;
            try {
                Class tempClass = Class.forName(SomeClass.class.getName());  //return class by name

                // create new instance of class, /without argument, default constructor must be in class
                //myclass = (SomeClass) tempClass.newInstance();

                //using constructor in class
                Class[] params = {String.class, int.class};
                myclass = (SomeClass)tempClass.getConstructor(params).newInstance("nnn", 555);

                System.out.println("Class is: " + myclass);

                //to get class constructors
                Constructor[] constructors = tempClass.getConstructors();  //get all class constructors
                for (Constructor constructor : constructors){
                    Class[] paramTypes = constructor.getParameterTypes();
                    for (Class paramType : paramTypes){
                        System.out.println(paramType.getName());
                    }
                    // print String and int
                }



            } catch (InstantiationException | ClassNotFoundException e) {
                e.printStackTrace();
            }


        } catch (NoSuchMethodException | NoSuchFieldException | IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }

    }

}


//some class

class SomeClass {
    private String name = "default";
    private int number = 10;

//    public String getName() {
//        return name;
//    }

    public void setName(String name) { this.name = name; }
    public int getNumber() { return number; }
    public void setNumber(int number) { this.number = number; }

    public SomeClass(String name, int number) {
        this.name = name;
        this.number = number;
    }

    private void myPrivatePrintMethod(){
        System.out.println("This is private class method");
    }

    public SomeClass() { }

    @Override
    public String toString() {
        return "SomeClass{" +
                "name='" + name + '\'' +
                ", number=" + number +
                '}';
    }
}
