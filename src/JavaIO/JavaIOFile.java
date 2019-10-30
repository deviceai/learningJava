package JavaIO;

import java.io.File;

public class JavaIOFile {
    public static void main(String[] args) {
        String path = "testfile.txt";
        File file = new File(path);

        System.out.println("File name " + file.getName() + "\n");
        System.out.println("Path " + file.getPath());
        System.out.println("Absolutely path " + file.getAbsolutePath() + "\n");
        System.out.println("Parent directory " + file.getParent());
        System.out.println("File size " + file.length() + " bytes" + "\n");
        System.out.println("File " + (file.exists() ? "exist" : "does not exist"));
        System.out.println("File " + (file.canWrite() ? "writable" : "not writable"));
        System.out.println("File " + (file.canRead() ? "readable" : "not readable"));
        System.out.println("File " + (file.isDirectory() ? "is directory" : "is not directory"));
        System.out.println("File " + (file.isFile() ? "is regular file" : "is not regular file"));
        System.out.println("File " + (file.isHidden() ? "hidden" : "is not hidden" + "\n"));

        System.out.println("Total space " + CapasityFormatter.toGigabytes(file.getTotalSpace()) + " Gb");
        System.out.println("Total free space " + CapasityFormatter.toGigabytes(file.getFreeSpace()) + " Gb");
    }

    private static class CapasityFormatter {

            public static long toGigabytes (long capasity){
                return capasity / (long)Math.pow(10, 9);
            }
    }


}
