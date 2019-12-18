package javaArrayList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Example1 {
    public static void main(String[] args) {

        List<String> nameList = new LinkedList<>();

        nameList.add("Google");
        nameList.add("Oracle");
        nameList.add("JetBrains");

        System.out.println(nameList);
    }
}
