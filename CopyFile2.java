package JavaIoStream;
 

import java.io.*;

public class CopyFile2 {

    public static void main(String[] args)  throws Exception
    {
        
        FileInputStream fis1 = new FileInputStream("D:/JavaPrograms/JavaIoStream/source1.txt");
        FileInputStream fis2 = new FileInputStream("D:/JavaPrograms/JavaIoStream/Source2.txt");

        FileOutputStream fos = new FileOutputStream("D:/JavaPrograms/JavaIoStream/Destination.txt");
        
        SequenceInputStream sis = new SequenceInputStream(fis1,fis2);//to input the files in sequense
        //i.e. one afte another
        //first read data from file 1 then from file 2

        int b;
        while((b=sis.read())!=-1){
           fos.write(b);
        }
        sis.close();
        fis1.close();
        fis2.close();
        fos.close();
    }
    
    
}
