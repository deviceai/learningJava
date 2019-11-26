package javaAbstract;

public class javaAbstractClass {
    public static void main(String[] args) {

         // Pet pet = new Pet("Unnamed", 5); // this throws a compile time error

        Cat cat = new Cat("Tiger", 2);
        cat.say(); // it prints "Meow!"

    }
}
class Cat extends Pet {

    // It can have additional fields as well

    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void say() {
        System.out.println("Meow!");
    }
}

abstract class Pet {

    protected String name;
    protected int age;

    protected Pet(String name, int age) {
        this.name = name;
        this.age = age;
    }


    public abstract void say(); // an abstract method
}
