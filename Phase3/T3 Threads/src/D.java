
class D extends Thread {
    
    public void run()
    {
    for(int i=0;i<10;i++)
    {System.out.println(i);}
    
    }
}

class M6
{
    public static void main(String[] args) {
        D d1=new D();
        d1.start();
        D d2=new D();
        d2.start();
        
        for(int i=10;i<20;i++)
    {System.out.println(i);}
    
    }
}
