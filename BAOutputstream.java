//program from byte array input stream

package JavaIoStream;

//here source of data is array
import java.io.*;

public class BAOutputstream {
    public static void main(String[] args) throws Exception
    {
       
       ByteArrayOutputStream bos = new ByteArrayOutputStream(20);
       bos.write('b');
       bos.write('c');
       bos.write('e');
       bos.write('g');

      /* byte b[] = bos.toByteArray();
       for(byte x:b)
       System.out.println((char)x);*/
       // to display all the inserted byte characters

       bos.writeTo(new FileOutputStream("D:/JavaPrograms/JavaIoStream/source1.txt"));
       //inserting the array to the file
            

       bos.close();

       //character array reader
       char c[] = {'a','b','c','d','e','f','g','h','i','j'};
       CharArrayReader cr = new CharArrayReader(c);

       int x;
        while((x=cr.read  ())!=-1){
            System.out.print((char)x);
        }

        //chararray writer
        CharArrayWriter cw = new CharArrayWriter(20);
       cw.write('b');
       cw.write('c');
       cw.write('e');
       cw.write('g');

    
       char b[] = cw.toCharArray();
       for(char i :b)
       System.out.println(i);

       
   }
    
}
