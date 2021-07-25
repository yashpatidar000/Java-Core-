/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pack;
 
class E
{
@Override
protected void finalize() throws Throwable
{
    System.out.println("from finalize");}
}
public class M15 {
    public static void main(String[] args)
    {
        E e1=new E();
        e1=null;
        System.gc();
        System.out.println("done");
    }
}
