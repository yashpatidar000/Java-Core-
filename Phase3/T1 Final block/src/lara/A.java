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
public class A {
    public static void main(String[] args) {
        try {
        int i=10/0;
        }
        catch(ArithmeticException ex)
        {System.out.println("4");}
        finally
        {System.out.println("5");
        }
    }
}
