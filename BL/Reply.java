
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
class Reply extends Tweet {
    String RUsername,RTweetId;

    public Reply(String TweetId, String Text, String Username, List<Reply> Replies, List<String> Likers,String RUsername,String RTweetId) {
        super(TweetId, Text, Username, Replies, Likers);
        this.RTweetId=RTweetId;
        this.RUsername=RUsername;
    }
}
