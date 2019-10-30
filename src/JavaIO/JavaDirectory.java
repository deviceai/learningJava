package JavaIO;

import java.io.File;

public class JavaDirectory {
    public static void main(String[] args) {

        //create directory in src
        File directory = new File("src/JavaIO/testDir");
        if (!directory.exists()){
            System.out.println(directory.mkdir() ? "Successfully" : "Failed");
        }
        else {
            System.out.println("Directory allready exists!");
        }

        //show files and folders
        String path = "src/JavaIO";
        File dir = new File(path);

        String[] content = dir.list();

        for(String eachFile : content){
            File file = new File(path + "/" + eachFile);
            System.out.println("Name: " + (file.isDirectory() ? (eachFile + " is directory") : (eachFile + " is file")));
        }

    }
}
