class C extends Thread
{public synchronized void run()
{System.out.println(1);
    try
        {wait();}
        catch(InterruptedException ex)
        {System.out.println(ex);}
    System.out.println(2);
}
}


public class M4 {
    public static void main(String[] args) {
        C b1=new C();
        
        b1.start();
        
        try
        {Thread.sleep(3000);}
        catch(InterruptedException ex)
        {System.out.println(ex);}
       System.out.println(b1.getState());
       synchronized(b1)
       {b1.notify();}
        System.out.println("done");
    }
}
