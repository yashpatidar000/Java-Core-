
public class M2 {
    public static void main(String[] args)
    {
        Thread t1=new Thread()
        {public void run()
            {for(int i=0;i<10;i++)
                 {System.out.println(i);}}
        };
        t1.start();
                
       Runnable r1=new Runnable()
       {public void run()
            {
            for(int i=10;i<20;i++)
                 {System.out.println(i);}}
           };
       Thread t2=new Thread(r1);
         t2.start(); 
         for(int i=20;i<30;i++)
                 {System.out.println(i);}
    }
    }
