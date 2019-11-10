package Threads.Textloader1;

public class MockLoader implements ITextLoader {
     private final String textToLoad;

     //constructor
     public MockLoader(final String textToLoad){
         this.textToLoad = textToLoad;
     }

     //override method in interface
    @Override
    public String loadText() {

        try {
            Thread.sleep(3000);  //emulate delay
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return textToLoad;
    }
}
