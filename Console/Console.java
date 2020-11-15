/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Console;

import Message.Message;
import Tweet.Tweets;
import java.io.IOException;
import java.util.Scanner;
import TwitterGUI.*;
import sql.SQL;
import User.*;
import java.util.ArrayList;

/**
 *
 * @author HP
 */
public class Console {
    private static final Scanner scanner = new Scanner( System. in);
    public static void Startup(){
        System.out.println("1.Login\n2.Signup\nSelect Option (1 or 2) : ");
        String x; 
        while(true){
            x= scanner. nextLine();
            switch (x) {
                case "1" -> Login();
                case "2" -> Signup();
                default -> {
                    System.out.println("\nSorry Invalid option. Try again!!\n");
                }
            }
        }
    }
    public static void Menu(){
        String x; 
        while(true){
            System.out.println("\n1.Search\n2.Follow User\n3.UnFollow User\n4.Block User"
                    + "\n5.Add a Tweet\n6.See Followers\n7.See following\n8.See Blocked Users"
                    + "\n9.View Tweets\n10.View Liked Tweets\n11.View Bookmarked Tweets\n12.Open Chat"
                            + "\nSelect Option : ");
            x= scanner. nextLine();
            switch (x) {
                case "1" -> Search();
                case "2" -> Follow();
                case "3" -> UnFollow();
                case "4" -> BlockUser();
                case "5" -> Tweet();
                case "6" -> GetFollowers();
                case "7" -> GetFollowing();
                case "8" -> GetBlockedUsers();
                case "9" ->{
                int GetUserTweets = GetUserTweets();
                if(GetUserTweets==1)
                    Tweetmenu();
                }
                case "10" ->{ 
                int GetLikedTweets = GetLikedTweets();
                if(GetLikedTweets==1)
                    Tweetmenu();
                }
                case "11" ->{
                int GetBookmarkedTweets = GetBookmarkedTweets();
                if(GetBookmarkedTweets==1)
                    Tweetmenu();
                }
                case "12" -> OpenChat();
                default -> System.out.println("\nSorry Invalid option. Try again!!");
            }
        }
    }
    public static void Tweetmenu(){
        String x=""; 
        while(true&&!"7".equals(x)){
            System.out.println("1.Like Tweet\n2.Retweet\n3.Reply\n4.Bookmark Tweet"
                    + "\n5.View Replies\n6.View Likers\n7.Main menu\n"
                            + "\nSelect Option : ");
            x= scanner. nextLine();
            switch (x) {
                case "1" -> Liketweet();
                case "2" -> ReTweet();
                case "3" -> Reply();
                case "4" -> Bookmarktweet();
                case "5" -> GetReplies();
                case "6" -> GetLikers();
                case "7" -> {}
                default -> System.out.println("\nSorry Invalid option. Try again!!");
            }
        }
    }
    public static void Login(){
        System. out. print( "\nEnter Username : ");
        String Username = scanner. nextLine();
        System. out. print( "Enter Password : ");
        String Password= scanner.nextLine();
        int Login = SQL.user.Login(Username, Password);
//        System.out.print(Login);
        if(Login==1)
            Menu();
        else{
            System. out. print( "\nSorry. Failed to Login. Try again!!\n");
            Startup();
        }
    }
    public static void Signup(){
        System. out. print( "\nEnter Username : ");
        String Username = scanner. nextLine();
        System. out. print( "Enter Name : ");
        String Name = scanner. nextLine();
        System. out. print( "Enter Password : ");
        String Password= scanner.nextLine();
        int Signup = SQL.user.Signup(Username, Name ,Password);
//        System.out.print(Signup);
        if(Signup==1)
            Menu();
        else{
            System. out. print( "\nSorry. Failed to Signup. Try again!!");
            Startup();
        }
    }
    private static void Search() {
        System.out.println("Enter : ");
        String x; 
        x= scanner.nextLine();
        ArrayList<Users> users=SQL.user.Search(x);
        if(users==null)
            System.out.println("\nInvalid");
        else{
            if(users.isEmpty())
                System.out.println("\nNo Results Found!");
            for(int i=0;i<users.size();i++)
                System.out.println("Username: "+users.get(i).Username+" , Name: "+users.get(i).Name);
        }
    }
    private static void Follow() {
        System.out.println("Enter Username : ");
        String x; 
        x= scanner.nextLine();
        int Follow = SQL.user.Follow(SQL.user.Username,x);
        switch (Follow) {
                case 0 -> System.out.println("\nSorry Either "+x+" has Blocked you. or User doesnot Exist!");
                case -1 -> System.out.println("\nSorry You have Blocked "+x);
                case -2 -> System.out.println("\nSorry You are already following "+x);
                case 1 -> System.out.println("\nSuccessfully Followed!!");
                case 2 -> System.out.println("\nCant follow Yourself!!");
            }
    }
    private static void UnFollow() {
        System.out.println("Enter Username : ");
        String x; 
        x= scanner.nextLine();
        int UnFollow = SQL.user.UnFollow(SQL.user.Username,x);
        switch (UnFollow) {
                case 0 -> System.out.println("\nSorry you are not following or user does not exist "+x);
                case 1 -> System.out.println("\nSuccessfully Unfollowed!!");
            }
    }
    private static void BlockUser() {
        System.out.println("Enter Username : ");
        String x; 
        x= scanner.nextLine();
        int Block = SQL.user.Block(SQL.user.Username,x);
        switch (Block) {
                case 0 -> System.out.println("\n"+x + " does not exist or it is my Id");
                case 1 -> System.out.println("\nSuccessfully Blocked!!");
                case -1 -> System.out.println("\nSorry you have already Blocked. Unblocked Successfully. "+x);
            }
    }
    private static void ReTweet() {
        System.out.println("Enter Tweetid : ");
        String Tid;
        Tid= scanner.nextLine();
        System.out.println("Enter Text : ");
        String x;
        x= scanner.nextLine();
        int Retweet = SQL.user.Retweet(Integer.parseInt(Tid),SQL.user.Username,x);
        switch (Retweet) {
                case 0 -> System.out.println("\nSorry Retweet failed. No such tweet exist");
                case 1 -> System.out.println("\nSuccessfully Retweeted!!");
            }
    }
    private static void Tweet() {
        System.out.println("Enter Text : ");
        String x;
        x= scanner.nextLine();        
        int Tweet = SQL.user.Tweet(SQL.user.Username,x);
        switch (Tweet) {
                case 0 -> System.out.println("\nSorry Tweet failed.");
                case 1 -> System.out.println("\nSuccessfully Tweeted!!");
            }
    }
    private static void GetFollowers(){
        System.out.println("Enter M(for my followers) Or Username : ");
        String Username;
        Username= scanner.nextLine();
        ArrayList<Users> GetFollowers;
        if(Username.equals("M")||Username.equals("m"))
            GetFollowers = SQL.user.GetFollowers(SQL.user.Username);
        else
            GetFollowers = SQL.user.GetFollowers(Username);
        if(GetFollowers==null)
            System.out.println("\nInvalid username.");
        else{
            if(GetFollowers.isEmpty())
                System.out.println("\n Empty");
            for(int i=0;i<GetFollowers.size();i++)
            {
                System.out.println(i+1 + ". "+ GetFollowers.get(i).Name +"("+GetFollowers.get(i).Username+")");
            }
        }
    }
    private static void GetFollowing(){
        System.out.println("Enter M(for my followers) Or Username : ");
        String Username;
        Username= scanner.nextLine();
        if("M".equals(Username)||"m".equals(Username))
            Username=SQL.user.Username;
        ArrayList<Users> GetFollowing = SQL.user.GetFollowing(Username);
        if(GetFollowing==null)
            System.out.println("\nInvalid username.");
        else{
            if(GetFollowing.isEmpty())
                System.out.println("\n Empty");
            for(int i=0;i<GetFollowing.size();i++)
            {
            System.out.println(i+1 + ". "+ GetFollowing.get(i).Name +"("+GetFollowing.get(i).Username+")");
            }
        }
    }
    private static void GetBlockedUsers(){
        ArrayList<Users> GetBlockedUsers = SQL.user.GetBlockedUsers(SQL.user.Username);
        if(GetBlockedUsers==null)
            System.out.println("\nInvalid.");
        else{
            if(GetBlockedUsers.isEmpty())
                System.out.println("\n Empty");
            for(int i=0;i<GetBlockedUsers.size();i++)
            {
                System.out.println(i+1 + ". "+ GetBlockedUsers.get(i).Name +"("+GetBlockedUsers.get(i).Username+")");
            }
        }
    }
    private static void Liketweet(){
        System.out.println("Enter TweetId : ");
        String x; 
        x= scanner.nextLine();
        int Like = SQL.user.Like(SQL.user.Username,Integer.parseInt(x));
        switch (Like) {
                case -1 -> System.out.println("\nUnliked the Tweet. Was already liked.");
                case 1 -> System.out.println("\nSuccessfully Liked!!");
                case 0 -> System.out.println("\nNo such Tweet exist.");
            }
    }
    private static void Bookmarktweet(){
        System.out.println("Enter TweetId : ");
        String x; 
        x= scanner.nextLine();
        int Like = SQL.user.Bookmark(SQL.user.Username,Integer.parseInt(x));
        switch (Like) {
                case -1 -> System.out.println("\nRemoved from Bookmarks. Was already Bookmarked.");
                case 1 -> System.out.println("\nSuccessfully Bookmarked!!");
                case 0 -> System.out.println("\nNo Such Tweet exist.");
            }
    }
    private static void Reply() {
        System.out.println("Enter Tweetid : ");
        String Tid;
        Tid= scanner.nextLine();
        System.out.println("Enter Text : ");
        String x;
        x= scanner.nextLine();
        int Reply = SQL.user.Reply(SQL.user.Username,Integer.parseInt(Tid),x);
        switch (Reply) {
                case 0 -> System.out.println("\nSorry!! Reply failed. No such tweet exist.");
                case 1 -> System.out.println("\nSuccessfully Replied!!");
            }
    }
    private static void DirectMessage(String User){
        if(User==null){
            System.out.println("Enter Username : ");
            User= scanner.nextLine();
        }
        System.out.println("Enter Text : ");
        String x;
        x= scanner.nextLine();
        int Dm = SQL.user.Dm(SQL.user.Username,User,x);
        switch (Dm) {
                case 0 -> System.out.println("\nSorry!! Direct message failed.");
                case 1 -> System.out.println("\nSuccessfully Sent!!");
            }
    }
    private static void OpenChat(){
        System.out.println("Enter Username : ");
        String Username;
        Username= scanner.nextLine();
        ArrayList<Message> Chat = SQL.user.Chat(SQL.user.Username,Username);
        if(Chat==null)
            System.out.println("\nInvalid username.");
        else{
            if(Chat.isEmpty()){
                System.out.println("\n Empty");
            }
            for(int i=0;i<Chat.size();i++)
            {
                System.out.println("\nSender: "+ Chat.get(i).Sender.Name +" --- Receiver: "+Chat.get(i).Receiver.Name);
                System.out.println("Message : "+ Chat.get(i).Text);
            }
            System.out.println("\n");
            String x="";
            while(true&&!"2".equals(x)){
                System.out.println("1.Send Message\n2.Close Chat"
                                + "\nSelect Option : ");
                x= scanner. nextLine();
                switch (x) {
                    case "1" -> DirectMessage(Username);
                    case "2" -> {}
                    default -> {
                        System.out.println("\nSorry Invalid option. Try again!!\n");
                    }
                }           
            }
        }
    }
    private static int GetBookmarkedTweets(){
        ArrayList<Tweets> GetBookmarks = SQL.user.GetBookmarks(SQL.user.Username);
        if(GetBookmarks==null)
            System.out.println("\nInvalid");
        else{
            if(GetBookmarks.isEmpty()){
                System.out.println("\n Empty");
                return 0;
            }
            for(int i=0;i<GetBookmarks.size();i++)
            {
                System.out.println("\nName: "+ GetBookmarks.get(i).User.Name +" --- Username: "+GetBookmarks.get(i).User.Username);
                System.out.println("TweetID: "+GetBookmarks.get(i).TweetId+"\nText : "+ GetBookmarks.get(i).Text);
            }
            System.out.println("\n");
            return 1;
        }
        return 0;
    }
    private static int GetLikedTweets(){
        System.out.println("Enter M(for my LikedTweets) Or Username : ");
        String Username;
        Username= scanner.nextLine();
        if("M".equals(Username)||"m".equals(Username))
            Username=SQL.user.Username;
        ArrayList<Tweets> GetLikedTweets = SQL.user.GetLikedTweets(Username);
        if(GetLikedTweets==null)
            System.out.println("\nInvalid");
        else{
            if(GetLikedTweets.isEmpty()){
                System.out.println("\n Empty");
                return 0;
            }
            for(int i=0;i<GetLikedTweets.size();i++)
            {
                System.out.println("\nName: "+ GetLikedTweets.get(i).User.Name +" --- Username: "+GetLikedTweets.get(i).User.Username);
                System.out.println("TweetID: "+GetLikedTweets.get(i).TweetId+"\nText : "+ GetLikedTweets.get(i).Text);
            }
            System.out.println("\n");
            return 1;
        }
        return 0;
    }
    private static void GetReplies(){
        System.out.println("Enter TweetID : ");
        String Tid;
        Tid = scanner.nextLine();
        ArrayList<Tweets> GetReplies = SQL.user.GetReplies(Integer.parseInt(Tid));
        if(GetReplies==null)
            System.out.println("\nInvalid");
        else{
            if(GetReplies.isEmpty())
                System.out.println("\n Empty");
            for(int i=0;i<GetReplies.size();i++)
            {
                System.out.println("\nName: "+ GetReplies.get(i).User.Name +" --- Username: "+GetReplies.get(i).User.Username);
                System.out.println("TweetID: "+GetReplies.get(i).TweetId+"\nText : "+ GetReplies.get(i).Text);
            }
            System.out.println("\n");
        }
    }
    private static int GetUserTweets(){
        System.out.println("Enter M(for my Tweets) Or Username : ");
        String Username;
        Username= scanner.nextLine();
        if("M".equals(Username)||"m".equals(Username))
            Username=SQL.user.Username;
        ArrayList<Tweets> GetUserTweets = SQL.user.GetUserTweets(Username);
        if(GetUserTweets==null)
            System.out.println("\nInvalid");
        else{
            if(GetUserTweets.isEmpty())
            {
                System.out.println("\n Empty");
                return 0;
            }
            for(int i=0;i<GetUserTweets.size();i++)
            {
                System.out.println("\nName: "+ GetUserTweets.get(i).User.Name +" --- Username: "+GetUserTweets.get(i).User.Username);
                System.out.println("TweetID: "+GetUserTweets.get(i).TweetId+"\nText : "+ GetUserTweets.get(i).Text);
            }
            System.out.println("\n");
            return 1;
        }
        return 0;
    }
    private static void GetLikers(){
        System.out.println("Enter TweetID : ");
        String TweetID;
        TweetID= scanner.nextLine();
        ArrayList<Users> GetFollowers = SQL.user.GetLikers(Integer.parseInt(TweetID));
        if(GetFollowers==null)
            System.out.println("\nInvalid username.");
        else{
            if(GetFollowers.isEmpty())
                System.out.println("\n Empty");
            for(int i=0;i<GetFollowers.size();i++)
            {
                System.out.println(i+1 + ". "+ GetFollowers.get(i).Name +"("+GetFollowers.get(i).Username+")\n");
            }
        }
    }
}
