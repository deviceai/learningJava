package javaExceptions;

import java.util.Scanner;

public class ArithmeticException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        try {
            System.out.println("result = " + a/b);
        } catch (Exception e) {
           // e.printStackTrace();
            System.out.println("Division by zero!");
        }

        System.out.println("done");
    }
}
