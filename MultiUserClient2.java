package Networking;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;

public class MultiUserClient2 {
     public static void main(String[] args) throws Exception 
    {

        Socket stk = new Socket("localhost",5000);
        System.out.println("Enter your message : ");

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
