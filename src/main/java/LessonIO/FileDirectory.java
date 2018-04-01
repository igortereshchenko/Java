package LessonIO;

import java.io.File;
import java.io.IOException;

/**
 * Created by student on 28.03.2018.
 */
public class FileDirectory {

    public static void main(String [] args){

        // File

        File dir = new File("D://test");


        if (dir.isDirectory()){

            for (File file: dir.listFiles()
                 ) {
                if (file.isDirectory())
                    System.out.println("Dir: "+file.getName());
                else {
                    System.out.println("File: " + file.getName());

                    System.out.println("Dir parent: "+file.getParent());

                    System.out.println("File size: "+file.length());

                    System.out.println("File can read: "+file.canRead());
                    System.out.println("File can write: "+file.canWrite());
                    System.out.println("File can execute: "+file.canExecute());


                }
            }

        }

        // create new dir

        File newDir = new File("D://test//newdir");

        boolean created = newDir.mkdir();
        if (created)
            System.out.println("Created");
        else
            System.out.println("Error");

        // rename

        File newDirName = new File("D://test//newdirname");

        newDir.renameTo(newDirName);

        // delete


        boolean deleted = newDir.delete();

        // newDirName.delete(); //delete all


        if (created)
            System.out.println("Deleted");
        else
            System.out.println("Error");

        //create new file

        File newFile = new File("D://test//newfile.txt");

        try {
            newFile.createNewFile();

            System.out.println(newFile.getAbsolutePath());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
