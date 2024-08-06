package CollectionFrameworks;

import java.util.*;
import java.io.*;

public class StringTokenizerDemo {

    public static void main(String[] args)throws Exception {
        String data = "name=Vijay address=kolkata,country= India;dept=CSE";
        
        StringTokenizer stk = new StringTokenizer(data,"=;, ");

        String s;
        while(stk.hasMoreTokens()){
            s=stk.nextToken();
            System.out.println(s);            
        }

        System.out.println();
        System.out.println("Reading from file StudentDetail ");


        //taking data from file and separating tokens using delimiters

        FileInputStream fis = new FileInputStream("D:/JavaPrograms/CollectionFrameworks/StudentDetail.txt");
       byte b[] = new byte[fis.available()];
        fis.read(b);

        String dt = new String(b);
        StringTokenizer stk1 = new StringTokenizer(dt,"=");
        String str;
        while(stk1.hasMoreTokens()){
            str=stk1.nextToken();
            System.out.println(str);            
        }

        System.out.println();
        System.out.println("Reading from file Data ");



        FileInputStream fis2 = new FileInputStream("D:/JavaPrograms/CollectionFrameworks/Data.txt");
        byte bi[] = new byte[fis2.available()];
         fis2.read(bi);
 
         String dta = new String(bi);
         StringTokenizer stk2 = new StringTokenizer(dta,".,");
         String str1;
         ArrayList<Integer> al = new ArrayList<>();
         while(stk2.hasMoreTokens()){
             str1=stk2.nextToken();
             al.add(Integer.valueOf(str1));
                         
         }
         System.out.println(al);    


        
    }
}
