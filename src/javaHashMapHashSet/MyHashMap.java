package javaHashMapHashSet;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class MyHashMap {
    public static void main(String[] args) {

        //HASH MAP
        HashMap<String, String> users = new HashMap<>();
        users.put("john1", "pass3");
        users.put("bob", "kfjdf");
        users.put("alec", "lsfdlsf");

        System.out.println(users);
        System.out.println(users.size());
        System.out.println(users.isEmpty());

        //HASHSET
        HashSet<String> roles = new HashSet<>();
        roles.add("ADMIN");
        roles.add("USER");
        roles.add("MANAGERS");

        //System.out.println(roles);

        //ITERATOR
        System.out.println("Printing all roles:");
        Iterator<String> myIterator = roles.iterator();
        while(myIterator.hasNext()){
            System.out.println(myIterator.next());
        }

    }
}
