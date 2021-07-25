class B extends Thread
{public void run()
{System.out.println(1);
    try
        {Thread.sleep(10000);}
        catch(InterruptedException ex)
        {System.out.println(ex);}
    System.out.println(2);
}
}


public class M3 {
    public static void main(String[] args) {
        B b1=new B();
        
        b1.start();
        
        try
        {Thread.sleep(1000);}
        catch(InterruptedException ex)
        {System.out.println(ex);}
        
      
        System.out.println(b1.getState());
    }
}
