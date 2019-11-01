package Regexps;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.Match;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternsMatcher {
    public static void main(String[] args) {
        String text = "We use Java to write modern applications";
        Pattern pattern = Pattern.compile(".*[Jj]ava.*"); // regex to match "java" or "Java" in a text

        Matcher matcher = pattern.matcher(text); // it will match the passed textboolean matches = matcher.matches(); // true
        boolean matches = matcher.matches(); // true

        //System.out.println(matches);

       // Matcher matcher1 =  Pattern.compile("[patern]").matcher(str);  //in one string

        String text2 = "Java supports regular expressions. LET'S USE JAVA!!!";
        //String text2 = "JaVa";
        Pattern javaPattern2 = Pattern.compile("java", Pattern.CASE_INSENSITIVE);
        Matcher javaMatcher2 = javaPattern2.matcher(text2);

        Pattern regexPattern = Pattern.compile(".*regular expression.*");
        Matcher regexMatcher = regexPattern.matcher(text2);

        System.out.println(javaMatcher2.matches());
        System.out.println(regexMatcher.matches());

        //tets
        System.out.println("----- Tests: ------");
        System.out.println(regexMatcher.find());  //true
        System.out.println(Pattern.matches(".*java.*", text2));
        System.out.println(regexMatcher.matches()); //true
        System.out.println(javaMatcher2.matches());
        System.out.println(javaMatcher2.find());  //true


        //In the middle of a word
        System.out.println("In the middle of a word ");
        String part = ".*^some*.";
        String line = "someawe is that!";

        Pattern partPattern = Pattern.compile(part, Pattern.CASE_INSENSITIVE);
        Matcher partMatcher = partPattern.matcher(line);

        //System.out.println(Pattern.matches(".*^some", line) ? "YES" : "NO");
        System.out.println(partMatcher.find());

    }
}
