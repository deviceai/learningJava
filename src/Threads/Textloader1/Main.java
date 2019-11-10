package Threads.Textloader1;

public class Main {
    public static void main(String[] args) {
        final ITextLoader fileTextLoader = new MockLoader("textFromFile");
        final ITextLoader webTextLoader = new MockLoader("fileFromWeb");

        final long timeBefore = System.currentTimeMillis();

        System.out.println(fileTextLoader.loadText());
        System.out.println(webTextLoader.loadText());

        final long timeAfter = System.currentTimeMillis();

        System.out.printf("Time delta is %d", (timeAfter - timeBefore)/1_000);
    }
}
