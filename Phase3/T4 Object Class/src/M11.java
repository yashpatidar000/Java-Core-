/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Yash patidar
 */class L
 {int i;
 L(int i)
 {this.i=i;}  
 public String toString()
 {return "i="+i;}
         }
public class M11 {
    public static void main(String[] args) {
        L o1=new L(1);
        L o2=new L(1);
        System.out.println(o1);
        System.out.println(o2);
        System.out.println(o1==o2);
        System.out.println(o1.i==o2.i);
        System.out.println(o1.equals(o2));
    }
    
}
