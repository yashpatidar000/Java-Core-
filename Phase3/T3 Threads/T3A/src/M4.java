
public class M4 {
    static Thread getThread()
    {
Thread t1=new Thread(){
public void run()
    {for(int i=0;i<10;i++)
    {System.out.println(i);}}};
    return t1;
}
    public static void main(String[] args) {
        Thread t=getThread();
        t.start();
    }

    
}