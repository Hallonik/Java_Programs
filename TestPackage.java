import mypack1.Pack;
import mypack1.Pack2;
import mypack1.inner.Pack3;
class TestPackage
{
public static void main(String args[])
{
    Pack p1 = new Pack(); 
    p1.display();
    Pack2 p2 = new Pack2();
    p2.display();
    Pack3 p3 = new Pack3();
     p3.display();
}
}