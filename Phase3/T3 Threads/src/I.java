
class I extends Thread {
    
    public void run()
    {
   {System.out.println("something");}
    }
    
}

class M11
{
    public static void main(String[] args) {
        I i1=new I();
       i1.run();
        i1.run();
         i1.run();
         i1.start();
        
{System.out.println("done");}
    
    }
}
