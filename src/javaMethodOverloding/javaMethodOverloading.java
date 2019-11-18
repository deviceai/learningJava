package javaMethodOverloding;

public class javaMethodOverloading {
    public static void main(String[] args) {
        MyClass.print("Text");
        MyClass.print("2times",2);
        MyClass.print(25);

        //the compiler chooses the method that has the closest type of the argument
        OverloadingNumbers.print(10);
        //cast an argument explicitly
        OverloadingNumbers.print((long)55);

        //myNum class
     //   float val = 2F; MyNum.toString(val);
        long val2 = 2L; MyNum.toString(val2);
        int val3 = 2; MyNum.toString(val3);
        byte val4 = 2; MyNum.toString(val4);
        char val5 = 2; MyNum.toString(val5);
     //   double val6 = 2; MyNum.toString(val6);
    }
}

class MyClass {
    //static methods
    public static void print(String stringToPrint){
        System.out.println(stringToPrint);
    }
    public static void print(String stringToPrint, int times){
        for (int i=0; i<times; i++){
            System.out.println(stringToPrint);
        }
    }
    public static void print(int val){
        System.out.println(val);
    }
}

class OverloadingNumbers {

    public static void print(short a) {
        System.out.println("short arg: " + a);
    }

    public static void print(int a) {
        System.out.println("int arg: " + a);
    }

    public static void print(long a) {
        System.out.println("long arg: " + a);
    }

    public static void print(double a) {
        System.out.println("double arg: " + a);
    }

    public static void main(String[] args) {
        print(100);
    }
}

class MyNum {
    public static String toString(long num) {
        return "OK";
    }

    public static String toString(int num) {
        return "OK";
    }
}
