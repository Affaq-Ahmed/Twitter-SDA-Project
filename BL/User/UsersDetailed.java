/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package User;
import Tweet.*;
import java.util.ArrayList;

/**
 *
 * @author HP
 */
public class UsersDetailed extends UsersD{
    public ArrayList<Users> Followers;
    public ArrayList<Users> Following;
    public ArrayList<Tweet> Tweets;
    public ArrayList<Tweets> Liked;
    public ArrayList<Tweets> Bookmarks;

    public UsersDetailed(ArrayList<Users> Followers, ArrayList<Users> Following, ArrayList<Tweet> Tweets, ArrayList<Tweets> Liked, ArrayList<Tweets> Bookmarks, String Password, String Username, String Name) {
        super(Password, Username, Name);
        this.Followers = Followers;
        this.Following = Following;
        this.Tweets = Tweets;
        this.Liked = Liked;
        this.Bookmarks = Bookmarks;
    }
    
}
