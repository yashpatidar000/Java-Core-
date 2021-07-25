
class C extends Thread {
    
    public void run()
    {
    for(int i=0;i<10;i++)
    {System.out.println(i);
    if(i==5)
    {int k=i/0;}
    }
    }
}

class M55
{
    public static void main(String[] args) {
        C c1=new C();
        c1.start();
        for(int i=10;i<20;i++)
    {System.out.println(i);}
    
    }
}
