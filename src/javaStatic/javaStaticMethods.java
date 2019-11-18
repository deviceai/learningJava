package javaStatic;

public class javaStaticMethods {
    public static void main(String[] args) {
        Person person = new Person("John");
        System.out.println(person.getNextId());

    }
}

class Person {
    private static long nextId = 1;
    long id;
    String name;

    public Person(String name){
        this.name = name;
        this.id = nextId;
        nextId++;
    }

    public long getNextId(){
        return nextId;
    }
}
