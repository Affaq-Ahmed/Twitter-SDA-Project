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
    
    int Signup(User user);
    int Login(User user);
    int Tweet(String CUsername,String Text);
    int Follow(String CUsername,String Username);
    int UnFollow(String CUsername,String Username);
    int Retweet(String TweetId,String Username,String CUsername,String Text);
    int Dm(String CUsername,String Username,String Text);
    int Block(String CUsername,String Username);
    int Like(String CUsername,String TweetId,String Username);
    int Bookmark(String CUsername,String TweetId,String Username);
    int Reply(String CUsername,String TweetId,String Username,String Text);
}
