
package pack;
import java.util.Scanner;
import java.lang.reflect.Method;
class A
{
void test1()
{System.out.println("A test1");}
void test12()
{System.out.println("A test12");}
}

class B
{
void method1()
{System.out.println("B method1");}
void method2()
{System.out.println("B method2");}
}

public class M11 {
    public static void main(String[] args) throws Exception
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter class name");
        String s1=sc.next();
        Class c1=Class.forName(s1);
        Object obj1=c1.newInstance();
        
        System.out.println("Enter method name");
        String s2=sc.next();
        
        
        Method m1=c1.getDeclaredMethod(s2);
        m1.invoke(obj1);
    }
}
