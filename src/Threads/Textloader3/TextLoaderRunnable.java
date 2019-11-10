package Threads.Textloader3;

import Threads.Textloader1.ITextLoader;

public class TextLoaderRunnable implements Runnable {

    private final ITextLoader textLoader;

    public TextLoaderRunnable (final ITextLoader textLoader){
        this.textLoader = textLoader;
    }

    @Override
    public void run() {
        System.out.println(textLoader.loadText());
    }
}
