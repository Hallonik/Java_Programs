package Multithreading;
class MyThread extends Thread
{
    public void run()
    {
        int i=1;
        while(true)
        {
            System.out.println(i+" Hello");
            i++;
        }
    }
}



public class ThreadTest
{
    public static void main(String [] args)
    {
        MyThread th = new MyThread();
        th.start();
        int i=1;
        while(true)
        {
            System.out.println(i+" World");
            i++;
        }

    }
}

/* //another method to write thread class
public class ThreadTest extends Thread
{
 public void run()
    {
        int i=1;
        while(true)
        {
            System.out.println(i+" Hello");
            i++;
        }
    }

    public static void main(String [] args)
    {
        ThreadTest th = new ThreadTest();
        th.start();
        int i=1;
        while(true)
        {
            System.out.println(i+" World");
            i++;
        }

    }
}*/

 
 