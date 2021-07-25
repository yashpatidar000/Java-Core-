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
public class D {
    static int test(String s1)
    {
    try{
    int i=Integer.parseInt(s1);
    return i;
    }
    catch(NumberFormatException ex)
    {return 0;}
    finally
    {return 20;}
    }
    
    public static void main(String[] args) {
        
        int i=test("abc");
        System.out.println(i);
        i=test("90");
        System.out.println(i);
    }
}
