class A1
{
synchronized void test()
{for(int i=0;i<5;i++)
{System.out.println(i);}
    }        
}
public class MM {
    public static void main(String[] args) {
        A1 a=new A1();
        Thread t1=new Thread()
        {public void run(){a.test();}};
        Thread t2=new Thread()
        {public void run(){a.test();}};
        
        t1.start();
        t2.start();
        
    }
}
