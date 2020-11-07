/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tweet;

import User.*;
import java.util.ArrayList;

/**
 *
 * @author HP
 */
public class TweetsDetailed extends Tweets {
    public ArrayList<Tweets> Replies;
    public ArrayList<Users> Likers;

    public TweetsDetailed(ArrayList<Tweets> Replies, ArrayList<User.Users> Likers, User.Users User, Integer TweetId, String Text) {
        super(User, TweetId, Text);
        this.Replies = Replies;
        this.Likers = Likers;
    }
}
