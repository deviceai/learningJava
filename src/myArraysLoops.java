import java.util.Arrays;

public class myArraysLoops {

    public static void main(String[] args) {
        int len = 10;
        int myArray[] = new int[10];
        //printing the array
        System.out.println(Arrays.toString(myArray));

        /* iterating over the array */
        for (int i = 0; i < myArray.length; i++){
            myArray[i] = 1; // set all item to 1
        }
        System.out.println(Arrays.toString(myArray));

    }
}
