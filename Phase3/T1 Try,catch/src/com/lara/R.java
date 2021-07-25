/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lara;

/**
 *
 * @author Yash patidar
 */
public class R {
    public static void main(String[] args) {
        try
        {int i=10/0;
            System.out.println("1");
        }
        catch(ArithmeticException ex)
        {
            System.out.println("2");
            try{
            int j=Integer.parseInt("abc");
            }
            catch(NumberFormatException ex1)
            {System.out.println("22");}
            System.out.println("3");
        }
        catch(NumberFormatException ex)
        {System.out.println("4");
        }
       System.out.println("end");
    }
}
