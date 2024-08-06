
package databaseconnect;

import java.sql.*;
import java.util.*;

public class DBconnect2 {


    public static void main(String args[])throws Exception
    {
        
        Class.forName("org.sqlite.JDBC");//invoking a driver
        
        Connection con = DriverManager.getConnection("jdbc:sqlite:D://JavaPrograms//Sqlite//univ.db");
        
      // PreparedStatement stm = con.prepareStatement("insert into students values(?,?,?,?)");
       
      // stm.executeUpdate("insert into dept values (60,'AIML')");
       
    //  stm.executeUpdate("insert into dept values (70,'Chem')");
    
    // stm.executeUpdate("delete from dept where deptno > 50");
    
   // stm.executeUpdate("update dept set dname = 'AIML' where deptno = 50");
   
   /*   Scanner sc = new Scanner (System.in);
      System.out.println("Enter student Data : ");
      int r = sc.nextInt();
      String name = sc.next();
      String city = sc.next();
      int dno = sc.nextInt();
      
      stm.setInt(1, r);
      stm.setString(2,name);
      stm.setString(3,city);
      stm.setInt(4,dno);
      
      stm.executeUpdate();*/
   
   Statement stm = con.createStatement();
   
  // stm.executeUpdate("create table Temp(a integer,b float)");
   
  
  stm.executeUpdate("drop table Temp");

   
       stm.close();
       con.close();
           
      
       
    }
}
