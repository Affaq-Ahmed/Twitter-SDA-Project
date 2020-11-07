
import java.sql.*;
import java.util.ArrayList;
@SuppressWarnings("unused")


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HP
 */
public interface TwitterDB {
    
    //static  con = null;
    //static ResultSet rs = null;
    
    public static int Signup(User user){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/videostore";// need to update with our db path
            Connection con = DriverManager.getConnection(url, "root", "admin");
            CallableStatement stmt = con.prepareCall("{Signup(?,?,?,,?)}");
            stmt.setString(1, user.Username);
            stmt.setString(2, user.Name);
            stmt.setString(3, user.Password);
            stmt.registerOutParameter(4, Types.INTEGER);
            
            stmt.execute();
            
            int result=stmt.getInt(4);
            
            try{
                con.close();
               //System.out.println("Database Connections Succesully Closed.");
            } 
            catch (SQLException sqle){
                System.out.println("Error: failed to close the database");
            }
            
            return result;
            
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Error: Failed to connect to database\n" + e.getMessage());
        }
        return 0;
    }
    public static int Login(User user){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/videostore";// need to update with our db path
            Connection con = DriverManager.getConnection(url, "root", "admin");
            CallableStatement stmt = con.prepareCall("{Login(?,?,?)}");
            stmt.setString(1, user.Username);
            stmt.setString(2, user.Password);
            stmt.registerOutParameter(3, Types.INTEGER);
            
            stmt.execute();
            
            int result=stmt.getInt(3);
            
            try{
                con.close();
               //System.out.println("Database Connections Succesully Closed.");
            } 
            catch (SQLException sqle){
                System.out.println("Error: failed to close the database");
            }
            
            return result;
            
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Error: Failed to connect to database\n" + e.getMessage());
        }
        return 0;
    }
    public static int Tweet(String CUsername,String Text){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/videostore";// need to update with our db path
            Connection con = DriverManager.getConnection(url, "root", "admin");
            CallableStatement stmt = con.prepareCall("{Tweet(?,?,?)}");
            stmt.setString(1, CUsername);
            stmt.setString(2, Text);
            stmt.registerOutParameter(3, Types.INTEGER);
            
            stmt.execute();
            
            int result=stmt.getInt(3);
            
            try{
                con.close();
               //System.out.println("Database Connections Succesully Closed.");
            } 
            catch (SQLException sqle){
                System.out.println("Error: failed to close the database");
            }
            
            return result;
            
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Error: Failed to connect to database\n" + e.getMessage());
        }
        return 0;
    }
    public static int Follow(String CUsername,String Username){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/videostore";// need to update with our db path
            Connection con = DriverManager.getConnection(url, "root", "admin");
            CallableStatement stmt = con.prepareCall("{Follow(?,?,?)}");
            stmt.setString(1, CUsername);
            stmt.setString(2, Username);
            stmt.registerOutParameter(3, Types.INTEGER);
            
            stmt.execute();
            
            int result=stmt.getInt(3);
            
            try{
                con.close();
               //System.out.println("Database Connections Succesully Closed.");
            } 
            catch (SQLException sqle){
                System.out.println("Error: failed to close the database");
            }
            
            return result;
            
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Error: Failed to connect to database\n" + e.getMessage());
        }
        return 0;
    }
    public static ArrayList<String> UnFollow(String CUsername,String Username){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/videostore";// need to update with our db path
            Connection con = DriverManager.getConnection(url, "root", "admin");
            CallableStatement stmt = con.prepareCall("{Follow(?,?,?)}");
            stmt.setString(1, CUsername);
            stmt.setString(2, Username);
            stmt.registerOutParameter(3, Types.INTEGER);
            
            stmt.execute();
            
            int result=stmt.getInt(3);
            
            try{
                con.close();
               //System.out.println("Database Connections Succesully Closed.");
            } 
            catch (SQLException sqle){
                System.out.println("Error: failed to close the database");
            }
            
            if(result==1){
                return TwitterDB.GetFollowing(CUsername);
            }
            
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Error: Failed to connect to database\n" + e.getMessage());
        }
        return null;
    }
    public static ArrayList<String> GetFollowing(String CUsername){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/videostore";// need to update with our db path
            Connection con = DriverManager.getConnection(url, "root", "admin");
            CallableStatement stmt = con.prepareCall("{Following(?)}");
            stmt.setString(1, CUsername);
            
            stmt.execute();
            
            ResultSet rs=stmt.getResultSet();
            ArrayList<String> following = new ArrayList<>();
            while(rs.next()){
                following.add(rs.getString("Username"));
            }

            try{
                con.close();
               //System.out.println("Database Connections Succesully Closed.");
            } 
            catch (SQLException sqle){
                System.out.println("Error: failed to close the database");
            }
            
            return following;
            
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Error: Failed to connect to database\n" + e.getMessage());
        }
        return null;
    }
    static int Retweet(String TweetId,String Username,String CUsername,String Text){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/videostore";// need to update with our db path
            Connection con = DriverManager.getConnection(url, "root", "admin");
            CallableStatement stmt = con.prepareCall("{ReTweet(?,?,?,?,?)}");
            stmt.setString(1, TweetId);
            stmt.setString(2, Username);
            stmt.setString(3, CUsername);
            stmt.setString(4, Text);
            stmt.registerOutParameter(5, Types.INTEGER);
            
            stmt.execute();
            
            int result=stmt.getInt(5);
            
            try{
                con.close();
               //System.out.println("Database Connections Succesully Closed.");
            } 
            catch (SQLException sqle){
                System.out.println("Error: failed to close the database");
            }
            
            return result;
            
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Error: Failed to connect to database\n" + e.getMessage());
        }
        return 0;
    }
    public static int Block(String CUsername,String Username){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/videostore";// need to update with our db path
            Connection con = DriverManager.getConnection(url, "root", "admin");
            CallableStatement stmt = con.prepareCall("{Block(?,?,?)}");
            stmt.setString(1, CUsername);
            stmt.setString(2, Username);
            stmt.registerOutParameter(3, Types.INTEGER);
            
            stmt.execute();
            
            int result=stmt.getInt(3);
            
            try{
                con.close();
               //System.out.println("Database Connections Succesully Closed.");
            } 
            catch (SQLException sqle){
                System.out.println("Error: failed to close the database");
            }
            
            return result;
            
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Error: Failed to connect to database\n" + e.getMessage());
        }
        return 0;
    }
    
    public static int Like(String CUsername,String TweetId,String Username){
        return 0;
    }
    public static int Bookmark(String CUsername,String TweetId,String Username){
        return 0;
    }
    public static int Reply(String CUsername,String TweetId,String Username,String Text){
        return 0;
    }
    public static int Dm(String CUsername,String Username,String Text){
        return 0;
    }
}
