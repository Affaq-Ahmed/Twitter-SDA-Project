/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sql;
import Console.*;
import DB.Configure;
import DB.DB;
import GUI.Login;
import java.sql.*;
import Message.*;
import Tweet.*;
import User.*;
import TwitterDB.*;
import java.io.IOException;
import java.util.ArrayList;
import PlainText.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.json.simple.parser.ParseException;
/**
 *
 * @author HP
 */


public class SQL {

public static UsersD user=new UsersD();
public static TwitterDB DB=new TwitterDBimp();
//public static int x;
    public static void main(String[] args) throws IOException{
        
//    
char a1 = 0;
        try {
            a1 = Configure.ConfigureConsole();
        } catch (IOException ex) {
            Logger.getLogger(TwitterDBimp.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println(a1);
        if (a1=='c')
            Console.Startup();
        else if(a1=='g'){
        java.awt.EventQueue.invokeLater(() -> {
            new Login().setVisible(true);
        });
    }
        }
}
