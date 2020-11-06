
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HP
 */
public class User {
    String Username,Name,Password;
    List<String> Followers;
    List<String> Following;
    List<Tweet> Tweets;
    
    public User(String Username, String Name, String Password, List<String> Followers, List<String> Following, List<Tweet> Tweets) {
        this.Username = Username;
        this.Name = Name;
        this.Password = Password;
        this.Followers = Followers;
        this.Following = Following;
        this.Tweets = Tweets;
    }
    public int Signup(User user){
        int Signup = TwitterDB.Signup(this);
        return Signup;
    }
    public int Login(User user){
        int Login = TwitterDB.Login(this);
        return Login;
    }
    public int Tweet(String Text){
        Tweets.add(0,new Tweet(null,Text,this.Username,null,null));
        int Tweet = Tweets.get(0).AddTweet();
        return Tweet;
    }

    public int Follow(String Username){
        int Follow = TwitterDB.Follow(this.Username, Username);
        return Follow;
    }
    public int UnFollow(String Username){
        int UnFollow = TwitterDB.UnFollow(this.Username, Username);
        return UnFollow;
    }
    public int Retweet(String TweetId,String Username,String Text){
        int Retweet = TwitterDB.Retweet(TweetId, Username, this.Username, Text);
        return Retweet;
    }
    public int Dm(String Username,String Text){
        Message Msg=new Message(Username,this.Username,Text);
        int Dm = Msg.Dm();
        return Dm;
    }
    public int Block(String Username){
        int Block = TwitterDB.Block(this.Username, Username);
        return Block;
    }
    public int Like(String TweetId,String Username){
        int Like = TwitterDB.Like(this.Username, TweetId, Username);
        return Like;
    }
    public int Bookmark(String TweetId,String Username){
        int Bookmark = TwitterDB.Bookmark(this.Username, TweetId, Username);
        return Bookmark;
    }
    public int Reply(String TweetId,String Username,String Text){
        int Reply = TwitterDB.Reply(this.Username, TweetId, Username, Text);
        return Reply;
    }
}
