package CollectionFrameworks;
import java.util.*;

public class ArraylistDemo {
    public static void main(String[] args) {
        
        ArrayList <Integer> al1 = new ArrayList<>(20);

        ArrayList<Integer> al2 = new ArrayList<>(List.of(50,60,70,80,90,70));
        al1.add(10);
        al1.add(0,12);

        al1.addAll(1,al2);

        System.out.println(al1.contains(25));

        System.out.println(al1.get(5));

        System.out.println(al1.indexOf(70));

        System.out.println(al1.lastIndexOf(70));

        al1.set(5, 120);

        //iterating  over arraylist
        //met1
         for(int i=0;i<al1.size();i++){
            System.out.println(al1.get(i));
         }
         System.out.println();
         //met2
         for(Integer x : al1)
         System.out.println(x);
         System.out.println();

         Iterator<Integer> it = al1.iterator();//iterator allows bidirectional access

         while (it.hasNext()) {
            System.out.println(it.next());
            
         }
         System.out.println();

         al1.forEach(n->System.out.println(n));

         System.out.println();

         al1.forEach(n->show(n));

         System.out.println();


        //al1.clear();

        System.out.println(al1);

    }

    static void show(int n){
        if(n>60)
        System.out.println(n);
    }
    
}
