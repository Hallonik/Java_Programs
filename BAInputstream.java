//program from byte array input stream

package JavaIoStream;

//here source of data is array
import java.io.*;

public class BAInputstream {
    public static void main(String[] args) throws Exception
     {
        byte b[] = {'a','b','c','d','e','f','g','h','i','j'};

        ByteArrayInputStream bis = new ByteArrayInputStream(b);

       /* int x;
        while((x=bis.read  ())!=-1){
            System.out.print((char)x);
        }  */

        String str= new String(bis.readAllBytes());
        System.out.print(bis.markSupported());


        bis.close();
    }
    
}
