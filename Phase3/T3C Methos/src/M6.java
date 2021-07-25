class E extends Thread
{
   public void run()
{System.out.println(1);
    try
        {Thread.sleep(2000);}
        catch(InterruptedException ex)
        {System.out.println(ex);}
   
}
}


public class M6 {
    public static void main(String[] args) {
       
        E d1=new E();
       d1.start();
        
        try
        {Thread.sleep(1000);}
        catch(InterruptedException ex)
        {System.out.println(ex);}
       System.out.println(d1.getState());
       d1.stop();
         try
        {Thread.sleep(1000);}
        catch(InterruptedException ex)
        {System.out.println(ex);}
       System.out.println(d1.getState());
        
    }
}
