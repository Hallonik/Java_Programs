package Multithreading;


/*class MyRun implements Runnable
{
    public void run()
    {

    }
}*/

class MyThrd extends Thread
{
    public  MyThrd(String name)
    {
        super (name);
        //setPriority(Thread.MAX_PRIORITY-3);
    }
    public void run()
    {
        int count =1;
        while (true){
            System.out.println(count++ + " My Thread");
           /* try{
            Thread.sleep(100);//makes the thread sleep for a while
            }
            catch(InterruptedException e)
            {
                System.out.println(e);
            }*/
        }
    }
}

public class TestThrdConst {
    public static void main(String[] args) throws Exception 
     {
        //Thread t = new Thread(new MyRun(),"My Name"); creating anonymous object of runnable

       

     MyThrd t = new MyThrd("My Thread 1");
     //t.setDaemon(true);
     t.start();

     int count =1;
        while (true){
            System.out.println(count++ + " Main");

           // Thread.yield();//it will give more time to other threads
        
        }

     /*Thread mainThread = Thread.currentThread();
      mainThread.join();*/

     //try {Thread.sleep(100);}catch(Exception e){}   

      // t.interrupt();//interrupts sleeping thread

      /* System.out.println("ID : "+ t.threadId());
       System.out.println("Name : "+ t.getName());
       System.out.println("Priority : "+ t.getPriority());
       t.start();
       System.out.println("State : "+ t.getState());
       System.out.println("Alive ? " + t.isAlive());
      */
       
    }
    
}
