package Networking;

import java.net.*;
import java.io.*;




public class MultiUserServer extends Thread {
    Socket skt;
    static int count =1;

    public MultiUserServer(Socket st){
        skt = st;
    }

    public void run(){
        try{
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
    }catch(Exception e){}

           

    }
     public static void main(String[] args) throws Exception 
    {
     ServerSocket ss = new ServerSocket(5000);
        Socket skt;
        
        MultiUserServer mus;

        do{

        skt=ss.accept();
        System.out.println("Client Connected ..."+ count);
        mus = new MultiUserServer(skt);
        mus.start();
        count++;
        }while(true);
      
    }       
    
}
