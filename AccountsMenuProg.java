package CollectionFrameworks;

// implementation of hashmap 

import java.io.*;
import java.util.*;

class Account implements Serializable{
    String accno;
    String name;
    double balance;
    
    Account(){     

    }
    Account(String a,String n,double b){
        name = n;
        accno=a;
        balance=b;
    }
    public String toString(){
        return "\nAccount No. : "+accno+"\nName : "+name+"\nBalance : "+balance+"\n";

    }

}


public class AccountsMenuProg {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner (System.in);

        Account ac = null;
        HashMap<String,Account> hm = new HashMap<>();

        try {//brings contents from file and storing it in hash map
            FileInputStream fis = new FileInputStream("D:\\JavaPrograms\\CollectionFrameworks\\AccountDetails.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);

            int count = ois.readInt();
            for(int i=0;i<count;i++)
            {
                ac=(Account)ois.readObject();
                System.out.println(ac);
                hm.put(ac.accno, ac);
            }
            ois.close();
            fis.close();
        }
        catch(Exception e){//if file not present : exception is handled
        System.out.println(e);}


        FileOutputStream fos = new FileOutputStream("D:\\JavaPrograms\\CollectionFrameworks\\AccountDetails.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        System.out.println("\nMenu\n");
        int choice;
        String accno;
        String name;
        double balance;
        do{
            System.out.println("1. Create Account ");
            System.out.println("2. Delete Account ");
            System.out.println("3. View Account ");
            System.out.println("4.. View All Accounts ");
            System.out.println("5. Save Accounts ");
            System.out.println("6. Exit ");
            System.out.println("Enter your choice :  ");
            choice = sc.nextInt();
           
            
           sc.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");//ignore any new new line characters or carriage returns

            switch(choice){
                case 1 : {
                
                    System.out.println("Enter Details : AccNo , Name , Balance ");
                    System.out.println("AccNo : ");
                    accno=sc.nextLine();
                    System.out.println("Name : ");
                    name = sc.nextLine();
                    System.out.println("Balance : ");
                    balance = sc.nextDouble();
                    ac = new Account(accno,name,balance);
                    hm.put(accno, ac);
                    System.out.println("Account created for "+name);

                    break;}

                case 2:{
                  System.out.print("Enter account no. : ");
                  accno=sc.nextLine();
                  hm.remove(accno);
                  break;}

                case 3:{
                  System.out.print(" Enter AccNo : ");
                  accno = sc.nextLine();
                  ac = hm.get(accno);
                  System.out.println(ac);
                  break;}

                case 4:{
                 for(Account a:hm.values())
                 System.out.println(a);
                 break;}

                case 5 :
                case 6:
                  { oos.writeInt(hm.size());

                   for(Account a : hm.values())
                   oos.writeObject(a);
                   System.out.println("Saved And Exit !");
                   break;}

                default:
                  System.out.println("Enter a valid input !!");               
            
               
            }

        }while(choice!=6);

        oos.close();
        oos.flush();
        fos.close();

                
    }
    
}
