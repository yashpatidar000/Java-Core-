/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pack;
import java.lang.reflect.Method;
/**
 *
 * @author Yash patidar
 */
class Test{
    void method()
    {}
}
public class M {
    public static void main(String[] args) throws Exception
    {
        Test t1=new Test();
        Class c1=t1.getClass();
        
        Method m[]=c1.getDeclaredMethods();
         for(Method m2:m)
        {
            System.out.println(m2.getName());
            
        }
       
    }
}
