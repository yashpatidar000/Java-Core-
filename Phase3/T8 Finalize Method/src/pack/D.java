/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pack;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;
/**
 *
 * @author Yash patidar
 */
class Test1{
    int i;String j;Double k;
    
    Test1(){}
    Test1(int i){this.i=10;}
    
    void method1(){}
            void method2(){}
                    void method3()
    {}
}
public class D {
    public static void main(String[] args) throws Exception
    {
        Test1 t1=new Test1();
        Class c1=t1.getClass();
        
        Field f1[]=c1.getDeclaredFields();
        for(Field f2:f1)
        {
            System.out.println(f2.getName());
            System.out.println(f2.getType());
            System.out.println("______");
        }
        
        Constructor con[]=c1.getDeclaredConstructors();
        for(Constructor con2:con)
        {
            System.out.println(con2.getName());
            System.out.println(con2.getTypeParameters());
            System.out.println("______");
        }
        
        
        Method m[]=c1.getDeclaredMethods();
        for(Method m2:m)
        {
            System.out.println(m2.getName());
            System.out.println(m2.getTypeParameters());
            System.out.println("______");
            
    }
}
}
