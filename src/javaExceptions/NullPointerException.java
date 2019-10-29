package javaExceptions;

import java.util.Objects;

public class NullPointerException {
    public static void main(String[] args) {
        String someString = null;
        //System.out.println(someString.length()); //NullPointerException (NPE)

        int size = someString != null ? someString.length() : 0; //if string is null prints 0
        System.out.println(size);

        try {
            System.out.println(someString.length());
        } catch (Exception e) {
            //e.printStackTrace();
            System.out.println("NullPointerException!!!");
        }
        System.out.println("done");


        //NPE with Comparing strings

       // String strOne = null;
        String strOne = "abc";
        if (strOne.equals("abc")) { // it throws NPE
            System.out.println("strOne the same");
        }

        //To avoid NPE here we can call the equals method on literal rather than the object:
        String strTwo = null;
        String strThree = "abc";

        if ("abc".equals(strThree)) { // no NPE here
            System.out.println("The same");
        }

        String s1 = null;
        String s2 = null;

        if (Objects.equals(s1, s2)) { // no NPE here
            System.out.println("Strings are the same");
        }
    }
}
