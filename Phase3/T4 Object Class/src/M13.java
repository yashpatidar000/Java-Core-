/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Yash patidar
 */class N
 {int i;
 N(int i)
 {this.i=i;}  
 public String toString()
 {return "i="+i;}
 
 public boolean equals(Object sss)
 {N obj=(N)sss;
 return this.i==obj.i;}
 }
         
public class M13 {
    public static void main(String[] args) {
        N o1=new N(9);
        N o2=new N(9);
        
        System.out.println(o1);
        System.out.println(o2);
        System.out.println(o1.equals(o2));
        
    }
}
