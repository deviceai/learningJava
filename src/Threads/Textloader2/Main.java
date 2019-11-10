package Threads.Textloader2;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        final ITextLoader fileTextLoader = new MockLoader("textFromFile");
        final ITextLoader webTextLoader = new MockLoader("fileFromWeb");

        final long timeBefore = System.currentTimeMillis();

        final Thread fileTextLoaderThread = new Thread(() -> System.out.println(fileTextLoader.loadText()));
        fileTextLoaderThread.start();

        final Thread webTextLoaderThread = new Thread(() -> System.out.println(webTextLoader.loadText()));
        webTextLoaderThread.start();

        //wait until two threads is complete
        fileTextLoaderThread.join(); //3sec
        webTextLoaderThread.join(); //0sec


        final long timeAfter = System.currentTimeMillis();

        System.out.printf("Time delta is %d\n", (timeAfter - timeBefore) / 1_000);
    }
}
