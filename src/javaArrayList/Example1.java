package javaArrayList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class Example1 {
    public static void main(String[] args) {

        //Simple Array
        String[] fruits = new String[3];   //here we need to know size, and change it
        fruits[0] = "apple";
        fruits[1] = "raspberry";
        fruits[2] = "orange";

        System.out.println(fruits); //prints object number
        System.out.println(fruits[0]);  //prints apple

        //Simple ArrayList
        ArrayList<String> myFruits = new ArrayList<>();  //this is flexible and we dont need to use size
        myFruits.add("mango");
        myFruits.add("strawberry");
        myFruits.add("melon");

        System.out.println(myFruits);  //prints all fruits in arraylist

        //Simple arraylist with Collection
//        ArrayList<String> users = new ArrayList<>();
//        Collection<String> registeredUsers =



        List<String> nameList = new LinkedList<>();

        nameList.add("Google");
        nameList.add("Oracle");
        nameList.add("JetBrains");

        System.out.println(nameList);
    }
}
