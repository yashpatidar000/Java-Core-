/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Yash patidar
 */
class A
{int i;

}
public class M19 {
    public static void main(String[] args) {
        A a1=new A();
        a1.i=10;
        A a2=new A();
        a2.i=10;
        System.out.println(a1.hashCode());
        System.err.println(a2.hashCode());
        
    }
    
}
