package javaEnum;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.HashMap;

public class WorkingWithEnum {
    public static void main(String[] args) {
        ArrayList<Roles> userRoles = new ArrayList<>();
        System.out.println(userRoles.size());
        userRoles.add(Roles.ADMIN);
        userRoles.add(Roles.USER);
        userRoles.add(Roles.MANAGER);
        System.out.println(userRoles);


        HashMap<Roles, String> usersData = new HashMap<>();
        usersData.put(Roles.ADMIN, "password");
        System.out.println(usersData.get(Roles.ADMIN));  //returns admin's password
    }


}
