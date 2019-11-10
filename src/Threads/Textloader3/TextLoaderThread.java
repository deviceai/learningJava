package Threads.Textloader3;

import Threads.Textloader1.ITextLoader;

public class TextLoaderThread extends Thread {

    private final ITextLoader textLoader;

    //constructor
    public TextLoaderThread(final ITextLoader textLoader){
        this.textLoader = textLoader;
    }

    @Override
    public void run() {
        System.out.println(textLoader.loadText());
    }
}
