class A
{
synchronized void test()
{for(int i=0;i<5;i++)
{System.out.println(i);}
    }        
}

class B extends Thread
{
A obj;
B(A obj)
{this.obj=obj;}
public void run()
{obj.test();}
}

class C extends Thread
{
A obj;
C(A obj)
{this.obj=obj;}
public void run()
{obj.test();}
}

/*public class M {
    public static void main(String[] args) {
        A a1=new A();
        B b1=new B(a1);
        C c1=new C(a1);
        b1.start();
        c1.start();
    }
}*/
public class M {
    public static void main(String[] args) {
        A a1=new A();
        A a2=new A();
        B b1=new B(a1);
        C c1=new C(a2);
        b1.start();
        c1.start();
    }
}