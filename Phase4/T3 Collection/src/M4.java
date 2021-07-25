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
import java.io.FileWriter;
import java.io.IOException;
public class M4 {
    public static void main(String[] args) throws IOException{
        File f=new File("ter.txt");
        FileWriter out=new FileWriter(f);
        out.write("abc");
        out.flush();
        out.close();
    }
}
