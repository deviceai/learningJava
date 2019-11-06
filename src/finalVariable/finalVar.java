package finalVariable;

public class finalVar {
    public static void main(String[] args) {
        final String NAME = "some name";
        System.out.println(NAME);

        final String NAME2; // not initialized
        NAME2 = "some name 2"; // initialized
        System.out.println(NAME2); // no errors here

        final boolean FALSE;
        //System.out.println(FALSE); // error line

        final int count = 10;
        int cnt = count;
        cnt = 20; // no errors here, cnt is not final


        /* Final reference variables */
        final StringBuilder builder = new StringBuilder();
        //  builder = new StringBuilder(); // error line

        final StringBuilder builder2 = new StringBuilder(); // ""
        builder2.append("Hello!"); // it works
        System.out.println(builder2.toString()); // Hello!

        //Since Java 11
        //final var FINAL_VAR = 10; // int
        //final var MSG = "Hello!"; // String


    }
}
