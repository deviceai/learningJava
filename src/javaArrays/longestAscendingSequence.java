/**
 Write a program that reads an array of ints and outputs the length of the longest sequence in ascending order.
 Elements of the sequence must go one after another.

 Input data format:
 The first line contains the size of an array.
 The second line contains elements of the array separated by spaces.

 Example:
 The input array is 1 2 4 1 2 3 5 7 4 3. In this case, the length of the longest sequence in ascending order is 5.
 It includes the following elements: 1 2 3 5 7.
 Sample Input 1:
 10
 1 2 4 1 2 3 5 7 4 3
 Sample Output 1:
 5
 */

package javaArrays;
import java.util.Scanner;

public class longestAscendingSequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt(); //read array length

        int[] array = new int[len];
        for (int i = 0; i<len; i++){  //read array from console
            array[i] =  sc.nextInt();
        }
        int sum = 1;
        int prevSum = 0;
        for (int j=1; j<len; j++){
            if (array[j] > array[j-1]){
                sum++;
            }
            else {
                if (prevSum < sum){
                    prevSum = sum;
                    sum = 1;
                }
            }
        }
        if (sum > prevSum){System.out.println(sum);}
        else {System.out.println(prevSum);}

    }
}
