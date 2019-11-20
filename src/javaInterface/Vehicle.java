package javaInterface;

public class Vehicle {

    public static void main(String[] args) {
        Bmw myBmw = new Bmw("BMW 320", 260);
        myBmw.turnleft();
        myBmw.turnRight();
        myBmw.drive();
    }
}

class Car implements CarControl{
    String model;
    int speed;

    @Override
    public void turnleft() { System.out.println("Turning left... OK!"); }

    @Override
    public void turnRight() { System.out.println("Turning right... OK!"); }

    @Override
    public void drive() { System.out.println("Driving... GO!"); }

}

class Bmw extends Car  {
    //getters and setters
    public void setModel ( String model){
        super.model = model;
    }
    public void setSpeed ( int speed){
        super.speed = speed;
    }

    static{ //static initializer
        System.out.println("Bmw class loaded");
    }
    //instance initializer

    //costructor
    Bmw (){};
    Bmw (String model, int speed){
        super.model = model;
        super.speed = speed;
    }
}
