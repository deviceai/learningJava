package javaClassObject;

import java.util.Date;

public class SubSuperClassReference {

    public static void main(String[] args) {

        /** 1. Subclass reference */
        MyPerson person = new MyPerson(); // the reference is MyPerson, the object is MyPerson
        Client client = new Client(); // the reference is Client, the object is Client
        Employee employee = new Employee(); // the reference is Employee, the object is Employee

        /** 2. Superclass reference. */
        MyPerson client2 = new Client(); // the reference is MyPerson, the object is Client
        MyPerson employee2 = new Employee(); // the reference is MyPerson, the object is Employee

        // Client whoIsIt = new Employee(); // it's impossible
        // Client client = new Person(); // it's impossible too

        /** Accessing fields and methods through a superclass reference */
        MyPerson someEmployee = new Employee();
        someEmployee.setName("Ginger R. Lee"); // Ok
        someEmployee.setYearOfBirth(1980); // Ok
       // someEmployee.setSalary(30000); // Compile-time error, the base class "doesn't known" about the method

        /** Casting between superclass and subclass */
        MyPerson person5 = new Client();
        Client clientAgain = (Client) person5; // it's ok
        // Employee employee5 = (Employee) person; // the ClassCastException occures here

    }
}

class MyPerson {
    protected String name;
    protected int yearOfBirth;
    protected String address;

    public void setName(String s) {
        this.name = s;
    }
    public void setYearOfBirth(int i) {
        this.yearOfBirth = i;
    }
}

class Client extends MyPerson {

    protected String contractNumber;
    protected boolean gold;

    // public getters and setters for all fields
}
class Employee extends MyPerson {

    protected Date startDate;
    protected Long salary;

    // public getters and setters for all fields
}

