/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Yash patidar
 */
class A extends Thread
{public void run()
{for(int i=0;i<5;i++)     
   {System.out.println(i);}}
}

public class M2 {
    public static void main(String[] args) {
        A a1=new A();
        System.out.println(a1.getState());
        a1.start();
        System.out.println(a1.getState());
        try
        {Thread.sleep(1000);}
        catch(InterruptedException ex)
        {System.out.println(ex);}
        System.out.println(a1.getState());
    }
}
