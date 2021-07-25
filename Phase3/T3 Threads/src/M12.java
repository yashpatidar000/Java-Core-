class J extends Thread {
    J()
    {}
    J(String name)
    {super(name);}
    public void run()
    {
        System.out.println(getName()+" : started");
    }
}
public class M12
{
    public static void main(String[] args) {
       J o1=new J();
       J o2=new J();
       J o3=new J();
       o1.start();
       o2.start();
       o3.start();
       J o4=new J("aaa");
       J o5=new J("bbb");
       J o6=new J("ccc");
       o4.start();
       o5.start();
       o6.start();
    }
}
