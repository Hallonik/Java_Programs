package CollectionFrameworks;

// this class  inheerits  from hashtable
//in Property we can only store String type of key & value pair

import java.util.*;
import java.io.*;

public class PropertyClassDemo {

    public static void main(String[] args) throws Exception{

        Properties p = new Properties();
        p.setProperty("Brand","HP");
        p.setProperty("Processor","Amd Ryzen 7");
        p.setProperty("OS", "Windows 11");
        p.setProperty("Model" ,"Omen");

        p.store(new FileOutputStream("D:/JavaPrograms/CollectionFrameworks/MyLaptopData.txt"), "Laptop");
        p.storeToXML(new FileOutputStream("D:/JavaPrograms/CollectionFrameworks/MyLaptopData.xml"), "Laptop");
        
     p.loadFromXML(new FileInputStream("D:/JavaPrograms/CollectionFrameworks/PersonData.xml"));


        System.out.println(p.getProperty("Name"));

        p.load(new FileInputStream("D:/JavaPrograms/CollectionFrameworks/MyLaptopData.txt"));
        System.out.println(p.getProperty("Brand"));

        System.out.println(p);

        
    }
    
}
