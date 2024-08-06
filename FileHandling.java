package JavaIoStream;

//functionality of FILE CLASS to access properties of a file

import java.io.*;

public class FileHandling {

    public static void main(String[] args) throws Exception
    {
        File f = new File("D:\\JavaPrograms\\JavaIoStream");

        System.out.println(f.isDirectory());
      /* String lst [] = f.list();

        for (String x : lst){
            System.out.println(x);
        }*/

        File list [] = f.listFiles();

        for (File x : list){
            System.out.println(x.getName()+"  " + x.getParent());
        }

        File fi = new File("D:\\JavaPrograms\\JavaIoStream\\Data.txt");
       // fi.setReadOnly();
        fi.setWritable(true);
        FileOutputStream fo = new FileOutputStream("D:\\JavaPrograms\\JavaIoStream\\Data.txt");


        
    }
    
}
