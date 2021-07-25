class D extends Thread
{
    Thread t;
    D(Thread t)
    {this.t=t;}
    
    public void run()
{System.out.println(1);
    try
        {Thread.sleep(1000);}
        catch(InterruptedException ex)
        {System.out.println(ex);}
    System.out.println(t.getState());
    System.out.println(2);
}
}


public class M5 {
    public static void main(String[] args) {
        Thread main=Thread.currentThread();
        D d1=new D(main);
        
        d1.start();
        
        try
        {d1.join();}
        catch(InterruptedException ex)
        {System.out.println(ex);}
       
        System.out.println("done");
    }
}
