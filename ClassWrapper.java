public class ClassWrapper {
    public static void main(String[] args) {
        
        Integer i=new Integer(10);//avoid writing like this
        Integer a=Integer.valueOf(10);
        Integer b=10;
        
        Byte c=15;
        Byte d=Byte.valueOf("15");
        
        
        Short f=Short.valueOf("123");
        
        Float g=12.3f;

        
        Double j=Double.valueOf(123.456);
        
        Character k=Character.valueOf('A');
        
        Boolean l=Boolean.valueOf("true");
        
        byte bb=15;
        Byte e=Byte.valueOf(bb);
        
        Float h=Float.valueOf("123.5");
        float x=h.floatValue();
        float y=h;
        
        int m=10;
        //Integer n=Integer.valueOf(m);//Boxing
        Integer n=m;//Autoboxing
        //int p=n.intValue();//Unboxing
        int p=n;//autounboxing
    }
    
}
