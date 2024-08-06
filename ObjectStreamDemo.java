package JavaIoStream;

import java.io.*;

class Studnt implements Serializable
{
    private int rollno;
    private String name;
    private float avg;
    private String dept;
    public static int Data = 10;
    public transient int t;

    public Studnt(){  }

    public Studnt(int r,String n, float a,String d)
    {
        rollno=r;
        name=n;
        avg=a;
        dept=d;
        Data=500;//these will not be stored
        t=500;//these will not be stored
    }

    public String toString(){
        return "\nStudent Details\n"+"\nRoll : "+rollno+
              "\nName : "+name+"\nAverage : "+avg+
              "\nDept : "+dept+"\nData : "+Data +
              "\nTransient : "+t+"\n";
    }
}

public class ObjectStreamDemo {

    public static void main(String[] args) throws Exception
    {
        //writing object in file
        FileOutputStream fos = new FileOutputStream("D:\\JavaPrograms\\JavaIoStream\\Student3.txt");

        ObjectOutputStream oos =new ObjectOutputStream(fos);

        Studnt s = new Studnt(10,"John",89.90f,"CSE");
        oos.writeObject(s);
        fos.close();
        oos.close();

        //read object from file
        FileInputStream fis = new FileInputStream("D:\\JavaPrograms\\JavaIoStream\\Student3.txt");

        ObjectInputStream ois =new ObjectInputStream(fis);

        Studnt si ;
        si=(Studnt)ois.readObject();
        System.out.println(si);
        fis.close();
        ois.close();

    }
    
}
