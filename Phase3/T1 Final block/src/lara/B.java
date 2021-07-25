/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lara;

/**
 *
 * @author Yash patidar
 */
public class B {
    public static void main(String[] args) 
    {System.out.println("1");
        try{System.out.println("2");}
        catch(ArithmeticException e){}
        finally{
            System.out.println("4");
            try{int i=10/0;}
            catch(ArithmeticException e){}
            System.out.println("5");
        }
    }
}
