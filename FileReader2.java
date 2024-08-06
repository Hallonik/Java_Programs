package JavaIoStream;

import java.io.FileInputStream;
import java.io.FileReader;

public class FileReader2 {
     public static void main(String[] args)throws Exception
     {
        
        FileReader fr =new FileReader("D:/JavaPrograms/JavaIoStream/Test.txt");
        int x;
        while((x=fr.read())!=-1){
            System.out.print((char) x);
            
        }
    }
}
