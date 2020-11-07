/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TwitterDB;
import Message.*;
import Tweet.*;
import User.*;
import java.sql.*;
import java.util.ArrayList;
@SuppressWarnings("unused")
/**
 *
 * @author HP
 */
public interface TwitterDB {
    public static int Signup(UsersD user){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/videostore";// need to update with our db path
            Connection con = DriverManager.getConnection(url, "root", "admin");
            CallableStatement stmt = con.prepareCall("{Signup(?,?,?,?)}");
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
    public static int Login(UsersD user){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/videostore";// need to update with our db path
            Connection con = DriverManager.getConnection(url, "root", "admin");
            CallableStatement stmt = con.prepareCall("{Signin(?,?,?)}");
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
    public static ArrayList<Users> UnFollow(String CUsername,String Username){
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
    public static ArrayList<Users> GetFollowing(String CUsername){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/videostore";// need to update with our db path
            Connection con = DriverManager.getConnection(url, "root", "admin");
            CallableStatement stmt = con.prepareCall("{Following(?)}");
            stmt.setString(1, CUsername);
            
            stmt.execute();
            
            ResultSet rs=stmt.getResultSet();
            ArrayList<Users> following = new ArrayList<>();
            while(rs.next()){
                following.add(new Users(rs.getString("Username"),rs.getString("Name")));
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
    public static ArrayList<Users> GetFollowers(String CUsername){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/videostore";// need to update with our db path
            Connection con = DriverManager.getConnection(url, "root", "admin");
            CallableStatement stmt = con.prepareCall("{Followers(?)}");
            stmt.setString(1, CUsername);
            
            stmt.execute();
            
            ResultSet rs=stmt.getResultSet();
            ArrayList<Users> followers = new ArrayList<>();
            while(rs.next()){
                followers.add(new Users(rs.getString("Username"),rs.getString("Name")));
            }

            try{
                con.close();
               //System.out.println("Database Connections Succesully Closed.");
            } 
            catch (SQLException sqle){
                System.out.println("Error: failed to close the database");
            }
            
            return followers;
            
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Error: Failed to connect to database\n" + e.getMessage());
        }
        return null;
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
    public static int Retweet(Integer TweetId,String CUsername,String Text){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/videostore";// need to update with our db path
            Connection con = DriverManager.getConnection(url, "root", "admin");
            CallableStatement stmt = con.prepareCall("{ReTweet(?,?,?,?)}");
            stmt.setInt(1, TweetId);
            stmt.setString(2, CUsername);
            stmt.setString(3, Text);
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
    public static int Like(String CUsername,Integer TweetId){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/videostore";// need to update with our db path
            Connection con = DriverManager.getConnection(url, "root", "admin");
            CallableStatement stmt = con.prepareCall("{Like(?,?,?)}");
            stmt.setString(1, CUsername);
            stmt.setInt(2, TweetId);
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
    public static int Bookmark(String CUsername,Integer TweetId){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/videostore";// need to update with our db path
            Connection con = DriverManager.getConnection(url, "root", "admin");
            CallableStatement stmt = con.prepareCall("{Bookmark(?,?,?)}");
            stmt.setString(1, CUsername);
            stmt.setInt(2, TweetId);
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
    public static int Reply(String CUsername,Integer TweetId,String Text){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/videostore";// need to update with our db path
            Connection con = DriverManager.getConnection(url, "root", "admin");
            CallableStatement stmt = con.prepareCall("{Reply(?,?,?,?)}");
            stmt.setInt(1, TweetId);
            stmt.setString(2, CUsername);
            stmt.setString(3, Text);
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
    public static int Dm(String CUsername,String Username,String Text){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/videostore";// need to update with our db path
            Connection con = DriverManager.getConnection(url, "root", "admin");
            CallableStatement stmt = con.prepareCall("{Dm(?,?,?,?)}");
            stmt.setString(1, Username);
            stmt.setString(2, CUsername);
            stmt.setString(3, Text);
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
    public static ArrayList<Users> Search(String Text){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/videostore";// need to update with our db path
            Connection con = DriverManager.getConnection(url, "root", "admin");
            CallableStatement stmt = con.prepareCall("{Search(?)}");
            stmt.setString(1, Text);
            
            stmt.execute();
            
            ResultSet rs=stmt.getResultSet();
            ArrayList<Users> followers = new ArrayList<>();
            while(rs.next()){
                followers.add(new Users(rs.getString("Username"),rs.getString("Name")));
            }

            try{
                con.close();
               //System.out.println("Database Connections Succesully Closed.");
            } 
            catch (SQLException sqle){
                System.out.println("Error: failed to close the database");
            }
            
            return followers;
            
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Error: Failed to connect to database\n" + e.getMessage());
        }
        return null;
    }
    public static ArrayList<Tweets> HomeTweets(String CUsername){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/videostore";// need to update with our db path
            Connection con = DriverManager.getConnection(url, "root", "admin");
            CallableStatement stmt = con.prepareCall("{HomeTweets(?)}");
            stmt.setString(1, CUsername);
            
            stmt.execute();
            
            ResultSet rs=stmt.getResultSet();
            ArrayList<Tweets> Hometweet = new ArrayList<>();
            while(rs.next()){
                Hometweet.add(new Tweets(new Users(rs.getString("Username"),rs.getString("Name")),rs.getInt("Tweetid"),rs.getString("Text")));
            }

            try{
                con.close();
               //System.out.println("Database Connections Succesully Closed.");
            } 
            catch (SQLException sqle){
                System.out.println("Error: failed to close the database");
            }
            
            return Hometweet;
            
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Error: Failed to connect to database\n" + e.getMessage());
        }
        return null;
    }
    public static ArrayList<Message> Chat(String CUsername,String Username){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/videostore";// need to update with our db path
            Connection con = DriverManager.getConnection(url, "root", "admin");
            CallableStatement stmt = con.prepareCall("{Chat(?,?)}");
            stmt.setString(1, CUsername);
            stmt.setString(2, Username);
            
            stmt.execute();
            
            ResultSet rs=stmt.getResultSet();
            ArrayList<Message> chat = new ArrayList<>();
            while(rs.next()){
                chat.add(new Message(new Users(rs.getString("SUsername"),rs.getString("SName")),new Users(rs.getString("RUsername"),rs.getString("RName")),rs.getString("Text")));
            }

            try{
                con.close();
               //System.out.println("Database Connections Succesully Closed.");
            } 
            catch (SQLException sqle){
                System.out.println("Error: failed to close the database");
            }
            
            return chat;
            
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Error: Failed to connect to database\n" + e.getMessage());
        }
        return null;
    }
    public static ArrayList<Tweets> GetBookmarks(String CUsername){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/videostore";// need to update with our db path
            Connection con = DriverManager.getConnection(url, "root", "admin");
            CallableStatement stmt = con.prepareCall("{GetBookmarks(?)}");
            stmt.setString(1, CUsername);
            
            stmt.execute();
            
            ResultSet rs=stmt.getResultSet();
            ArrayList<Tweets> Bookmarks = new ArrayList<>();
            while(rs.next()){
                Bookmarks.add(new Tweets(new Users(rs.getString("Username"),rs.getString("Name")),rs.getInt("Tweetid"),rs.getString("Text")));
            }

            try{
                con.close();
               //System.out.println("Database Connections Succesully Closed.");
            } 
            catch (SQLException sqle){
                System.out.println("Error: failed to close the database");
            }
            
            return Bookmarks;
            
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Error: Failed to connect to database\n" + e.getMessage());
        }
        return null;
    }
    public static ArrayList<Tweets> GetReplies(Integer Tweetid){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/videostore";// need to update with our db path
            Connection con = DriverManager.getConnection(url, "root", "admin");
            CallableStatement stmt = con.prepareCall("{GetReplies(?)}");
            stmt.setInt(1, Tweetid);
            
            stmt.execute();
            
            ResultSet rs=stmt.getResultSet();
            ArrayList<Tweets> Replies = new ArrayList<>();
            while(rs.next()){
                Replies.add(new Tweets(new Users(rs.getString("Username"),rs.getString("Name")),rs.getInt("Tweetid"),rs.getString("Text")));
            }

            try{
                con.close();
               //System.out.println("Database Connections Succesully Closed.");
            } 
            catch (SQLException sqle){
                System.out.println("Error: failed to close the database");
            }
            
            return Replies;
            
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Error: Failed to connect to database\n" + e.getMessage());
        }
        return null;
    }
    public static ArrayList<Tweets> GetLikedTweets(String CUsername){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/videostore";// need to update with our db path
            Connection con = DriverManager.getConnection(url, "root", "admin");
            CallableStatement stmt = con.prepareCall("{LikedTweets(?)}");
            stmt.setString(1, CUsername);
            
            stmt.execute();
            
            ResultSet rs=stmt.getResultSet();
            ArrayList<Tweets> Likedtweets = new ArrayList<>();
            while(rs.next()){
                Likedtweets.add(new Tweets(new Users(rs.getString("Username"),rs.getString("Name")),rs.getInt("Tweetid"),rs.getString("Text")));
            }

            try{
                con.close();
               //System.out.println("Database Connections Succesully Closed.");
            } 
            catch (SQLException sqle){
                System.out.println("Error: failed to close the database");
            }
            
            return Likedtweets;
            
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Error: Failed to connect to database\n" + e.getMessage());
        }
        return null;
    }
    public static ArrayList<Users> GetLikers(Integer Tweetid){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/videostore";// need to update with our db path
            Connection con = DriverManager.getConnection(url, "root", "admin");
            CallableStatement stmt = con.prepareCall("{GetLikers(?)}");
            stmt.setInt(1, Tweetid);
            
            stmt.execute();
            
            ResultSet rs=stmt.getResultSet();
            ArrayList<Users> Likers = new ArrayList<>();
            while(rs.next()){
                Likers.add(new Users(rs.getString("Username"),rs.getString("Name")));
            }

            try{
                con.close();
               //System.out.println("Database Connections Succesully Closed.");
            } 
            catch (SQLException sqle){
                System.out.println("Error: failed to close the database");
            }
            
            return Likers;
            
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Error: Failed to connect to database\n" + e.getMessage());
        }
        return null;
    }
    public static ArrayList<Tweet> GetUserTweets(String CUsername){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/videostore";// need to update with our db path
            Connection con = DriverManager.getConnection(url, "root", "admin");
            CallableStatement stmt = con.prepareCall("{LikedTweets(?)}");
            stmt.setString(1, CUsername);
            
            stmt.execute();
            
            ResultSet rs=stmt.getResultSet();
            ArrayList<Tweet> Usertweets = new ArrayList<>();
            while(rs.next()){
                Usertweets.add(new Tweet(rs.getInt("Tweetid"),rs.getString("Text")));
            }

            try{
                con.close();
               //System.out.println("Database Connections Succesully Closed.");
            } 
            catch (SQLException sqle){
                System.out.println("Error: failed to close the database");
            }
            
            return Usertweets;
            
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Error: Failed to connect to database\n" + e.getMessage());
        }
        return null;
    }
    
}
