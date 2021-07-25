/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Yash patidar
 */
public class D implements Cloneable
{
    private int i;
    D(int i)
    {this.i=i;}
    
    
    public static void main(String[] args) throws CloneNotSupportedException
    {
        D b1=new D(10);
        D b2=(D)b1.clone();
        
        b1.i=20;
        D b3=(D)b2.clone();
        System.out.println(b1.i);
        System.out.println(b2.i);
        System.out.println(b3.i);
    }
}
