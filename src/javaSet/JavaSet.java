package javaSet;

import java.util.*;

public class JavaSet {
    public static void main(String[] args) {

        //HASHSET
        Set<Integer> hashset1 = new HashSet<>();  // create
        for (int i=0; i<3; i++){ hashset1.add(i);}  // add elements 0 1 2

        Set<Integer> hashset2 = new HashSet<>();  // create
        for (int i=0; i<6; i++){ hashset1.add(i);}  // add elements 0 1 2 3 4 5

        Set<Integer> result = new HashSet<>();
        result.addAll(hashset1);  // adds 0 1 2
        result.addAll(hashset2); // adds only unique elements 3 4 5 6

        System.out.println(result);
        // this set implementation is unordered.


        //THREESET
        SortedSet<Integer> sortedset = new TreeSet<>();
        sortedset.add(10);
        sortedset.add(25);
        sortedset.add(15);
        sortedset.add(5);
        System.out.println(sortedset);   // will print 5 10 15 25   ordered list

        SortedSet<Integer> subSetLessThan16 = sortedset.headSet(16); // [10, 13, 15]
        System.out.println(subSetLessThan16);  // prints all that less than 16

        int maxElement = sortedset.last(); // it is 21
        System.out.printf("Max element in TreeSet is: %d\n", maxElement);

        //LINKEDHASHSET
        Set<Character> orderedset = new LinkedHashSet<>();
        for (char c = 'a'; c <= 'k'; c++) {
            orderedset.add(c);
        }
        System.out.println(orderedset);
        // this set implementation is ordered.

    }
}
