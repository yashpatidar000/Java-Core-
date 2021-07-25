
package pack;
import java.util.Scanner;
import java.lang.reflect.Method;
class C
{
public void test1(int i)
{System.out.println("from test1:"+i);}
}
public class M12 {
    public static void main(String[] args) throws Exception
    {
        Class c1=Class.forName("pack.C");
        
        Object obj=c1.newInstance();
        
        Method m1=c1.getDeclaredMethod("test1",int.class);
        
        m1.invoke(obj,10);
                
    }
        
    
}
