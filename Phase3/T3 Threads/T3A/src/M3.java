
public class M3 {
    public static void main(String[] args)
    {
        new Thread()
        {public void run()
            {for(int i=0;i<10;i++)
                 {System.out.println(i);}}
    }.start();
        
        Thread t1=new Thread(new Runnable()
            {public void run()
            {
                for(int i=0;i<10;i++)
                 {System.out.println(i);}}});
        t1.start();
        
   
}
}
