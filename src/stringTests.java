public class stringTests {
    public static void main(String[] args) {
        String myString0 = "test string";  // useing string pool in JVM
        String myString = new String("test");  // i dont want to use the string pool, java will make a new object

        System.out.println(1 + 2 + myString + 1 + 2); //3test12
        myString.concat("555"); //not work, String is immutable
        String myNewString = myString.concat("555");
        System.out.println(myNewString);

        System.out.println("Java string methods");
        String textString  = "awesome";
        System.out.println(textString.length());
        System.out.println(textString.charAt(1));

        try {
            System.out.println(textString.charAt(10));
        } catch (Exception error) {
            System.out.println("out of range");
        }

        System.out.println(textString.indexOf("m"));

        //secret code
        String secretCode = "lfslfj_5554_ritritepr";
        System.out.println("index is: ");
        System.out.println(secretCode.charAt(5));
        System.out.println(secretCode.substring(6));
        System.out.println(secretCode.substring(6,12));

        int codeStart = secretCode.indexOf("_"); //looking for the first _
        int codeStop = secretCode.indexOf("_", codeStart+1); // looking for the second _

        System.out.println(secretCode.substring(codeStart+1, codeStop));


        System.out.println("abc".equals("ABC")); // false
        System.out.println("ABC".equals("ABC")); // true
        System.out.println("abc".equalsIgnoreCase("ABC")); // true

        String aa = "abc";
        String bb = aa.toUpperCase();
        String c = bb.replace('A', '1').replace('B', '2');
        System.out.println(aa);
        System.out.println(c);

        //stringbuilder is not immutable

        StringBuilder myMessage = new StringBuilder("start");
        myMessage.append("-run");
        myMessage.append("-finish");
        System.out.println(myMessage);

        StringBuilder a = new StringBuilder("abc");
        StringBuilder b = a.append("de");  //not a new object but only reference to object a
        System.out.println(a);
        System.out.println(b);




    }
}
