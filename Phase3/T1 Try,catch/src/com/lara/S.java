/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lara;

public class S {
    public static void main(String[] args) {
        System.out.println("1");
        try{
            System.out.println("2");
            int i=10/0;
            System.out.println("3");
            int j=Integer.parseInt("abc");
            System.out.println("4");
            
        }
        catch(ArithmeticException ex)
        {System.out.println(ex);
        }
        catch(NumberFormatException ex)
        {System.out.println(ex);}
        System.out.println("5");
    }
}
