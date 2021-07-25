/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Yash patidar
 */
public class C implements Cloneable
{
    private int i;
    C(int i)
    {this.i=i;}
    
    
    public static void main(String[] args) throws CloneNotSupportedException
    {
        C b1=new C(10);
        
        C b2=(C)b1.clone();
        System.out.println(b2.i);
    }
}
