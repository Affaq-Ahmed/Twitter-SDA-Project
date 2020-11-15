/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DB;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author HP
 */
public class Configure {
    public static char ConfigureConsole() throws FileNotFoundException, IOException{
        FileReader F = new FileReader("E:\\uni\\Semester 5\\SQL\\src\\config1.txt"); // Will print the error if occurs during the process.
        int b;

            b=F.read();
            char a1=(char)b;
//            switch (a1) {
//                case 'c' -> System.out.println("Console");
//                case 'g' -> System.out.println("GUI");
//            }
        //System.out.print(a1);
        
        // This will close the opened file.
        F.close();
        return a1;
    }
    public static char ConfigureDB() throws FileNotFoundException, IOException{
        FileReader F = new FileReader("E:\\uni\\Semester 5\\SQL\\src\\config2.txt"); // Will print the error if occurs during the process.
        int b;

            b=F.read();
            char a1=(char)b;
            
//            switch (a1) {
//                case 'd' -> System.out.println("DB");
//                case 'f' -> System.out.println("FIling");
//
//            }
        //System.out.print(a1);
        
        // This will close the opened file.
        F.close();
        return a1;
    }
}
