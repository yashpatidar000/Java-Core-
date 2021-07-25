
/*class P extends Thread {
    public void run()
    {
    for(int i=0;i<10;i++)
    {
        System.out.println(i);
    util.sleep(100);
    }
}
    class Q extends Thread {
    public void run()
    {
    for(int i=0;i<10;i++)
    {
        System.out.println(i);
    util.sleep(100);
    }
}
class uti{  
static void sleep(long millis)
{
try{
       Thread.sleep(100);
      }
       catch(InterruptedException ex)
       {
           System.out.println(ex);
       }
    
    }}

public class M19
{
    public static void main(String[] args) {
       P o1=new P();
       o1.start();
      for(int i=0;i<10;i++)
    {
        System.out.println(i);
    util.sleep(100);
    }
    
    System.out.println("end");
   }    
}


