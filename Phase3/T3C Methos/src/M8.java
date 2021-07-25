class util
{
static void sleep(long mills)
{try{
Thread.sleep(mills);
} 
catch(InterruptedException ex)
{}
}}


class H extends Thread
{ThreadLocal local;
    H(ThreadLocal local)  
    {this.local=local;}
    public void run()
    {
        System.out.println("1:" + local.get());
        local.set(10);
        util.sleep(1000);
        System.out.println("2:" + local.get());
        local.set(20);
        util.sleep(1000);
        System.out.println("3:" + local.get());
        local.set(30);
    }
}

class I extends Thread
{ThreadLocal local;
    I(ThreadLocal local)  
    {this.local=local;}
    public void run()
    {
        System.out.println("4:" + local.get());
        local.set(40);
        util.sleep(1000);
        System.out.println("5:" + local.get());
        local.set(50);
        util.sleep(1000);
        System.out.println("6:" + local.get());
        local.set(60);
    }
}


public class M8 {
    public static void main(String[] args) {
       
       ThreadLocal local=new ThreadLocal();
       local.set(70);
        System.out.println("7:"+local.get());
        
       
        H h1=new H(local);
        h1.start();
        I i1=new I(local);
        i1.start();
        
        System.out.println("8:"+local.get());
        
    }
}
