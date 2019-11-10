package Threads.Textloader3;

import Threads.Textloader1.MockLoader;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        final long timeBefore = System.currentTimeMillis();

        //final Thread loader = new TextLoaderThread(new MockLoader("thread 1"));
        //loader.start();

        final Runnable runnableloader = new TextLoaderRunnable(new MockLoader("thread 1"));
        //runnableloader.run();  //synchronized call

        //asynchronized call
        final Thread thread = new Thread(runnableloader);
        thread.start(); //run thread

        thread.join(); //wait thread to complete, time delta will be 3s

        final long timeAfter = System.currentTimeMillis();
        System.out.printf("Time delta is %d \n", (timeAfter - timeBefore)/1_000);
    }
}
