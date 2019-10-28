package javaArrays;
import java.util.Arrays;
import java.util.Scanner;

public class RotatingArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = 5;
        int[] array = new int[len];
        int rot_count = sc.nextInt();

        for (int i = 0; i<len; i++){  //read array from console
            array[i] =  sc.nextInt();
        }

        System.out.println(Arrays.toString(array));
        System.out.println("Rotation cout :" + rot_count);

        //rotating array



    }
}
