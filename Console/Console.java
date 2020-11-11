/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Console;

import java.io.IOException;
import java.util.Scanner;
import TwitterGUI.*;
import sql.SQL;
import User.*;
import java.util.ArrayList;

/**
 *
 * @author HP
 */
public class Console {
    private static final Scanner scanner = new Scanner( System. in);
    public static void Startup(){
        System.out.println("1.Login\n2.Signup\nSelect Option (1 or 2) : ");
        String x; 
        while(true){
            x= scanner. nextLine();
            switch (x) {
                case "1" -> Login();
                case "2" -> Signup();
                default -> System.out.println("\nSorry Invalid option. Try again!!\n");
            }
        }
    }
    public static void Login(){
        System. out. print( "\nEnter Username : ");
        String Username = scanner. nextLine();
        System. out. print( "Enter Password : ");
        String Password= scanner.nextLine();
        int Login = SQL.user.Login(Username, Password);
//        System.out.print(Login);
        if(Login==1)
            Menu();
        else{
            System. out. print( "\nSorry. Failed to Signup. Try again!!\n");
            Startup();
        }
    }
    public static void Signup(){
        System. out. print( "\nEnter Username : ");
        String Username = scanner. nextLine();
        System. out. print( "Enter Name : ");
        String Name = scanner. nextLine();
        System. out. print( "Enter Password : ");
        String Password= scanner.nextLine();
        int Signup = SQL.user.Signup(Username, Name ,Password);
//        System.out.print(Signup);
        if(Signup==1)
            Menu();
        else{
            System. out. print( "\nSorry. Failed to Signup. Try again!!");
            Startup();
        }
    }
    public static void Menu(){
        String x; 
        while(true){
            System.out.println("1.Search\n2.Follow\n3.UnFollow    \nSelect Option : ");
            x= scanner. nextLine();
            switch (x) {
                case "1" -> Search();
                case "2" -> Follow();
                case "3" -> UnFollow();
                default -> System.out.println("\nSorry Invalid option. Try again!!");
            }
        }
    }
    private static void Search() {
        System.out.println("Enter : ");
        String x; 
        x= scanner.nextLine();
        ArrayList<Users> users=SQL.user.Search(x);
        for(int i=0;i<users.size();i++)
        System.out.println("Username: "+users.get(i).Username+" , Name: "+users.get(i).Name);
    }
    private static void Follow() {
        System.out.println("Enter Username : ");
        String x; 
        x= scanner.nextLine();
        SQL.user.Follow(SQL.user.Username,x);
    }
    private static void UnFollow() {
        System.out.println("Enter Username : ");
        String x; 
        x= scanner.nextLine();
        SQL.user.UnFollow(SQL.user.Username,x);
    }
}
