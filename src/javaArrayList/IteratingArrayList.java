package javaArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class IteratingArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> numList = new ArrayList<>();

        //addind item to numList
        for (int i = 0; i<6; i++){
            numList.add(i*10);
        }

        //printing all elements in list
        for (int item : numList){
            System.out.print(" " + item);
        }
        System.out.println("");

        ArrayList<String> nameList = new ArrayList<>(Arrays.asList("Mr.Green", "Mr.Yellow", "Mr.Red"));
        System.out.println(nameList);

        ArrayList<Integer> numList1 = new ArrayList<>(Arrays.asList(2,3,5,6));
        System.out.println(numList1);
    }
}
