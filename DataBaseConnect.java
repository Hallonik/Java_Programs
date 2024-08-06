
package databaseconnect;

import java.sql.*;
import java.util.*;

public class DataBaseConnect {


    public static void main(String[] args)throws Exception
    {
        
        Class.forName("org.sqlite.JDBC");//invoking a driver
        
        Connection con = DriverManager.getConnection("jdbc:sqlite:D://JavaPrograms//Sqlite//univ.db");
        
       // Statement stm = con.createStatement();
       
       PreparedStatement stm = con.prepareStatement("select * from students where deptno =?");
       
       Scanner sc = new Scanner (System.in);
       
       System.out.println("Enter Dept no : ");
       int dno = sc.nextInt();
       
       stm.setInt(1,dno);
       
       ResultSet res = stm.executeQuery();
        
        
        //ResultSet res = stm.executeQuery("select * from students");
        
        while(res.next())
        {
            System.out.print (res.getInt("roll")+",");
             System.out.print (res.getString("name")+",");
              System.out.print (res.getString("city")+",");
               System.out.print (res.getInt(4)+",");      
               System.out.println();
            
        }
        
        stm.close();
        con.close();       
        
        
        
    }
    
}
