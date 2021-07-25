/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Yash patidar
 */class Mm
 {}
         
public class M12 {
    public static void main(String[] args) {
        Mm o1=new Mm();
        Mm o2=new Mm();
        Mm o3=o1;
        
        System.out.println(o1==o2);
        System.out.println(o1==o3);
      System.out.println(o2==o3);
        System.out.println(o1.equals(o2));
        System.out.println(o1.equals(o3));
    System.out.println(o2.equals(o3));
    }
}
