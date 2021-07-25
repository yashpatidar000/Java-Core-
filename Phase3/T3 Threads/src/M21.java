class Test{
static void print()
{Thread t=Thread.currentThread();
    System.out.println(t.getName());
    System.out.println(t.getId());
    System.out.println(t.getPriority());
    System.out.println(t.isDaemon());
    System.out.println("-----");
}
}
class R extends Thread{
public void run()
{
Test.print();
}
}
public class M21 {
    public static void main(String[] args) {
       R r1=new R();
       r1.start();
       try {
       Thread.sleep(1000);
       }
       catch(InterruptedException ex)
       {System.out.println(ex);}
       Test.print();
    }
}
