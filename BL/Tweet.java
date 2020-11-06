
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
class Tweet {
    String TweetId,Text,Username;
    List<Reply> Replies;
    List<String> Likers;

    public Tweet(String TweetId, String Text, String Username, List<Reply> Replies, List<String> Likers) {
        this.TweetId = TweetId;
        this.Text = Text;
        this.Username = Username;
        this.Replies = Replies;
        this.Likers = Likers;
    }
    
//    public int AddTweet(){
//        int Tweet = TwitterDB.Tweet(this.Username, this.Text);
//        this.TweetId = String.valueOf(Tweet);
//        return Tweet;
//    }
}
