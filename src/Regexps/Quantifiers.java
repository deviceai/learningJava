package Regexps;

public class Quantifiers {
    public static void main(String[] args) {
        /**
         + matches one or more repetitions of the preceding character;
         * matches zero or more repetitions of the preceding character;
         {n} matches exactly n repetitions of the preceding character;
         {n,m} matches at least n but not more than m repetitions of the preceding character;
         {n, } matches at least n repetitions of the preceding character;
         { ,m} matches not more than m repetitions of the preceding character.
         */

        String regex = "ca+b";

        "cab".matches(regex); // true
        "caaaaab".matches(regex); // true
        "cb".matches(regex); // false, because it does not have at least one repetition of 'a'

        String regex2 = "A[0-3]*";

        "A".matches(regex2);  // true, because it matches zero or more repetitions
        "A0".matches(regex2); // true
        "A000111222333".matches(regex2); // true

        String regex3 = "[0-9]{4}"; // four digits

        "6342".matches(regex3);  // true
        "9034".matches(regex3);  // true

        "182".matches(regex3);   // false
        "54312".matches(regex3); // false

        String regex4 = "1{2,3}";

        "1".matches(regex4);    // false
        "11".matches(regex4);   // true
        "111".matches(regex4);  // true
        "1111".matches(regex4); // false

        String regex5 = "ab{4,}";

        "abb".matches(regex5); // false, not enough 'b'
        "abbbb".matches(regex5); // true
        "abbbbbbb".matches(regex5); // true


    }
}
