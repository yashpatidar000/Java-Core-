class Shared{
void test1()
{
for (int i=0;i<3;i++)
{System.out.println(i);}
synchronized(this)
{for (int i=3;i<6;i++)
{System.out.println(i);}}
for (int i=6;i<9;i++)
{System.out.println(i);}
}
}
class A11 extends Thread
{
Shared s1;
A11(Shared s1)
{this.s1=s1;}
public void run()
{s1.test1();}
}

class B1 extends Thread
{
Shared s1;
B1(Shared s1)
{this.s1=s1;}
public void run()
{s1.test1();}
}


public class M1 {
    public static void main(String[] args) {
        Shared s1=new Shared();
        Shared s2=new Shared();
        A11 a1=new A11(s1);
        B1 b1=new B1(s2);
        a1.start();
        b1.start();
    }
    
}
