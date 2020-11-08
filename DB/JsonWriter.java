import Tweet.Tweet;
import Tweet.Tweets;
import java.io.File;  
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;  
import java.io.IOException;  
import java.text.ParseException;

import org.json.simple.JSONArray;  
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class JsonWriter {  

   // public static void main(String[] args){
    //Retweet will be added in Tweets
    //	boolean Follow(String Username, String FollowerUName) {

      	boolean Follow(String Username, String FollowerUName)  throws org.json.simple.parser.ParseException, IOException {

                    JSONObject usern = new JSONObject();
		usern.put("UserName", Username);
                 System.out.println(usern);
	 JSONArray Followlist = new JSONArray();
         
		 Followlist.add(FollowerUName);
                    //System.out.println(usern);

		 usern.put("Followlist", Followlist);
                                     System.out.println(usern);

		 try {  

	            File file=new File("Followlist.json");  
	            file.createNewFile();  
	            FileWriter fileWriter = new FileWriter(file,true); 
                    System.out.println(usern);

	            fileWriter.write(usern.toJSONString());
//	            
	            fileWriter.flush();  
	            fileWriter.close();  

	        } catch (IOException e) {  
	            e.printStackTrace();  
	        }  
	
	 	JSONParser jsonParser = new JSONParser();
         
	        try    {
                    FileReader reader = new FileReader("Followlist.json");

//	            System.out.println(obj);
//	             
	      } 
catch (IOException e) {
	            e.printStackTrace();
	        }
//
//	            
//	            
//
//		 
                  return false;
        }

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
