package javaClassObject;

public class classTests {
    public static void main(String[] args) {

        X x = new Y();  // OK
        /** Y y = new X();  // NOT OK */

        X x2 = new Z(); // OK
        /** Z z = new X();  //NOT OK */

        //paren <- child  OK
        //child <- parent NOT OK
    }
}

class X { }
class Y extends X {}
class Z extends X {}

