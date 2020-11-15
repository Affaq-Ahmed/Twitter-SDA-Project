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
    public int Signup(UsersD user);
    public int Login(UsersD user);
    public int Follow(String CUsername,String Username);
    public int UnFollow(String CUsername,String Username);
    public ArrayList<Users> GetFollowing(String CUsername);
    public ArrayList<Users> GetFollowers(String CUsername);
    public ArrayList<Users> GetBlockedUsers(String CUsername);
    public int Tweet(String CUsername,String Text);
    public int Retweet(Integer TweetId,String CUsername,String Text);
    public int Block(String CUsername,String Username);
    public int Like(String CUsername,Integer TweetId);
    public int Bookmark(String CUsername,Integer TweetId);
    public int Reply(String CUsername,Integer TweetId,String Text);
    public int Dm(String CUsername,String Username,String Text);
    public ArrayList<Users> Search(String Text);
//    public ArrayList<Tweets> HomeTweets(String CUsername);
    public ArrayList<Message> Chat(String CUsername,String Username);
    public ArrayList<Tweets> GetBookmarks(String CUsername);
    public ArrayList<Tweets> GetReplies(Integer Tweetid);
    public ArrayList<Tweets> GetLikedTweets(String CUsername);
    public ArrayList<Users> GetLikers(Integer Tweetid);
    public ArrayList<Tweets> GetUserTweets(String CUsername);
    public String GetName(String Username);
}
