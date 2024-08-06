package JavaIoStream;

import java.io.*;


public class BufferedStream {
    public static void main(String[] args) throws Exception
     {
        //use of BUFFERED INPUT STREAM
        FileInputStream fis = new FileInputStream("D:/JavaPrograms/JavaIoStream/Test.txt");
        BufferedInputStream bis = new BufferedInputStream(fis);

        /*int x;
        while((x=bis.read())!=-1){
            System.out.print((char)x);
        }*/
        System.out.println();

        System.out.print((char)bis.read());
        System.out.print((char)bis.read());
        System.out.print((char)bis.read());
        bis.mark(10);
        System.out.print((char)bis.read());
        System.out.print((char)bis.read());
        bis.reset();
        System.out.print((char)bis.read());
        System.out.print((char)bis.read());

        //System.out.println(fis.markSupported()); - false
        //System.out.println(bis.markSupported()); - true

        //use of buffered reader
        FileReader fr = new FileReader("D:/JavaPrograms/JavaIoStream/Destination.txt");
        BufferedReader br=new BufferedReader(fr);

        System.out.println();

        System.out.print((char)br.read());
        System.out.print((char)br.read());
        System.out.print((char)br.read());
        br.mark(8);
        System.out.print((char)br.read());
        System.out.print((char)br.read());
        br.reset();
        System.out.print((char)br.read());
        System.out.print((char)br.read());

        System.out.println();

       System.out.println("String : "+br.readLine());


    }
    
}
