package javaExceptions;

import java.util.Scanner;

public class NumberFormatException {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();


        /**
         *         if (input.matches("\\d+")) { // it checks the input line contains only digits
         *             int number = Integer.parseInt(input);
         *             System.out.println(number + 1);
         *         } else {
         *             System.out.println("Incorrect number: " + input);
         *         }
         */

        try {
            System.out.println("Number is " + Integer.parseInt(input));
        } catch (java.lang.NumberFormatException e) {
           // e.printStackTrace();
            System.out.println("Not a number!");
        }
        System.out.println("done!");
    }
}
