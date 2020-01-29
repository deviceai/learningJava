package javaInterface.testInterface;

import java.util.ArrayList;
import java.util.List;

public class Main implements testInterface, testInterface2{
    public static void main(String... args){

        Main mainClassInstance = new Main();
        mainClassInstance.printConst();

        Human[] human = new Human[10];
        //byte[] bytes = {1,2,3,4,5};
        //System.out.println(bytes.length);
       //System.out.println(bytes[2:4]);

        List<Byte> newBytes = new ArrayList<>();

    }

    @Override
    public void printConst() {
        System.out.println(CONSTANTA2);
    }
}

class Human {

    String name = "unknown";
    String age = "0";

    public Human() {}

    public Human(String name, String age) {
        this.name = name;
        this.age = age;
    }

    public String getAge() { return age; }
    public void setAge(String age) { this.age = age; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
}

class AsciiCharSequence implements java.lang.CharSequence{

    @Override
    public int length() {
        return 0;
    }

    @Override
    public char charAt(int index) {
        return 0;
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        return null;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
