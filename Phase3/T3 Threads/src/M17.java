
class O extends Thread {
    public void run()
    {
    for(int i=0;i<10;i++)
    {
        System.out.println(i);
     try{
       sleep(100);
      }
       catch(InterruptedException ex)
       {
           System.out.println(ex);
       }
    
    } 
    }
}
public class M17
{
    public static void main(String[] args) {
       O o1=new O();
       o1.start();
     
    
    System.out.println("end");
   }    
}


