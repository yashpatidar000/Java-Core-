
package pack;
import java.util.Scanner;
import java.lang.reflect.Method;
class D1
{
public void test1()
{System.out.println("test1");}

public void test2(int i,double j)
{System.out.println("i="+i+",j="+j);}
//System.out.println("test1("+i+","+j+")");}
}

public class M13 {
    public static void main(String[] args) throws Exception
    {
        Class c1=Class.forName("pack.D1");
        
        Object obj=c1.newInstance();
        
        Method m1=c1.getDeclaredMethod("test1");
        Method m2=c1.getDeclaredMethod("test2",int.class,double.class);
        
        m1.invoke(obj);
        m2.invoke(obj,40,45.6);
    }
}
