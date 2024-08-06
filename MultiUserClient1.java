package Networking;
import java.net.*;
import java.io.*;


public class MultiUserClient1 {
    public static void main(String[] args) throws Exception 
    {

        Socket stk = new Socket("localhost",5000);

 

        BufferedReader br = new BufferedReader(new InputStreamReader(stk.getInputStream()));
       
        PrintStream ps = new PrintStream(stk.getOutputStream());

        String msg;

        do{
             //reading from keyboard
            System.out.println("Enter your message : ");
            BufferedReader keyb = new BufferedReader(new InputStreamReader(System.in));
       
            
            msg=keyb.readLine();
            
            ps.println(msg);

            msg=br.readLine();

            System.out.println("From Server : "+msg);


        }while(!msg.equals("dne"));

        stk.close();

        
    }
    
}
