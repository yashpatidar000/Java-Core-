/*class util
{
static void sleep(long mills)
{try{
Thread.sleep(mills);
} 
catch(InterruptedException ex)
{}
}}*/

class Test{int i;}

class F extends Thread
{Test t;
F(Test t){this.t=t;}
   public void run()
{System.out.println("1:"+t.i);
 t.i=10;

   System.out.println("2:"+t.i);
 t.i=20;

 System.out.println("3:"+t.i);
 t.i=30;
}
}

class G extends Thread
{Test t;
G(Test t){this.t=t;}
   public void run()
{System.out.println("4:"+t.i);
 t.i=40;
 
   System.out.println("5:"+t.i);
 t.i=50;

 System.out.println("6:"+t.i);
 t.i=60;
}
}


public class M7 {
    public static void main(String[] args) {
       
       Test t=new Test();
       t.i=70;
        System.out.println("7:"+t.i);
       
        F f1=new F(t);
        f1.start();
        
        G g1=new G(t);
        g1.start();
         System.out.println("8:"+t.i);
        
    }
}
