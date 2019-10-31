package Regexps;

public class javaRanges {
    public static void main(String[] args) {
        String pattern = "ab[abc]";
        System.out.println("abc".matches(pattern));
        System.out.println("abd".matches(pattern));


        String anyDigitPattern = "[0-9]"; // matches any digit from 0 to 9
        String anyLetterPattern = "[a-zA-Z]"; // matches any letter "a", "b", ..., "A", "B", ...

        //Excepting characters
        String regex = "[^abc]";
        System.out.println("a".matches(regex));  //false
        System.out.println("x".matches(regex));  //true

        //Alternations
        String pattern2 = "(abc|def|xyz)"; // matches "abc", "def", "xyz", but not "a" or "b"
        "abc".matches(pattern2); // true
    }
}
