package javaClassObject;

import java.util.Date;

public class InitializationBlocks {
    public static void main(String[] args) {
    }
}

//Static initialization block
class StaticInitBlockExample {

    private static String stringField;
    private static Date dateField;

    private static final String A_STRING_CONSTANT;

    static {
        stringField = getEmptyString();
        dateField = new Date();
        A_STRING_CONSTANT = "unknown";
    }

    private static String getEmptyString() {
        return "empty";
    }
}

//Instance initialization block
class InstanceInitBlockExample {

    private int field;

    {
        field = 40;
    }
}
