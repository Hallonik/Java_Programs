package JavaIoStream;
import java.io.*;

public class FileStream2 {
    public static void main(String[] args)throws Exception
     {
        
        FileInputStream fis =new FileInputStream("D:/JavaPrograms/JavaIoStream/Test.txt");
        
        //read letters byte by byte
        int x;
        do{
            x=fis.read();
            System.out.print((char) x);
        }while(x!=-1);

        System.out.println();

        while((x=fis.read())!=-1){
            System.out.print((char) x);
            
        }



        byte b[]=new byte[fis.available()];
        fis.read(b);

        String str = new String();
        System.out.println(str);

        
        
     }

        
}
