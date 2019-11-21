package javaClassObject;

public class javaMultipleConstructor {
    public static void main(String[] args) {
        SomeClass instance = new SomeClass(300, "another-value");
        System.out.println("Result: " + instance.val + " , " + instance.str);
    }


}

class SomeClass {

    int val = 50;
    String str = "default";

    public SomeClass() { //this third
        this(100);
    }

    public SomeClass(int val) { // and this running last
        val = val;   // 100 = 100 doing nothing
    }

    public SomeClass(String str) { // this second
        this();  //MUST BE ALWAYS FIRST
        this.str = "some-value";
    }

    public SomeClass(int val, String str) {   //running this first
        this(str);
    }
}
