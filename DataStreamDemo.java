package JavaIoStream;

 import java.io.*;



class Studenti
{
    int rollno;
    float avg;
    String name;
    String dept;
    
}

public class DataStreamDemo {
    public static void main(String[] args)throws Exception
    {
        //writing in a file
        FileOutputStream fos=new FileOutputStream("D:\\JavaPrograms\\JavaIoStream\\Student2.txt");
        DataOutputStream dos=new DataOutputStream(fos);
        
        Studenti s1=new Studenti();
        s1.rollno=10;
        s1.avg=80.5f;
        s1.name="John";
      
        s1.dept="CSE";
       
        dos.writeInt(s1.rollno);
       dos.writeFloat(s1.avg);
        dos.writeUTF(s1.name);
        dos.writeUTF(s1.dept);
       
      
        dos.close();
        fos.close();
        
        
        //reading from file
        FileInputStream fis=new FileInputStream("D:\\JavaPrograms\\JavaIoStream\\Student2.txt");
        DataInputStream dis=new DataInputStream(fis);
        
        Studenti s=new Studenti();
        
        s.rollno=dis.readInt();
        s.avg=dis.readFloat();
        
        s.name=dis.readUTF();
        
        s.dept=dis.readUTF();
      
        
        System.out.println("Roll no "+s.rollno);
        System.out.println("Name "+s.name);
       System.out.println("Average "+s.avg);
        System.out.println("Dept "+s.dept);
        
        
        dis.close();
        fis.close();
    }

}
