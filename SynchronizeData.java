package Multithreading;

class mdata 
{
   
    public void display(String str)
    {
        synchronized(this)
        {
            //critical section
        for (int i =0 ; i<str.length();i++){
            System.out.print(str.charAt(i));
            try{
                Thread.sleep(100);
            }
            catch(Exception e) {}
        }
     }
    }
 
}

class MyThread1 extends Thread{
    mdata d;
    public MyThread1(mdata d){
        this.d = d;
    }
    public void run(){
        d.display("H e l l o  W o r l d");
    }
}

class MyThread2 extends Thread{
    mdata d;
    public MyThread2(mdata d){
        this.d = d;
    }
    public void run(){
        d.display("W e l c o m e  A l l");
    }
}

public class SynchronizeData {
    public static void main(String[] args) {

        mdata d = new mdata();
        MyThread1 t1 = new MyThread1(d);
        MyThread2 t2 = new MyThread2(d);

        t1.start();
        t2.start();

        
    }
    
}
