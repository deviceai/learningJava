package javaClassObject;

import java.util.ArrayList;
import java.util.List;

public class javaClassObject {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.setName("John");
        person1.setAge(25);
        //System.out.println(person1.discription);
        System.out.println(person1.getClassDiscription());
        System.out.println("Person1 name is " + person1.getName() + " , age is " + person1.getAge());

        //person 2
        Person person2 = new Person ("Mark", 18);
        System.out.println("Person1 name is " + person2.getName() + " , age is " + person2.getAge());
        int[] money = new int[]{4,2,6};
        System.out.println("Person1 has " + person1.calculateMoney(money) + " dollar(s)");
    }
}

class Person {
    //static fields:
    final private static String discription = "Class for creating persons";

    //private fields:
    private String name;
    private int age;

    //static methods:
    public static String getClassDiscription(){
        return discription;
    }

    //public methods, getters and setters
    public String getName () {
        return name;
    }
    public void setName (String name){
        this.name = name;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }

    public int calculateMoney(int[] list){
        int sum = 0;
        for (int money : list){
            sum += money;
        }
        return sum;
    }

    //constructors
    Person(){}  //default
    Person(String name, int age){
        this.name = name;
        this.age = age;
    }
}
