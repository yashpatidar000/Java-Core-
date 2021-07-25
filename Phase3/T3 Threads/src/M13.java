class K extends Thread {
   
    public void run()
    {for (int i=0;i<10;i++)
    {
        System.out.println(getName()+":"+i);
    }
    }
}
public class M13
{
    public static void main(String[] args) {
       K o1=new K();
       o1.setName("test");
       o1.start();
        System.out.println("end");
       
    }
}

