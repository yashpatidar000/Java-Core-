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
/*public class C {
    public static void main(String[] args) {
        try {
        int i=10/0;
        }
        catch(NumberFormatException ex)
        {System.out.println(5);}
        finally
        {System.out.println("finally");
        }
        System.out.println("done");
    }
}*/
public class C {
    public static void main(String[] args) {
        try {
        String s1=args[0];
            System.out.println("1");
        }
        catch(ArrayIndexOutOfBoundsException ex)
        {System.out.println(5);}
       
    }
}

