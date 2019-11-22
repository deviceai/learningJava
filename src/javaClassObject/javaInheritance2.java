package javaClassObject;

public class javaInheritance2 {
    public static void main(String[] args) {

        C c = new C(2);
        c.printField(); //prints 6


    }
}

class A {

    protected int field; // = 3

    public A(int val) {  //2
        this.field = val + 1;  //3
    }
}

class B extends A {

    protected int field;

    public B(int val) {  //2
        super(val); // 2
        this.field = super.field * 2; // 3*2 = 6
    }
}

class C extends B {

    protected int field;

    public C(int val) {
        super(val);  //2
        this.field = super.field + 2;  // 6+2=8
    }

    public void printField() {
        System.out.println(super.field);
    }
}
