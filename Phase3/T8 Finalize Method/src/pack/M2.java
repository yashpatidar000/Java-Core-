/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pack;

/**
 *
 * @author Yash patidar
 */
class H
{
   void test()
   {
       System.out.println("from test");
     }
}

public class M2 {
    public static void main(String[] args) throws Exception
    {
        Class c1=Class.forName("pack.H") ;
        
        Object obj=c1.newInstance();
        H h1=(H)obj;
        h1.test();
        
        
    }
}
