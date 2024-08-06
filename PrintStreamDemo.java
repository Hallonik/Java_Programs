package JavaIoStream;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;

class Student
{
    int rollno;
    String name;
    String dept;
}
public class PrintStreamDemo {
     public static void main(String[] args) throws Exception
    {

        // writing in a file
        FileOutputStream fos=new FileOutputStream("D:\\JavaPrograms\\JavaIoStream\\Student1.txt");
        PrintStream ps=new PrintStream(fos);
        
        
        Student s=new Student();
        s.rollno=10;
        s.name="John";
        s.dept="CSE";
        
        ps.println(s.rollno);
        ps.println(s.name);
        ps.println(s.dept);
        
        ps.close();
        fos.close();

        //taking output or reading from file

        FileInputStream fis=new FileInputStream ("D:\\JavaPrograms\\JavaIoStream\\Student1.txt");
        BufferedReader br    = new BufferedReader(new InputStreamReader(fis));     

        Student s1=new Student();
        s1.rollno=Integer.parseInt(br.readLine());
        s1.name=br.readLine();
        s1.dept=br.readLine();

        System.out.println("Roll no : "+ s1.rollno);
        System.out.println("Name : "+ s1.name);
        System.out.println("Dept : "+ s1.dept);

        br.close();
        fis.close();
        
    }    
    
}
