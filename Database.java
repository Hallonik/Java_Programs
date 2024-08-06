import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class Database {
    public static void main(String[] args)throws Exception {

       
   Class.forName("org.sqlite.JDBC");
   Connection con = DriverManager.getConnection("jdbc:sqlite:D://JavaPrograms//Sqlite//univ.db");
       Statement stm = con.createStatement();
        ResultSet rs = stm.executeQuery("select * from dept");

     int dno=0;
        String dnme="";

        while(rs.next())
        {
            dno= rs.getInt("DEPTNO");
            dnme = rs.getString("DNAME");

            System.out.println(dno +"  "+dnme);


        }


       

    }
    
}
