package JavaIoStream;
import java.io.*;
import java.util.*;

class Customer implements Serializable{
    String custID;
    String name;
    String phone;

    static int count=0;

    Customer(){}

    Customer(String n,String p){
        custID = "C"+count;
        name = n;
        phone = p;
        count++;
    }
    public String toString(){
        return "CustomerID : "+custID+"\nName : "+
        name+"\nPhoneNo : "+phone+"\n";
    }
}

public class SerializeCustomer {
    public static void main(String[] args)throws Exception
    {
        //writing customer details in file
        Customer lst[]={new Customer("Akash","30829752342"),new Customer("Kisan","30342695342"),new Customer("Kunal","12479672342")};


        FileOutputStream fos =new FileOutputStream("D:\\JavaPrograms\\JavaIoStream\\Customer.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        oos.writeInt(lst.length);
        for (Customer x:lst){
            oos.writeObject(x);
        }
        oos.close();fos.close();

        //reading customer details from file

        Scanner sc = new Scanner (System.in);
        
        FileInputStream fis = new FileInputStream("D:\\JavaPrograms\\JavaIoStream\\Customer.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        int length = ois.readInt();
        Customer list[]=new Customer[length];
        for(int i=0;i<length;i++)
        {
            list[i]=(Customer)ois.readObject();
        }

        // Searching a customer with name taking input from keyboard

        System.out.println("Enter the name of Customer : ");
        String name =sc.nextLine();
        int f=0;
        for(int i=0;i<length;i++){
            if(name.equalsIgnoreCase(list[i].name)){
            System.out.println(list[i]);
            f=1;break;   }
            
        }
        if(f==0){System.out.println(name + " not present .");}

        ois.close();fis.close();sc.close();
        
    }
    
}
