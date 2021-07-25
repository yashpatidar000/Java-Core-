/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Yash patidar
 */class P
 {int i,j;
 P(int i,int j)
 {this.i=i;
 this.j=j;
 }  
 public String toString()
 {return "i="+i+",j="+j;}
 
 public boolean equals(Object sss)
 {P obj1=(P)sss;
 
 return this.i==obj1.i && j==obj1.j;}
 }
         
public class M14 {
    public static void main(String[] args) {
        P o1=new P(10,20);
        P o2=new P(10,20);
        P o3=new P(20,10);
        
        System.out.println(o1);
        System.out.println(o2);
        System.out.println(o3);
        System.out.println(o1.equals(o2));
        System.out.println(o2.equals(o3));
        System.out.println(o1.equals(o3));
    }
}
