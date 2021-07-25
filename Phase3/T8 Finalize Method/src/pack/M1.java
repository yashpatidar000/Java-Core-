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
class G
{
G()
{System.out.println("done");}
}
public class M1 {
    public static void main(String[] args) throws Exception
    {
        Class c1=Class.forName("pack.G") ;
        
        Object obj=c1.newInstance();
        
    }
}
