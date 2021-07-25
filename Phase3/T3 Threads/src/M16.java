class N extends Thread {
    public void run()
    {
    for(int i=0;i<30;i++)
    {
        System.out.println(i);}
    
    }
}
public class M16
{
    public static void main(String[] args) {
       N o1=new N();
       o1.start();
       
       
       try{
       o1.join();
       }
       catch(InterruptedException ex)
       {System.out.println(ex);}
    
    System.out.println("end");
   }    
}

