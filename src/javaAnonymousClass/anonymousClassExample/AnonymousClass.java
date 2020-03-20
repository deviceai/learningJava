package javaAnonymousClass.anonymousClassExample;

public class AnonymousClass{

    private static String someName1 = "Ken Wood";  //constant field

    public static void main(String[] args) {

        final String someName2 = "John Smith"; // final local variable

        //Anonymous class
        ///An anonymous class always implements an interface or extends another class (concrete or abstract). ///
        SpeakingEntity EnglishSpeakingEntity = new SpeakingEntity() {
            @Override
            public void sayHello() {
                System.out.println("Hello ");
                System.out.println(someName1);  // it captures the constant field
                System.out.println(someName2);  // it captures the local variable
            }

            @Override
            public void sayBye() {
                System.out.println("Bye!");
            }
        };

        EnglishSpeakingEntity.sayHello();
        EnglishSpeakingEntity.sayBye();

    }

    /**Anonymous classes have some restrictions:
         they cannot have static initializers or member interfaces;
         they cannot have static members, except the constant variables (final static fields);
         they cannot have constructors.
    **/


}
