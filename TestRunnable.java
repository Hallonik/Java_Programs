package Multithreading;

class MyRunnable implements Runnable
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


public class TestRunnable {

    public static void main(String[] args) {
        MyRunnable tr = new MyRunnable();
        Thread t = new Thread(tr);
        t.start();
        int i=1;
        while(true)
        {
            System.out.println(i+" World");
            i++;
        }

    }
    
}


/*  // another method to implement runnable

public class TestRunnable implements Runnable
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
        TestRunnable tr = new TestRunnable();
        Thread th = new Thread(tr);
        th.start();
        int i=1;
        while(true)
        {
            System.out.println(i+" World");
            i++;
        }

    }
}
 */
 
