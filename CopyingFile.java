package JavaIoStream;


//copying context of one file to another


import java.io.FileInputStream;
import java.io.FileOutputStream;

public class CopyingFile {
    public static void main(String[] args)  throws Exception
    {
        
        FileInputStream fis = new FileInputStream("D:/JavaPrograms/JavaIoStream/source1.txt");
        FileOutputStream fos = new FileOutputStream("D:/JavaPrograms/JavaIoStream/Source2.txt");

        int b;
        while((b=fis.read())!=-1){
            if(b>=65 && b<=90)fos.write(b+32);
            else fos.write(b);
        }
        fis.close();
        fos.close();
    }
    
}
