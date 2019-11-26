package javaPolymorphism;

public class javaPolymorphism {
    /**
     Java provides two types of polymorphism: static (compile-time) and dynamic (run-time) polymorphism.
     The first one is achieved by method overloading, the second one is based on inheritance and method overriding.
     */
    public static void main(String[] args) {
        byte[] someBytes = {2,5,7};
        File img = new ImageFile("/path/to/file/img.png", 640, 480, someBytes); // assigning an object
        img.printFileInfo(); // It prints "Image: /path/to/file/img.png, width: 480, height: 640"
    }
}

class File {

    protected String fullName;
    // constructor with a single parameter

    public File(String fullName) {
        this.fullName = fullName;
    }

    // getters and setters
    public void printFileInfo() {
        String info = this.getFileInfo(); // here is polymorphic behaviour!!!
        System.out.println(info);
    }
    protected String getFileInfo() {
        return "File: " + fullName;
    }
}

class ImageFile extends File {
    protected int width;
    protected int height;
    protected byte[] content;

    public ImageFile(String s, int i, int i1, byte[] i2) {
        super(s);
        this.width = i1;
        this.height = i;
        this.content = i2;
    }

    // constructor
    // getters and setters
    @Override
    protected String getFileInfo() {
        return String.format("Image: %s, width: %d, height: %d", fullName, height, width);
    }
}