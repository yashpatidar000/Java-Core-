
public class M {
    static class A extends Thread{
    public void run(){
    for(int i=0;i<10;i++)
    {System.out.println(i);}
    }
    }
    static class B implements Runnable{
    public void run(){
    for(int i=10;i<20;i++)
    {System.out.println(i);}
    }
    }
    
    public static void main(String[] args) {
        A a1=new A();
        a1.start();
        B b1=new B();
        Thread t1=new Thread(b1);
        t1.start();
        
        for(int i=20;i<30;i++)
    {System.out.println(i);}
    }
        
    }

