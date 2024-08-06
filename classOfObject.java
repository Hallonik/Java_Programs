class MyObject
{
    public String toString()
    {
        return "My Object";
    }
    
    public int hashCode()
    {
        return 100;
    }
    public boolean equals(Object o)
    {
        return this.hashCode()==o.hashCode();
    }
    /* public void notify(){}
    public void wait(){}

    these methods can not be overridden cos the are final */
    
}





public class classOfObject {
    public static void main(String[] args) 
    {
        MyObject o1=new MyObject();
        MyObject o2=new MyObject();
        
        System.out.println(o1.equals(o2));//checks the objects based on hash code
    }

    
}
