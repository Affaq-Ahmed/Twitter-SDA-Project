/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tweet;

import User.*;

/**
 *
 * @author HP
 */
public class Tweets extends Tweet {
    public Users User;
    
    public Tweets(User.Users User, Integer TweetId, String Text) {
        super(TweetId, Text);
        this.User = User;
    }
    public Tweets() {
    }
}
