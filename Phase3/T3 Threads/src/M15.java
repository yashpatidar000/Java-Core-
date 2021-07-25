class M extends Thread {
    public void run()
    {
    for(int i=0;i<3000;i++)
    {
        System.out.println(i);}
    
    }
}
public class M15
{
    public static void main(String[] args) {
       M o1=new M();
       o1.setDaemon(true);
       o1.start();
        System.out.println("end");
    }
}

