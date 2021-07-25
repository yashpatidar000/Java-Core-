/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Yash patidar
 */
public class B implements Cloneable
{
    int i;
    B(int i)
    {this.i=i;}
    
    
    public static void main(String[] args) throws CloneNotSupportedException
    {
        B b1=new B(10);
        
        B b2=(B)b1.clone();
        System.out.println(b2.i);
        System.out.println("done");
    }
}
