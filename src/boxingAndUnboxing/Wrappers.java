package boxingAndUnboxing;

public class Wrappers {
    public static void main(String[] args) {
        int primitive = 100;
        Integer reference = Integer.valueOf(primitive); // boxing
        int anotherPrimitive = reference.intValue();    // unboxing

        System.out.println(primitive);
        System.out.println(reference);

        double primitiveDouble = 10.8;
        Double wrapperDouble = primitiveDouble; // autoboxing
        double anotherPrimitiveDouble = wrapperDouble; // auto-unboxing

        //Constructing wrappers based on other types
        Integer number = new Integer("10012"); // an Integer from "10012"
        Float f = new Float("0.01");           // a Float from "0.01"
        Long longNumber = new Long("100000000"); // a Long from "100000000"
        Boolean boolVal = new Boolean("true");   // a Boolean from "true"

        Long longVal = Long.parseLong("1000");      // a Long from "1000"
        Long anotherLongVal = Long.valueOf("2000"); // a Long from "2000"

        //Comparing wrappers
        Long i1 = Long.valueOf("2000");
        Long i2 = Long.valueOf("2000");
        System.out.println(i1 == i2);      // false
        System.out.println(i1.equals(i2)); // true

        //NPE when unboxing
        Long longVal2 = null;
        //long primitiveLong = longVal2; // It throws NPE
        long unboxed = longVal2 != null ? longVal2 : 0; // No NPE here

        Integer n1 = 50;
        Integer n2 = null;
        //Integer result = n1 / n2; // It throws NPE

        //Initializing long value
        Long val = Long.parseLong("4321");
        Long val2 = new Long("4321");
        Long val3 = new Long(4321);
        Long val4 = 4321L;
        System.out.println(val);
        System.out.println(val2);
        System.out.println(val3);
        System.out.println(val4);
    }
}
