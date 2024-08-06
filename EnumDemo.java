enum Dept
{
    CS("John","Block A"),IT("Smith","Block B"),CIVIL("Srinivas","Block C"),ECE("Dave","Block D");
    
    String head;
    String location;
    
    private Dept(String head,String loc)
    {
        this.head=head;
        this.location=loc;
    }
    public String getHeadName()
    {
        return head;
    }
    public String getLocation()
    {
        return location;
    }
}

public class EnumDemo {

    public static void main(String[] args) 
    {
       Dept d1 = Dept.CIVIL;
       System.out.println("Index : "+d1.ordinal());
       System.out.println(d1.valueOf("IT"));


       switch (d1){
        case CS : System.out.println("Head : Mac \n Block : A");
        case IT : System.out.println("Head : Sristi \n Block : B");
        case CIVIL : System.out.println("Head : John \n Block : C");
        case ECE : System.out.println("Head : Drake \n Block : D");
       }

       System.out.println();

       Dept list [] = Dept.values();
       for (Dept x : list)
       System.out.println(x);

       System.out.println();
 
       
        Dept d=Dept.CS;
                
        System.out.println(d.getHeadName());
        System.out.println(d.getLocation());
        
        
        
    }   
    
}
