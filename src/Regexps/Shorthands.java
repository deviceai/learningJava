package Regexps;

public class Shorthands {
    public static void main(String[] args) {
        /**
         \\d - any digit, short for [0-9];
         \\D - a non-digit, short for [^0-9];
         \\s - a whitespace character (including tab and newline), short for [ \\t\\n\\x0B\\f\\r].
         \\S - a non-whitespace character, short for [^\\s];
         \\w - an alphanumeric character (word), short for [a-zA-Z_0-9];
         \\W - a non-alphanumeric character, short for [^\\w].
         */

        String regex = "\\s\\w\\d\\s";
        " A5 ".matches(regex); // true
        " 33 ".matches(regex); // true
        "\tA4\t".matches(regex); // true, because it matches tabs as well

        "q18q".matches(regex); // false, 'q' is not a space
        " AB ".matches(regex); // false, 'B' is  not a digit
        " -1 ".matches(regex); // false, '-' is not an alphanumeric character, but '_' is OK.


        //String pattern = "\\S\\S\\S\\S\\S\\S\\S";
        //String pattern = "\\w\\w\\w\\w\\w\\w\\w";
        //String pattern = "\\d\\d\\w\\s\\d\\d\\w";
        String pattern = "\\d\\d\\w\\W\\d\\d\\w";
        //String pattern = "\\w\\w\\w-\\w\\w\\w";
        System.out.println("44A-88D".matches(pattern));


    }
}
