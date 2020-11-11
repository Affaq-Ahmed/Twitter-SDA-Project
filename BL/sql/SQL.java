/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sql;
import java.sql.*;
import Message.*;
import Tweet.*;
import User.*;
import TwitterDB.*;
import java.util.ArrayList;
import project.*;
/**
 *
 * @author HP
 */


public class SQL {

public static UsersD user;
public static TwitterDB DB;
//public static int x;
    public static void main(String[] args){
        user=new UsersD();
        java.awt.EventQueue.invokeLater(() -> {
            new Login().setVisible(true);
        });
    }
}
