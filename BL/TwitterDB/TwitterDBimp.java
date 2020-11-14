/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TwitterDB;

import Message.Message;
import Tweet.Tweets;
import User.Users;
import User.UsersD;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.ArrayList;

/**
 *
 * @author HP
 */
public class TwitterDBimp implements TwitterDB {
    @Override
    public int Signup(UsersD user){
        try {
            String url = "jdbc:sqlserver://localhost;databaseName=Twitter_DB;user=sa;password=superman";// need to update with our db path
            Connection con = DriverManager.getConnection(url);
            CallableStatement stmt = con.prepareCall("{Call Signup(?,?,?,?)}");
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
            
        } catch (SQLException e) {
            System.out.println("Error: Failed to connect to database\n" + e.getMessage());
        }
        return 0;
    }
    @Override
    public int Login(UsersD user){
        try {
            String url = "jdbc:sqlserver://localhost;databaseName=Twitter_DB;user=sa;password=superman";// need to update with our db path
            Connection con = DriverManager.getConnection(url);
            CallableStatement stmt = con.prepareCall("{Call Signin(?,?,?)}");
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
            
        } catch (SQLException e) {
            System.out.println("Error: Failed to connect to database\n" + e.getMessage());
        }
        return 0;
    }
    @Override
    public int Follow(String CUsername,String Username){
        try {
            String url = "jdbc:sqlserver://localhost;databaseName=Twitter_DB;user=sa;password=superman";// need to update with our db path
            Connection con = DriverManager.getConnection(url);
            CallableStatement stmt = con.prepareCall("{Call Follow(?,?,?)}");
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
            
        } catch (SQLException e) {
            System.out.println("Error: Failed to connect to database\n" + e.getMessage());
        }
        return 0;
    }
    @Override
    public int UnFollow(String CUsername,String Username){
        try {
            String url = "jdbc:sqlserver://localhost;databaseName=Twitter_DB;user=sa;password=superman";// need to update with our db path
            Connection con = DriverManager.getConnection(url);
            CallableStatement stmt = con.prepareCall("{Call UnFollow(?,?,?)}");
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
            
        } catch (SQLException e) {
            System.out.println("Error: Failed to connect to database\n" + e.getMessage());
        }
        return 0;
    }
    @Override
    public ArrayList<Users> GetFollowing(String CUsername){
        try {
            String url = "jdbc:sqlserver://localhost;databaseName=Twitter_DB;user=sa;password=superman";// need to update with our db path
            Connection con = DriverManager.getConnection(url);
            CallableStatement stmt = con.prepareCall("{Call Following(?)}");
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
            
        } catch (SQLException e) {
            System.out.println("Error: Failed to connect to database\n" + e.getMessage());
        }
        return null;
    }
    @Override
    public ArrayList<Users> GetFollowers(String CUsername){
        try {
            String url = "jdbc:sqlserver://localhost;databaseName=Twitter_DB;user=sa;password=superman";// need to update with our db path
            Connection con = DriverManager.getConnection(url);
            CallableStatement stmt = con.prepareCall("{Call Followers(?)}");
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
            
        } catch (SQLException e) {
            System.out.println("Error: Failed to connect to database\n" + e.getMessage());
        }
        return null;
    }
    @Override
    public ArrayList<Users> GetBlockedUsers(String CUsername){
        try {
            String url = "jdbc:sqlserver://localhost;databaseName=Twitter_DB;user=superman;password=superman123";// need to update with our db path
            Connection con = DriverManager.getConnection(url);
            CallableStatement stmt = con.prepareCall("{Call BlockedUsers(?)}");
            stmt.setString(1, CUsername);
            
            stmt.execute();
            
            ResultSet rs=stmt.getResultSet();
            ArrayList<Users> Blocked = new ArrayList<>();
            while(rs.next()){
                Blocked.add(new Users(rs.getString("Username"),rs.getString("Name")));
            }

            try{
                con.close();
               //System.out.println("Database Connections Succesully Closed.");
            } 
            catch (SQLException sqle){
                System.out.println("Error: failed to close the database");
            }
            
            return Blocked;
            
        } catch (SQLException e) {
            System.out.println("Error: Failed to connect to database\n" + e.getMessage());
        }
        return null;
    }
    @Override
    public int Tweet(String CUsername,String Text){
        try {
            String url = "jdbc:sqlserver://localhost;databaseName=Twitter_DB;user=superman;password=superman123";// need to update with our db path
            Connection con = DriverManager.getConnection(url);
            CallableStatement stmt = con.prepareCall("{Call Tweet(?,?,?)}");
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
            
        } catch (SQLException e) {
            System.out.println("Error: Failed to connect to database\n" + e.getMessage());
        }
        return 0;
    }
    @Override
    public int Retweet(Integer TweetId,String CUsername,String Text){
        try {
            String url = "jdbc:sqlserver://localhost;databaseName=Twitter_DB;user=superman;password=superman123";// need to update with our db path
            Connection con = DriverManager.getConnection(url);
            CallableStatement stmt = con.prepareCall("{Call ReTweet(?,?,?,?)}");
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
            
        } catch (SQLException e) {
            System.out.println("Error: Failed to connect to database\n" + e.getMessage());
        }
        return 0;
    }
    @Override
    public int Block(String CUsername,String Username){
        try {
            String url = "jdbc:sqlserver://localhost;databaseName=Twitter_DB;user=superman;password=superman123";// need to update with our db path
            Connection con = DriverManager.getConnection(url);
            CallableStatement stmt = con.prepareCall("{Call Block(?,?,?)}");
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
            
        } catch (SQLException e) {
            System.out.println("Error: Failed to connect to database\n" + e.getMessage());
        }
        return 0;
    }
    @Override
    public int Like(String CUsername,Integer TweetId){
        try {
            String url = "jdbc:sqlserver://localhost;databaseName=Twitter_DB;user=superman;password=superman123";// need to update with our db path
            Connection con = DriverManager.getConnection(url);
            CallableStatement stmt = con.prepareCall("{Call Like(?,?,?)}");
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
            
        } catch (SQLException e) {
            System.out.println("Error: Failed to connect to database\n" + e.getMessage());
        }
        return 0;
    }
    @Override
    public int Bookmark(String CUsername,Integer TweetId){
        try {
            String url = "jdbc:sqlserver://localhost;databaseName=Twitter_DB;user=superman;password=superman123";// need to update with our db path
            Connection con = DriverManager.getConnection(url);
            CallableStatement stmt = con.prepareCall("{Call Bookmark(?,?,?)}");
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
            
        } catch (SQLException e) {
            System.out.println("Error: Failed to connect to database\n" + e.getMessage());
        }
        return 0;
    }
    @Override
    public int Reply(String CUsername,Integer TweetId,String Text){
        try {
            String url = "jdbc:sqlserver://localhost;databaseName=Twitter_DB;user=superman;password=superman123";// need to update with our db path
            Connection con = DriverManager.getConnection(url);
            CallableStatement stmt = con.prepareCall("{Call Reply(?,?,?,?)}");
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
            
        } catch (SQLException e) {
            System.out.println("Error: Failed to connect to database\n" + e.getMessage());
        }
        return 0;
    }
    @Override
    public int Dm(String CUsername,String Username,String Text){
        try {
            String url = "jdbc:sqlserver://localhost;databaseName=Twitter_DB;user=superman;password=superman123";// need to update with our db path
            Connection con = DriverManager.getConnection(url);
            CallableStatement stmt = con.prepareCall("{Call Dm(?,?,?,?)}");
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
            
        } catch (SQLException e) {
            System.out.println("Error: Failed to connect to database\n" + e.getMessage());
        }
        return 0;
    }
    @Override
    public ArrayList<Users> Search(String Text){
        try {
            String url = "jdbc:sqlserver://localhost;databaseName=Twitter_DB;user=sa;password=superman";// need to update with our db path
            Connection con = DriverManager.getConnection(url);
            CallableStatement stmt = con.prepareCall("{Call Search(?)}");
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
            
        } catch (SQLException e) {
            System.out.println("Error: Failed to connect to database\n" + e.getMessage());
        }
        return null;
    }
    @Override
    public ArrayList<Tweets> HomeTweets(String CUsername){
        try {
            String url = "jdbc:sqlserver://localhost;databaseName=Twitter_DB;user=superman;password=superman123";// need to update with our db path
            Connection con = DriverManager.getConnection(url);
            CallableStatement stmt = con.prepareCall("{Call HomeTweets(?)}");
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
            
        } catch (SQLException e) {
            System.out.println("Error: Failed to connect to database\n" + e.getMessage());
        }
        return null;
    }
    @Override
    public ArrayList<Message> Chat(String CUsername,String Username){
        try {
            String url = "jdbc:sqlserver://localhost;databaseName=Twitter_DB;user=superman;password=superman123";// need to update with our db path
            Connection con = DriverManager.getConnection(url);
            CallableStatement stmt = con.prepareCall("{Call Chat(?,?)}");
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
            
        } catch (SQLException e) {
            System.out.println("Error: Failed to connect to database\n" + e.getMessage());
        }
        return null;
    }
    @Override
    public ArrayList<Tweets> GetBookmarks(String CUsername){
        try {
            String url = "jdbc:sqlserver://localhost;databaseName=Twitter_DB;user=superman;password=superman123";// need to update with our db path
            Connection con = DriverManager.getConnection(url);
            CallableStatement stmt = con.prepareCall("{Call GetBookmarks(?)}");
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
            
        } catch (SQLException e) {
            System.out.println("Error: Failed to connect to database\n" + e.getMessage());
        }
        return null;
    }
    @Override
    public ArrayList<Tweets> GetReplies(Integer Tweetid){
        try {
            String url = "jdbc:sqlserver://localhost;databaseName=Twitter_DB;user=superman;password=superman123";// need to update with our db path
            Connection con = DriverManager.getConnection(url);
            CallableStatement stmt = con.prepareCall("{Call GetReplies(?)}");
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
            
        } catch (SQLException e) {
            System.out.println("Error: Failed to connect to database\n" + e.getMessage());
        }
        return null;
    }
    @Override
    public  ArrayList<Tweets> GetLikedTweets(String CUsername){
        try {
            String url = "jdbc:sqlserver://localhost;databaseName=Twitter_DB;user=superman;password=superman123";// need to update with our db path
            Connection con = DriverManager.getConnection(url);
            CallableStatement stmt = con.prepareCall("{Call LikedTweets(?)}");
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
            
        } catch (SQLException e) {
            System.out.println("Error: Failed to connect to database\n" + e.getMessage());
        }
        return null;
    }
    @Override
    public ArrayList<Users> GetLikers(Integer Tweetid){
        try {
            String url = "jdbc:sqlserver://localhost;databaseName=Twitter_DB;user=superman;password=superman123";// need to update with our db path
            Connection con = DriverManager.getConnection(url);
            CallableStatement stmt = con.prepareCall("{Call GetLikers(?)}");
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
            
        } catch (SQLException e) {
            System.out.println("Error: Failed to connect to database\n" + e.getMessage());
        }
        return null;
    }
    @Override
    public ArrayList<Tweets> GetUserTweets(String CUsername){
        try {
            String url = "jdbc:sqlserver://localhost;databaseName=Twitter_DB;user=superman;password=superman123";// need to update with our db path
            Connection con = DriverManager.getConnection(url);
            CallableStatement stmt = con.prepareCall("{Call UserTweets(?)}");
            stmt.setString(1, CUsername);
            
            stmt.execute();
            
            ResultSet rs=stmt.getResultSet();
            ArrayList<Tweets> Usertweets = new ArrayList<>();
            while(rs.next()){
                Usertweets.add(new Tweets(new Users(rs.getString("Username"),rs.getString("Name")),rs.getInt("Tweetid"),rs.getString("Text")));
            }

            try{
                con.close();
               //System.out.println("Database Connections Succesully Closed.");
            } 
            catch (SQLException sqle){
                System.out.println("Error: failed to close the database");
            }
            
            return Usertweets;
            
        } catch (SQLException e) {
            System.out.println("Error: Failed to connect to database\n" + e.getMessage());
        }
        return null;
    }
}
