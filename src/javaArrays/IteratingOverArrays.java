package javaArrays;
import java.util.Arrays;
import java.util.Scanner;

public class IteratingOverArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int arrayLen = scanner.nextInt(); //resding a new array length
        int[] newArray = new int[arrayLen]; //creating new array for readings

        for (int i = 0; i < arrayLen; i++){
            newArray[i] = scanner.nextInt();  //read numbers to array from console
        }

        System.out.println(Arrays.toString(newArray));

        //Using for-each loop
        char[] characters = { 'a', 'b', 'c', 'a', 'b', 'c', 'a' };

        int counter = 0;
        for (char ch : characters){
            if (ch == 'a') counter++;
        }
        System.out.println(counter);


    }
}
