package javaArrayList;
import java.util.ArrayList;

public class javaArrayList<S> {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();  //The created list is empty, but its initial capacity is 10 (by default).

        list.add("John");
        list.add("Bob");
        list.add("Tom");

        System.out.println(list.size());
        System.out.println(list);

        System.out.println(list.get(1));

        list.add(0, "Alex");
        System.out.println(list);

        list.remove("Bob");
        System.out.println(list);

        list.clear();
        System.out.println(list);

        list.add(0, "Smith");
        System.out.println(list);

        //contains
        System.out.println(list.contains("Smith")); //prints true



    }
}
