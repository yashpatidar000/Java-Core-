/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Yash patidar
 */
import java.io.File;
import java.io.IOException;
public class M1 {
    public static void main(String[] args) {
        File f1=new File("test.txt");
        System.out.println(f1.exists());
        try
        {
        boolean b1=f1.createNewFile();
            System.out.println(b1);
        }
        catch(IOException ex)
        {}
               System.out.println(f1.exists());

    }
}
