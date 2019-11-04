package patternSingleton;

/**
 * The standard way to write a class according to the singleton pattern includes:
 *     a private constructor to defeat the creation of instances using the keyword new;
 *     a private static variable of the class that is the only instance of the class;
 *     a public static method to return the same instance of the class; this is a global access point to the instance.
 */

public class singletonMain {
    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        Singleton s3 = Singleton.getInstance();

        System.out.println(s1 == s2); // true because s1 and s2 refer the same object
        System.out.println(s2 == s3); // true because s2 and s3 refer the same object

    }
}

class Singleton {

    private static Singleton instance = new Singleton();

    private Singleton() { }

    public static Singleton getInstance() {
        return instance;
    }

}

// Lazy initialization
/**
 class Singleton {

 private static Singleton instance;

 private Singleton () { }

 public static Singleton getInstance() {
 if (instance == null) {
 instance = new Singleton();
 }
 return instance;
 }
 }
 */