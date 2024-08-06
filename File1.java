package JavaIoStream;
import java.io.*;

public class File1 {
    public static void main(String[] args)//throws Exception
     {
       try{
        FileOutputStream fos =new FileOutputStream("D:/JavaPrograms/JavaIoStream/Test.txt");
        String str = " Learn Java Programming ";
         
        fos.write(str.getBytes());

        byte b[] = str.getBytes();

        fos.write(b,7,str.length()-7);

        for(byte x:b){
            fos.write(x);
        }


        fos.close();
    
       }
       catch(FileNotFoundException e){
        System.out.println(e);
       }
       catch(IOException e){
        System.out.println(e);
       }
    }
}
