/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package User;

import Message.Message;
import Tweet.Tweet;
import Tweet.Tweets;
import TwitterGUI.TwitterGUI;
import java.util.ArrayList;
import sql.*;

/**
 *
 * @author HP
 */
public class UsersD extends Users implements TwitterGUI  {
    public String Password;
    
    public UsersD() {
    }
    public UsersD(String Password, String Username, String Name) {
        super(Username, Name);
        this.Password = Password;
    }
    @Override
    public int Signup(String Username, String Name, String Password){
        SQL.user.Name=Name;
        SQL.user.Username=Username;
        SQL.user.Password=Password;
        return SQL.DB.Signup(SQL.user);
    }
    @Override
    public int Login(String Username, String Password){
        SQL.user.Username=Username;
        SQL.user.Password=Password;
        return SQL.DB.Login(SQL.user);
    }
    @Override
    public int Follow(String CUsername,String Username){
        int Follow = SQL.DB.Follow(CUsername, Username);
        return Follow;
    }
    @Override
    public ArrayList<Users> UnFollow(String CUsername,String Username){
        return SQL.DB.UnFollow(CUsername, Username);
        
    }
    @Override
    public ArrayList<Users> GetFollowing(String CUsername){
        return SQL.DB.GetFollowing(CUsername);        
    }
    @Override
    public ArrayList<Users> GetFollowers(String CUsername){
        return SQL.DB.GetFollowers(CUsername);
    }
    @Override
    public ArrayList<Users> GetBlockedUsers(String CUsername){
        return SQL.DB.GetBlockedUsers(CUsername);
    }
    @Override
    public int Tweet(String CUsername,String Text){
        return SQL.DB.Tweet(CUsername, Text);
    }
    @Override
    public int Retweet(Integer TweetId,String CUsername,String Text){
        return SQL.DB.Retweet(TweetId, CUsername, Text);
    }
    @Override
    public int Block(String CUsername,String Username){
        return SQL.DB.Block(CUsername, Username);
    }
    @Override
    public int Like(String CUsername,Integer TweetId){
        return SQL.DB.Like(CUsername, TweetId);
    }
    @Override
    public int Bookmark(String CUsername,Integer TweetId){
        return SQL.DB.Bookmark(CUsername, TweetId);        
    }
    @Override
    public int Reply(String CUsername,Integer TweetId,String Text){
        return SQL.DB.Reply(CUsername, TweetId, Text);        
    }
    @Override
    public int Dm(String CUsername,String Username,String Text){
        return SQL.DB.Dm(CUsername, Username, Text);        
    }
    @Override
    public ArrayList<Users> Search(String Text){
        return SQL.DB.Search(Text);        
    }
    @Override
    public ArrayList<Tweets> HomeTweets(String CUsername){
        return SQL.DB.HomeTweets(CUsername);        
    }
    @Override
    public ArrayList<Message> Chat(String CUsername,String Username){
        return SQL.DB.Chat(CUsername, Username);        
    }
    @Override
    public ArrayList<Tweets> GetBookmarks(String CUsername){
        return SQL.DB.GetBookmarks(CUsername);        
    }
    @Override
    public ArrayList<Tweets> GetReplies(Integer Tweetid){
        return SQL.DB.GetReplies(Tweetid);        
    }
    @Override
    public  ArrayList<Tweets> GetLikedTweets(String CUsername){
        return SQL.DB.GetLikedTweets(CUsername);
    }
    @Override
    public ArrayList<Users> GetLikers(Integer Tweetid){
        return SQL.DB.GetLikers(Tweetid);        
    }
    @Override
    public ArrayList<Tweet> GetUserTweets(String CUsername){
        return SQL.DB.GetUserTweets(CUsername);
    }
}
