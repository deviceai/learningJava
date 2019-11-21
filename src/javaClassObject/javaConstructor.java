package javaClassObject;

public class javaConstructor {
    public static void main(String[] args) {
        Car oneCar = new Car();
        System.out.println("Car: " + oneCar.name + " , speed: " + oneCar.speed);

    }
}

class Car {
    String name;
    int speed;

    //  Car(){}; //def constructor

    // Invoking constructors from other constructors
    public Car(){  //def constructor with insvoked constructor
        this( "Unknown", 0);
    }

    public Car(String name, int speed){
        this.name = name;
        this.speed = speed;
    }
}
