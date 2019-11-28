package javaInterface.myInterface;

public interface Interface {

    /**
     An interface can contain:
     - public constants;
     - abstract methods without an implementation (the keyword abstract is not required here);
    -  default methods with implementation since Java 8 (the keyword default is required);
     - static methods with implementation (the keyword static is required).
     */
    int INT_CONSTANT = 0;  // it's a constant, the same as public static final INT_FIELD = 0

    void instanceMethod1();  //abstract methods
    void instanceMethod2();

    static void staticMethod() {
        System.out.println("Interface: static method");
    }

    default void defaultMethod() {
        System.out.println("Interface: default method. It can be overridden");
    }

}
