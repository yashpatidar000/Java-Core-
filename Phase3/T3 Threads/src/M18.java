public class M18
{
    public static void main(String[] args) {
       System.out.println("end");
       for (int i=0;i<10;i++){
           System.out.println(i);
      try{
       Thread.sleep(100);
      }
       catch(InterruptedException ex)
       {
           System.out.println(ex);
       }
       }
    
   }    
}