import java.lang.reflect.*;

class My{
    private int a;
    protected int b;
    public int c;
    int d;
    public My(){}

    public My(int x , int y){}

    public void display (String s1, String s2){}

    public int show (int x , int y){return 0;}

}

public class ReflectionClassPack {
    public static void main(String [] args){
        
        Class c = My.class;//without creating object
        My m = new My();//after creating object getting the class
        Class  c1 = m.getClass();

        Field f[] = c.getDeclaredFields();

        System.out.println();
        System.out.println("Fields - ");

        for(Field fi:f)
        System.out.println(fi);

        System.out.println();
        System.out.println("Constructors - ");

        Constructor con[] = c.getConstructors();

        for(Constructor x :con)
        System.out.println(x);

        System.out.println();
        System.out.println("Methods - ");

        Method met[] = c.getMethods();

        for(Method x :met)
        System.out.println(x);

        System.out.println();
        System.out.println("Parameters - ");

        Parameter par[] = met[0].getParameters();

        for(Parameter y :par)
        System.out.println(y);

        System.out.println();
        System.out.println();
        System.out.print("Class Name - ");

        System.out.println(c.getName());
    }
    
}
