/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Yash patidar
 */class Q
 {int i;
 Q(int i)
 {this.i=i;}  
 public String toString()
 {return "i="+i;}
 
 public boolean equals(Object sss)
 {
    /* if (!(sss instanceof Q))
     {return false;}*/
     Q obj=(Q)sss;
 return this.i==obj.i;}
 }
 
 class R
 {int i;
 R(int i)
 {this.i=i;}  
 public String toString()
 {return "i="+i;}
 
 public boolean equals(Object sss)
 {
     /*if (!(sss instanceof R))
     {return false;}*/
     
     R obj=(R)sss;
 return this.i==obj.i;}
 }
         
public class M15 {
    public static void main(String[] args) {
        Q o1=new Q(10);
        Q o2=new Q(10);
        
        R r1=new R(10);
        R r2=new R(10);
        System.out.println(o1);
        System.out.println(o2);
        System.out.println(r1);
        System.out.println(r2);
        
        System.out.println(o1.equals(o2));
        System.out.println(r1.equals(r2));
        System.out.println("----");
        System.out.println(o1.equals(r1));
        System.out.println(o2.equals(r2));
    }
}
