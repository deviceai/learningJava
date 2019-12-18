package javaArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TheLongestStringInList {

    public static void changeList (List<String> SomeListWithStrings) {
        /*
        List<String> SomeListWithStrings = new ArrayList<String>();
        SomeListWithStrings.add("one");
        SomeListWithStrings.add("five");
        SomeListWithStrings.add("three");

        System.out.println(SomeListWithStrings);
        System.out.format("List size is: %s \n", SomeListWithStrings.size());
        */

        int size =0;
        int inx = 0;
        for (String str : SomeListWithStrings){
            if (str.length() > size){
                size = str.length();
                inx = SomeListWithStrings.indexOf(str);
            }
        }

        /*
        System.out.format("Biggest string size is: %d \n", size);
        System.out.format("Element index is %d \n", inx);
        System.out.printf("Element name is %s \n", SomeListWithStrings.get(inx));
         */

        String replase = SomeListWithStrings.get(inx);
        int listSize = SomeListWithStrings.size();
        //SomeListWithStrings.clear();


        for (int i =0; i<listSize; i++){
            //SomeListWithStrings.add(replase);
            SomeListWithStrings.set(i, replase);
        }

       // System.out.println(SomeListWithStrings);
    }


    public static void main(String[] args) {

        String s = "onefivethree";
        List<String> lst = Arrays.asList(s.split(" "));
        changeList(lst);
        lst.forEach(e -> System.out.print(e + " "));

    }
}
