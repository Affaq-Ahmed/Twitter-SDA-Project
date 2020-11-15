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
import DB.*;
import PlainText.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.json.simple.parser.ParseException;


/**
 *
 * @author HP
 */
public class TwitterDBimp implements TwitterDB {

    @Override
    public int Signup(UsersD user) {
        char a1 = 0;
        try {
            a1 = Configure.ConfigureDB();
        } catch (IOException ex) {
            Logger.getLogger(TwitterDBimp.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (a1=='d')
            return DB.Signup(user);
        else if(a1=='f'){
            try {
                    return ain.Signup(user);
            } catch (IOException | ParseException ex) {
                Logger.getLogger(TwitterDBimp.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return 0;
    }

    @Override
    public int Login(UsersD user) {
        char a1 = 0;
        try {
            a1 = Configure.ConfigureDB();
        } catch (IOException ex) {
            Logger.getLogger(TwitterDBimp.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (a1=='d')
            return DB.Login(user);
        else if(a1=='f'){
            try {
            return ain.Login(user);
        } catch (IOException | ParseException ex) {
            Logger.getLogger(TwitterDBimp.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
        return 0;

    }

    @Override
    public int Follow(String CUsername, String Username) {
        char a1 = 0;
        try {
            a1 = Configure.ConfigureDB();
        } catch (IOException ex) {
            Logger.getLogger(TwitterDBimp.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (a1=='d')
            return DB.Follow(CUsername, Username);
        else if(a1=='f'){
            try {
                //return DB.Follow(CUsername, Username);
                return ain.Follow(CUsername, Username);
            } catch (IOException | ParseException ex) {
                Logger.getLogger(TwitterDBimp.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return 0;
    }

    @Override
    public int UnFollow(String CUsername, String Username) {
//        return DB.UnFollow(CUsername, Username);
        char a1 = 0;
        try {
            a1 = Configure.ConfigureDB();
        } catch (IOException ex) {
            Logger.getLogger(TwitterDBimp.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (a1=='d')
            return DB.UnFollow(CUsername, Username);
        else if(a1=='f'){
                try {
                //return DB.Follow(CUsername, Username);
                return ain.UnFollow(CUsername, Username);
            } catch (IOException | ParseException ex) {
                Logger.getLogger(TwitterDBimp.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return 0;
    }

    @Override
    public ArrayList<Users> GetFollowing(String CUsername) {
        
        char a1 = 0;
        try {
            a1 = Configure.ConfigureDB();
        } catch (IOException ex) {
            Logger.getLogger(TwitterDBimp.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (a1=='d')
            return DB.GetFollowing(CUsername);
        else if(a1=='f'){
//                try {
//                return ain.GetFollowing(CUsername);
//            } catch (IOException | ParseException ex) {
//                Logger.getLogger(TwitterDBimp.class.getName()).log(Level.SEVERE, null, ex);
//            }
        }
        return null;
    }

    @Override
    public ArrayList<Users> GetFollowers(String CUsername) {
        char a1 = 0;
        try {
            a1 = Configure.ConfigureDB();
        } catch (IOException ex) {
            Logger.getLogger(TwitterDBimp.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (a1=='d')
            return DB.GetFollowers(CUsername);
        else if(a1=='f'){
//                try {
//                return ain.GetFollowers(CUsername);
//            } catch (IOException | ParseException ex) {
//                Logger.getLogger(TwitterDBimp.class.getName()).log(Level.SEVERE, null, ex);
//            }
        }
        return null;
    }

    @Override
    public ArrayList<Users> GetBlockedUsers(String CUsername) {
        char a1 = 0;
        try {
            a1 = Configure.ConfigureDB();
        } catch (IOException ex) {
            Logger.getLogger(TwitterDBimp.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (a1=='d')
            return DB.GetBlockedUsers(CUsername);
        else if(a1=='f'){
//                try {
//                return ain.GetBlockedUsers(CUsername);
//            } catch (IOException | ParseException ex) {
//                Logger.getLogger(TwitterDBimp.class.getName()).log(Level.SEVERE, null, ex);
//            }
        }
        return null;
    }

    @Override
    public int Tweet(String CUsername, String Text) {
        
        char a1 = 0;
        try {
            a1 = Configure.ConfigureDB();
        } catch (IOException ex) {
            Logger.getLogger(TwitterDBimp.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (a1=='d')
            return DB.Tweet(CUsername, Text);
        else if(a1=='f'){
//                try {
//                return ain.Tweet(CUsername, Text);
//            } catch (IOException | ParseException ex) {
//                Logger.getLogger(TwitterDBimp.class.getName()).log(Level.SEVERE, null, ex);
//            }
        }
        return 0;
    }

    @Override
    public int Retweet(Integer TweetId, String CUsername, String Text) {
        
        char a1 = 0;
        try {
            a1 = Configure.ConfigureDB();
        } catch (IOException ex) {
            Logger.getLogger(TwitterDBimp.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (a1=='d')
            return DB.Retweet(TweetId, CUsername, Text);
        else if(a1=='f'){
//                try {
//                return ain.Retweet(TweetId, CUsername, Text);
//            } catch (IOException | ParseException ex) {
//                Logger.getLogger(TwitterDBimp.class.getName()).log(Level.SEVERE, null, ex);
//            }
        }
        return 0;
    }

    @Override
    public int Block(String CUsername, String Username) {
        
        char a1 = 0;
        try {
            a1 = Configure.ConfigureDB();
        } catch (IOException ex) {
            Logger.getLogger(TwitterDBimp.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (a1=='d')
            return DB.Block(CUsername, Username);
        else if(a1=='f'){
//                try {
//                return DB.Block(CUsername, Username);
//            } catch (IOException | ParseException ex) {
//                Logger.getLogger(TwitterDBimp.class.getName()).log(Level.SEVERE, null, ex);
//            }
        }
        return 0;
    }

    @Override
    public int Like(String CUsername, Integer TweetId) {
        
        char a1 = 0;
        try {
            a1 = Configure.ConfigureDB();
        } catch (IOException ex) {
            Logger.getLogger(TwitterDBimp.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (a1=='d')
            return DB.Like(CUsername, TweetId);
        else if(a1=='f'){
//                try {
//                return ain.Like(CUsername, TweetId);
//            } catch (IOException | ParseException ex) {
//                Logger.getLogger(TwitterDBimp.class.getName()).log(Level.SEVERE, null, ex);
//            }
        }
        return 0;
    }

    @Override
    public int Bookmark(String CUsername, Integer TweetId) {
        
        char a1 = 0;
        try {
            a1 = Configure.ConfigureDB();
        } catch (IOException ex) {
            Logger.getLogger(TwitterDBimp.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (a1=='d')
            return DB.Bookmark(CUsername, TweetId);
        else if(a1=='f'){
//                try {
//                return ain.Bookmark(CUsername, TweetId);
//            } catch (IOException | ParseException ex) {
//                Logger.getLogger(TwitterDBimp.class.getName()).log(Level.SEVERE, null, ex);
//            }
        }
        return 0;
    }

    @Override
    public int Reply(String CUsername, Integer TweetId, String Text) {
        
        char a1 = 0;
        try {
            a1 = Configure.ConfigureDB();
        } catch (IOException ex) {
            Logger.getLogger(TwitterDBimp.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (a1=='d')
            return DB.Reply(CUsername, TweetId, Text);
        else if(a1=='f'){
//                try {
//                return ain.Reply(CUsername, TweetId, Text);
//            } catch (IOException | ParseException ex) {
//                Logger.getLogger(TwitterDBimp.class.getName()).log(Level.SEVERE, null, ex);
//            }
        }
        return 0;
    }

    @Override
    public int Dm(String CUsername, String Username, String Text) {
        
        char a1 = 0;
        try {
            a1 = Configure.ConfigureDB();
        } catch (IOException ex) {
            Logger.getLogger(TwitterDBimp.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (a1=='d')
            return DB.Dm(CUsername, Username, Text);
        else if(a1=='f'){
//                try {
//                return ain.Dm(CUsername, Username, Text);
//            } catch (IOException | ParseException ex) {
//                Logger.getLogger(TwitterDBimp.class.getName()).log(Level.SEVERE, null, ex);
//            }
        }
        return 0;
    }

    @Override
    public ArrayList<Users> Search(String Text) {
        
        char a1 = 0;
        try {
            a1 = Configure.ConfigureDB();
        } catch (IOException ex) {
            Logger.getLogger(TwitterDBimp.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (a1=='d')
            return DB.Search(Text);
        else if(a1=='f'){
//                try {
//                return ain.Search(Text);
//            } catch (IOException | ParseException ex) {
//                Logger.getLogger(TwitterDBimp.class.getName()).log(Level.SEVERE, null, ex);
//            }
        }
        return null;
    }

    @Override
    public ArrayList<Message> Chat(String CUsername, String Username) {
        
        char a1 = 0;
        try {
            a1 = Configure.ConfigureDB();
        } catch (IOException ex) {
            Logger.getLogger(TwitterDBimp.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (a1=='d')
            return DB.Chat(CUsername, Username);
        else if(a1=='f'){
//                try {
//                return ain.Chat(CUsername, Username);
//            } catch (IOException | ParseException ex) {
//                Logger.getLogger(TwitterDBimp.class.getName()).log(Level.SEVERE, null, ex);
//            }
        }
        return null;
    }

    @Override
    public ArrayList<Tweets> GetBookmarks(String CUsername) {
        char a1 = 0;
        try {
            a1 = Configure.ConfigureDB();
        } catch (IOException ex) {
            Logger.getLogger(TwitterDBimp.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (a1=='d')
            return DB.GetBookmarks(CUsername);
        else if(a1=='f'){
//                try {
//                return ain.GetBookmarks(CUsername);
//            } catch (IOException | ParseException ex) {
//                Logger.getLogger(TwitterDBimp.class.getName()).log(Level.SEVERE, null, ex);
//            }
        }
        return null;
    }

    @Override
    public ArrayList<Tweets> GetReplies(Integer Tweetid) {
        
        char a1 = 0;
        try {
            a1 = Configure.ConfigureDB();
        } catch (IOException ex) {
            Logger.getLogger(TwitterDBimp.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (a1=='d')
            return DB.GetReplies(Tweetid);
        else if(a1=='f'){
//                try {
//                return ain.GetReplies(Tweetid);
//            } catch (IOException | ParseException ex) {
//                Logger.getLogger(TwitterDBimp.class.getName()).log(Level.SEVERE, null, ex);
//            }
        }
        return null;
    }

    @Override
    public ArrayList<Tweets> GetLikedTweets(String CUsername) {
        
        char a1 = 0;
        try {
            a1 = Configure.ConfigureDB();
        } catch (IOException ex) {
            Logger.getLogger(TwitterDBimp.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (a1=='d')
            return DB.GetLikedTweets(CUsername);
        else if(a1=='f'){
//                try {
//                return ain.GetLikedTweets(CUsername);
//            } catch (IOException | ParseException ex) {
//                Logger.getLogger(TwitterDBimp.class.getName()).log(Level.SEVERE, null, ex);
//            }
        }
        return null;
    }

    @Override
    public ArrayList<Users> GetLikers(Integer Tweetid) {
        
        char a1 = 0;
        try {
            a1 = Configure.ConfigureDB();
        } catch (IOException ex) {
            Logger.getLogger(TwitterDBimp.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (a1=='d')
            return DB.GetLikers(Tweetid);
        else if(a1=='f'){
//                try {
//                return ain.GetLikers(Tweetid);
//            } catch (IOException | ParseException ex) {
//                Logger.getLogger(TwitterDBimp.class.getName()).log(Level.SEVERE, null, ex);
//            }
        }
        return null;
    }

    @Override
    public ArrayList<Tweets> GetUserTweets(String CUsername) {
        
        char a1 = 0;
        try {
            a1 = Configure.ConfigureDB();
        } catch (IOException ex) {
            Logger.getLogger(TwitterDBimp.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (a1=='d')
            return DB.GetUserTweets(CUsername);
        else if(a1=='f'){
//                try {
//                return ain.GetUserTweets(CUsername);
//            } catch (IOException | ParseException ex) {
//                Logger.getLogger(TwitterDBimp.class.getName()).log(Level.SEVERE, null, ex);
//            }
        }
        return null;
    }

    @Override
    public String GetName(String Username) {
        
        char a1 = 0;
        try {
            a1 = Configure.ConfigureDB();
        } catch (IOException ex) {
            Logger.getLogger(TwitterDBimp.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (a1=='d')
            return DB.GetName(Username);
        else if(a1=='f'){
//                try {
//                return ain.GetName(Username);
//            } catch (IOException | ParseException ex) {
//                Logger.getLogger(TwitterDBimp.class.getName()).log(Level.SEVERE, null, ex);
//            }
        }
        return null;
    }
    
}
