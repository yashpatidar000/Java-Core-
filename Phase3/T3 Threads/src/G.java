
class G extends Thread {
    
    public void run()
    {
   {System.out.println("child");}
    }
    void test()
    {start();}
}

class M7
{
    public static void main(String[] args) {
        G g1=new G();
        g1.test();
{System.out.println("done");}
    
    }
}
