package Networking;


import java.net.*;
import java.io.*;

public class ReverseEchoClient {
    public static void main(String[] args) throws Exception 
    {
        Socket stk = new Socket("localhost",5000);

        //reading from keyboard
        BufferedReader keyb = new BufferedReader(new InputStreamReader(System.in));
        

        BufferedReader br = new BufferedReader(new InputStreamReader(stk.getInputStream()));
       
        PrintStream ps = new PrintStream(stk.getOutputStream());

        String msg;

        do{
            msg=keyb.readLine();
            
            ps.println(msg);

            msg=br.readLine();

            System.out.println("From Server : "+msg);


        }while(!msg.equals("dne"));

        stk.close();

        
    }

    
}
