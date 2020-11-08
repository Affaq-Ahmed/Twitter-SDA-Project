import Tweet.Tweet;
import Tweet.Tweets;
import java.io.File;  
import java.io.FileWriter;  
import java.io.IOException;  

import org.json.simple.JSONArray;  
import org.json.simple.JSONObject;

public class JsonWriter {  

   // public static void main(String[] args){
    //Retweet will be added in Tweets
		public void reTweet(Tweets retweet) {
	
		 	JSONObject Obj = new JSONObject();  
		 	Obj.put("username", retweet.User);
                        Obj.put("tweetid", retweet.TweetId);
		 	Obj.put("tweet_text",retweet.Text); 
                        
		 //	Obj.put("username", "Khizar");
                   //     Obj.put("tweetid",12);
		 	//Obj.put("tweet_text","Retweeted text"); 
		
		
	        try {  

	            File file=new File("JsonRetweet.json");  
	            file.createNewFile();  //create file
	            FileWriter fileWriter = new FileWriter(file); 

	            fileWriter.write(Obj.toJSONString());
                    System.out.print("Successfully DOne\n");  

	            fileWriter.flush();  
	            fileWriter.close();  

	        } catch (IOException e) {  
	            e.printStackTrace();  
	        }  
	}  
}