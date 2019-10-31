package Regexps;

public class javaRegexps {
    public static void main(String[] args) {

        String abcRegex = "abc"; // the "abc" regex

        System.out.println("abc".matches(abcRegex));  // true, "abc" string matches the "abc" regex
        System.out.println("ABC".matches(abcRegex));  // false, "ABC" string is in uppercase
        System.out.println("abc1".matches(abcRegex)); // false, "abc1" string has an additional character
        System.out.println("cba".matches(abcRegex)); // false, "cba" string can't be read from right to left

        /**
         * The dot character . matches any single character including letters, digits, spaces and so on.
         * The only character it is not able to match is the newline character \n.
         */

        String java_regex = "Java.Regex"; // it means "Java" followed by any character and then "Regex"

        System.out.println("Java Regex".matches(java_regex)); // true
        System.out.println("Java.Regex".matches(java_regex)); // true
        System.out.println("Java_Regex".matches(java_regex)); // true
        System.out.println("JavakRegex".matches(java_regex)); // true

        String pattern = ".....\\.";   //   if we want . (dot)
        "a1b2c.".matches(pattern); // true
        "Hello.".matches(pattern); // true
        "Hello!".matches(pattern); // false, ! does not  match \\.

        /**
         * The question mark ? is a special character that has a “the preceding character or nothing" meaning.
         * The question mark ? signals that the character before it can occur once or zero times in a string to satisfy the pattern.
         */

        String pattern2 = "behaviou?r";

        "behaviour".matches(pattern2); // true
        "behavior".matches(pattern2);  // true

        System.out.println("Pattern 3:");
        String pattern3 = "2?. dollars";
        System.out.println("22 dollars".matches(pattern3));
        System.out.println("23 dollars".matches(pattern3));
        System.out.println("5 dollars".matches(pattern3));
        System.out.println("32 dollars".matches(pattern3));
        System.out.println("dollars".matches(pattern3));
        System.out.println("22dollars".matches(pattern3));

        System.out.println("Pattern 4:");
        String pattern4 = "jav.c?";
        System.out.println("javaX".matches(pattern4));
        System.out.println("jav".matches(pattern4));
        System.out.println("javac".matches(pattern4));
        System.out.println("java".matches(pattern4));
        System.out.println("javc".matches(pattern4));


    }
}
