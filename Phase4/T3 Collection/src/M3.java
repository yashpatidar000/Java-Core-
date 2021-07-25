import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Yash patidar
 */
public class M3 {
    public static void main(String[] args) throws IOException {
        File f=new File("test4.text");
        FileWriter out=new FileWriter(f);
        BufferedWriter bout=new BufferedWriter(out);
        bout.write("abc");
        out.write("abv");
        bout.flush();
        bout.close();
        out.close();
        System.out.println("agd");
    }
}
