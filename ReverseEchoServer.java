package Networking;

import java.net.*;
import java.io.*;

public class ReverseEchoServer {
    public static void main(String[] args) throws Exception 
    {
        ServerSocket ss = new ServerSocket(5000);
        Socket skt=ss.accept();

        BufferedReader br = new BufferedReader(new InputStreamReader(skt.getInputStream()));
       
        PrintStream ps = new PrintStream(skt.getOutputStream());

        String msg;

        StringBuilder sb;

        do{
            msg=br.readLine();
            System.out.println("From client : "+msg);
             sb = new StringBuilder(msg);
            sb.reverse();
            msg=sb.toString();
            
            ps.println(msg);

        }while(!msg.equals("dne"));

        skt.close();
        ss.close();

        
    }
    
}
