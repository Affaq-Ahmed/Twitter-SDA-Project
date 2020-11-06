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
    
    static int Signup(User user){
        return 0;
    }
    static int Login(User user){
        return 0;
    }
    static int Tweet(String CUsername,String Text){
        return 0;
    }
    static int Follow(String CUsername,String Username){
        return 0;
    }
    static int UnFollow(String CUsername,String Username){
        return 0;
    }
    static int Retweet(String TweetId,String Username,String CUsername,String Text){
        return 0;
    }
    static int Dm(String CUsername,String Username,String Text){
        return 0;
    }
    static int Block(String CUsername,String Username){
        return 0;
    }
    static int Like(String CUsername,String TweetId,String Username){
        return 0;
    }
    static int Bookmark(String CUsername,String TweetId,String Username){
        return 0;
    }
    static int Reply(String CUsername,String TweetId,String Username,String Text){
        return 0;
    }
}
