package Json;
import java.util.ArrayList;
import java.util.Arrays;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;
import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;


public class ain {

	public ain() {
		// TODO Auto-generated constructor stub
	}

	@SuppressWarnings({ "unchecked", "null" })
	public static void main(String[] args) throws IOException, ParseException
	{
/*		// TODO Auto-generated method stub
JSONParser jsonparser=new JSONParser();
	
	FileReader reader=new FileReader("File.json");
	Object obj=jsonparser.parse(reader);
	
	JSONObject jobj=(JSONObject)obj;
	System.out.println(jobj);
jobj=(JSONObject)jobj.get("User");
	System.out.println("Username: "+ jobj.get("Username"));
	
	//System.out.println(	(String)jobj.get("lname"));

	JSONArray array=(JSONArray)jobj.get("Following");
	System.out.println("Followings: ");

	for(int i=0;i<array.size();i++) {
//JSONObject address=(JSONObject)array.get(i);
//System.out.println(	 (String) address.get("Street"));
//System.out.println(	 (String) address.get("City"));
		System.out.println(array.get(i));


	}
	System.out.println(jobj);


	JSONObject jobj1=new JSONObject();
	jobj1.put("Username",1);
	JSONArray array1=new JSONArray();
	array1.add(2);
	array1.add(2);
	array1.add(2);

	jobj1.put("Following",array1);
	System.out.println(jobj1);
	JSONObject jobj2=new JSONObject();

	jobj2.put("User", jobj);
	System.out.println("NEW \n "+jobj2);

	jobj2.put("User1", jobj1);

//	JSONObject jobj3=new JSONObject();

	System.out.println("NEW \n "+jobj2);

	@SuppressWarnings("resource")
	FileWriter writer=new FileWriter("File.json");
	writer.write(jobj2.toString());
	writer.flush();
	
	}*/
	
	
	//writing to json
/*	{
		JSONObject jobj=new JSONObject();
		JSONObject jobj1=new JSONObject();

	jobj.put("fname","Someone1");
	jobj.put("lname","Someone2");
	JSONArray array=new JSONArray();
	jobj1.put("Street","Stree1");
	jobj1.put("City","City1");
	array.add(jobj1);
	//jobj1.put("Street","Street2");
	//jobj1.put("City","City2");
	//array.add(jobj1);


	jobj.put("address",array);
	
	FileWriter writer=new FileWriter("File.json");
writer.write(jobj.toString());
writer.flush();
}*/
	
		
	
	/*		
			if(!flag) {
				//Follower doesnt exist before so add him/her
			//	System.out.println("!FLag= "+array1);

				array1.add(Tweetid);

				//System.out.println("!FLag= "+array1);

			}
			
			if(!check) {
			//	System.out.println("objvh : "+obj );
				//System.out.println("objvh : "+json1 );

		JSONObject js=(JSONObject)obj;
			js.put(CUsername,json1 );
		FileWriter writer=new FileWriter("Bookmarks.json");
			writer.write(js.toString());
					writer.flush();
			}
			else
			{
		//	System.out.println("obj : "+obj );
		FileWriter writer=new FileWriter("Bookmarks.json");
				writer.write(obj.toString());
					writer.flush();
					}
		
		
		*/

		 
		
	
	
		
	}
	}

				//String u_ser=(String)array.get(j);//will get the followings in  number
				//System.out.println("Following var : "+following );
/*
				
				if(tuser_jobj!=null) {
			//	System.out.println("USer follow"+tuser_jobj );

				String name=(String)tuser_jobj.get("Name");
				//System.out.println("USer string"+name );

									
				Users u;
				u.Name=name;
				u.Username=following;
				arr.add(u);
					return u;	*/
				//arr.add(name);
				
				//ArrayList<Users> arr = new ArrayList<>();
		
	
	
	

/*
  public int Login(UsersD user) throws IOException, ParseException
	{
	JSONParser jsonparser=new JSONParser();
		
		FileReader reader=new FileReader("Users.json");
		Object obj=jsonparser.parse(reader);
		
		JSONObject jobj=(JSONObject)obj;
		System.out.println(jobj+ "\nsize" + jobj.size() );
		for(int i=0;i<jobj.size();i++)
		{
			
		}
		String name=user.Username;
		jobj=(JSONObject)jobj.get(name);
		//System.out.println("User : "+jobj );
		//users doesnt exist for login
		if(jobj==null) {
			return -1;
			}
		else//user indeed exists
		{
			//check if the passward is correct or not
			if(jobj.get("Password").equals(user.Password)))
			{
				//System.out.println("Password MAtched"+ jobj.get("Password") );
				return 1;

			}
			else
			{
				//System.out.println("Password not MAtched" + jobj.get("Password") );
				return 0;

			}
			
		}
	}
 
 */ 	

/*
    public int Signup(UsersD user) throws IOException, ParseException

			{
				JSONParser jsonparser=new JSONParser();

				FileReader reader=new FileReader("Users.json");
				Object obj=jsonparser.parse(reader);
				//System.out.println("OBJ : "+obj );

				JSONObject jobj=(JSONObject)obj;
				JSONObject jobj_2=(JSONObject)obj;//exact copy of previous one  to use next

				//System.out.println(jobj+ "\nsize" + jobj.size() );
				for(int i=0;i<jobj.size();i++)
				{
					
				}
				String uname=user.Username;
			//	String uname="khizar";

String xx=uname.concat("\n");
jobj=(JSONObject)jobj.get(uname);
				//System.out.println("User : "+jobj );
				//users doesnt exist for login
				if(jobj==null) {

					try {
					    Files.write(Paths.get("AllUsers.txt"), xx.getBytes(), StandardOpenOption.APPEND);
					}catch (IOException e) {
					    //exception handling left as an exercise for the reader
					}
					
					JSONObject obj3=new JSONObject();
					obj3.put("Username", uname);
					obj3.put("Password",user.Password );
								obj3.put("Name", uname);

					jobj_2.put(uname, obj3);
				//	System.out.println("User ADDED"+jobj_2+"\n" );
		//writing to file now
					FileWriter writer=new FileWriter("Users.json");
					writer.write(jobj_2.toString());
					writer.flush();
					return 1;//done ,user added
					}
				else
				{
					return 0;//Already exists
				}
		}
			
 */



/*
  public int Follow(String CUsername,String Username) throws IOException, ParseException
		 {
		
		
		String CUsername="qasim";
		String Username="khizar";
		 	JSONParser jsonparser=new JSONParser();
		 		JSONObject json1=new JSONObject();

		 		FileReader reader=new FileReader("File.json");
		 		Object obj=jsonparser.parse(reader);
		 		//System.out.println("OBJ : "+obj );

		 		JSONObject jobj=(JSONObject)obj;
		 		//JSONObject jobj_2=(JSONObject)obj;//exact copy of previous one  to use next

		 		//System.out.println(jobj+ "\nsize" + jobj.size() );
		 		for(int i=0;i<jobj.size();i++)
		 		{
		 			
		 		}
		 		boolean flag=false;
		 		//String name=user.Username;
		 		jobj=(JSONObject)jobj.get(CUsername);
		 		//System.out.println("User : "+jobj );
		 		//users doesnt exist for login
		 		if(jobj==null) //user doesnt even exist ,exit function
		 	{
		 		//	return -1; 
		 		//System.out.println("User doesnt exist" );
		 		JSONObject json=new JSONObject();
		 		json.put("Username", CUsername);
		 JSONArray jarr=new JSONArray();
		 jarr.add("#Following");
		 json.put("Following", jarr);
		 //json1.put("qasim", json);
		 json1=json;
		 		}
		 		else
		 		{
		 			json1=jobj;
		 		}
		 		//else//user exists now check for follow
		 	//	{
		 		
		 //System.out.println("obj : "+json1 );

		 		//JSONObject jj=(JSONObject)json1.get("qasim");
		 		//System.out.println("jj : "+jj );

		 			JSONArray array1=(JSONArray)json1.get("Following");
		 			
		 			//System.out.println("Array : "+array );
		 			//System.out.println("Array1 : "+array1);
		 		//	System.out.println("Username : "+json1.get("Username"));
		 			//System.out.println("New User add in File.json : "+json1);

		 	
		 			//block users check ---------username has blocked Cusernames
		 			FileReader reader2=new FileReader("BlockFile.json");
			 		Object obj2=jsonparser.parse(reader2);
		 			JSONObject jobbj=(JSONObject)obj2;
		 			jobbj=(JSONObject)jobbj.get("hassan");
		 		
		 			
		 			
		 			if(jobbj!=null) {
		 				JSONArray arrr=new JSONArray();
			 			arrr=(JSONArray)jobbj.get("BlockList");
			 			System.out.println("block : "+jobbj );
for(int k=0;k<arrr.size();k++)
{
	if(CUsername.equals(arrr.get(k)))
	{
		//	System.out.println("return 0" );
return 0;
	}
}
		 			}
		 			
		 			
		 			
		 			
		 			
		 			
		 			//user1 has blocked user2
		 			FileReader reader3=new FileReader("BlockFile.json");
			 		Object obj3=jsonparser.parse(reader3);
		 			JSONObject jobbj3=(JSONObject)obj3;
		 			jobbj3=(JSONObject)jobbj3.get(CUsername);
		 		
		 			
		 			
		 			if(jobbj3!=null) {
		 				JSONArray arrr=new JSONArray();
			 			arrr=(JSONArray)jobbj3.get("BlockList");
			 			System.out.println("block : "+jobbj3 );
for(int k=0;k<arrr.size();k++)
{
	if(Username.equals(arrr.get(k)))
	{
			//System.out.println("return -1" );
return -1;
	}
}
		 			}
		 			
		 			
		 			
		 			
		 			
		 			
		 			
		 			
		 			
		 			for(int i=0;i<array1.size();i++)
		 			{
		 				String follower=(String)array1.get(i);
		 				System.out.println("Follower : "+i+follower );
		 				
		 				if(Username.equals(follower))
		 						{
		 					flag=true;
		 					//Follower already exits
		 					//System.out.println("User already has this follower" );

		 					return -2;
		 						}
		 				else
		 				{
		 					flag=false;
		 				}
		 				
		 					
		 			}
		 			
		 			if(!flag) {
		 				//Follower doesnt exist before so add him/her
		 				array1.add(Username);
		 			//	System.out.println("Follower Added : "+json1 );

		 			}
		 			JSONObject js=(JSONObject)obj;
		 			js.put(CUsername,json1 );
		 			
		 	//	System.out.println("Followers after addition : "+js );
		 			
		 		FileWriter writer=new FileWriter("File.json");
		 	writer.write(js.toString());
		 			writer.flush();
		 			return 1;//done ,follower added


		 		
		 		}
 */
/*
 *
    public int UnFollow(String CUsername,String Username)throws IOException, ParseException
			  {
						JSONParser jsonparser=new JSONParser();

						FileReader reader=new FileReader("File.json");
						Object obj=jsonparser.parse(reader);
						//System.out.println("OBJ : "+obj );

						JSONObject jobj=(JSONObject)obj;
						//JSONObject jobj_2=(JSONObject)obj;//exact copy of previous one  to use next

						//System.out.println(jobj+ "\nsize" + jobj.size() );
						for(int i=0;i<jobj.size();i++)
						{
							
						}
						boolean flag=false;
						//String name=user.Username;
						jobj=(JSONObject)jobj.get(CUsername);
						//System.out.println("User : "+jobj );
						//users doesnt exist for login
						if(jobj==null) //user doesnt even exist ,exit function
						{
							return 0; //user doesnt exist ..
							//System.out.println("Users are not friend exist" );

							}
						else//user exists now check for follow
						{
							JSONArray array=(JSONArray)jobj.get("Following");
							//System.out.println("Array : "+array );
							for(int i=0;i<array.size();i++)
							{
								String follower=(String)array.get(i);
								//System.out.println("Follower : "+i+follower );
								
								if(Username.equals(follower))
										{
									//remove the follower
									flag=true;
									array.remove(i);
									//System.out.println(" unfollowed" );
									FileWriter writer=new FileWriter("File.json");
									writer.write(obj.toString());
									writer.flush();
									//System.out.println("End Array : "+array );

			//break;
									return 1;//unfollowed
										}
								else
								{
									flag=false;
								}
								
									
							}
							if(!flag) {
								//Follower doesnot exist
			//					System.out.println("Follower doest exist " );
		//
							//	return 0;//Follower doeosnt exist
							}
							
						//	System.out.println("Followers after addition : "+obj );
							
							//return 1;//done ,follower added

						}
						return 0;
					} */


















/*

//public ArrayList<Users> GetFollowing(String CUsername)throws IOException, ParseException
				{	
		ArrayList<Users> arr = new ArrayList<>();
		JSONParser jsonparser=new JSONParser();

		FileReader reader=new FileReader("File.json");
		Object obj=jsonparser.parse(reader);
		//System.out.println("OBJ : "+obj );

		JSONObject jobj=(JSONObject)obj;
		//JSONObject jobj_2=(JSONObject)obj;//exact copy of previous one  to use next

		//System.out.println(jobj+ "\nsize" + jobj.size() );
	
		//String name=user.Username;
		jobj=(JSONObject)jobj.get(CUsername);
		//System.out.println("User : "+jobj );
		//users doesnt exist for login
		if(jobj==null) //user doesnt even exist ,exit function
		{
			return null; //user doesnt exist ..
		//	System.out.println("User doesnt exist" );

			}
		else//user exists now check for follow
		{
			FileReader reader1=new FileReader("Users.json");
			Object uobj=jsonparser.parse(reader1);//to get the "Name" from users file
			JSONObject user_jobj=(JSONObject)uobj;
			//System.out.println("USer FILE"+user_jobj );

			JSONArray array=(JSONArray)jobj.get("Following");
		
			if(array.size()<1) {
				return null;
				//System.out.println("This user is not following anyone");
			}
			else
			{
				for(int i=0;i<array.size();i++)
				{

					String following=(String)array.get(i);//will get the followings in  number
					//System.out.println("Following var : "+following );
	if(following.equals("#Following"))
	{
		array.remove(i);
	}
				}
			
			for(int i=0;i<array.size();i++)
			{

				String following=(String)array.get(i);//will get the followings in  number
				//System.out.println("Following var : "+following );

			JSONObject	tuser_jobj=(JSONObject)user_jobj.get(following);
				
				if(tuser_jobj!=null) {
			//	System.out.println("USer follow"+tuser_jobj );

				String name=(String)tuser_jobj.get("Name");
			//	System.out.println("USer string"+name );

									
				Users u;
				u.Name=name;
				u.Username=following;
				arr.add(u);
						
				//arr.add(name);
				}
				//ArrayList<Users> arr = new ArrayList<>();
		
			}
			//System.out.println("RESULT");
		//	for(int i=0;i<array.size();i++)
	//	{
		//	String x =arr.get(i);
	//	System.out.println(x);
//			}

				}

*/
	
	
	
	
	
	/*
	 * 
	 *    public int Tweet(String CUsername,String Text)throws IOException, ParseException
	   {	   
	JSONParser jsonparser=new JSONParser();
int tvar=0;

	FileReader reader=new FileReader("Tweets.json");
	Object obj=jsonparser.parse(reader);

	File file = new File("TweetVar.txt");
	 
    try (Scanner sc = new Scanner(file, StandardCharsets.UTF_8.name())) {
        while (sc.hasNextLine()){
            tvar=sc.nextInt();
            tvar++;
        }
    }
    catch (IOException e) {
        e.printStackTrace();
    }
    
    
	JSONObject jobj=(JSONObject)obj;
	JSONObject jobj2 = new JSONObject();
	jobj2.put("Username",CUsername );
	jobj2.put("Text",Text );
	jobj.put(tvar, jobj2);
	//JSONObject jobj_2=(JSONObject)obj;//exact copy of previous one  to use next

	System.out.println(jobj+ "\nsize" + jobj.size() );
	//tvar=10;
	  FileWriter myWriter = new FileWriter("TweetVar.txt");
myWriter.write(new Integer(tvar).toString());
     myWriter.close();
	
		
//writing to file now
		@SuppressWarnings("resource")
		FileWriter writer=new FileWriter("Tweets.json");
		writer.write(jobj.toString());
		writer.flush();
		writer.close();
	//	return 1;//done ,user added
		return 1;
		
}
	
	}
	 * 
	 * 
	 * */



/*
 * 
 * 
 *  public int Retweet(Integer TweetId,String CUsername,String Text){
		JSONParser jsonparser=new JSONParser();
		int tvar=0;

			FileReader reader=new FileReader("Tweets.json");
			Object obj=jsonparser.parse(reader);

			File file = new File("TweetVar.txt");
			 
		    try (Scanner sc = new Scanner(file, StandardCharsets.UTF_8.name())) {
		        while (sc.hasNextLine()){
		            tvar=sc.nextInt();
		            tvar++;
		        }
		    }
		    catch (IOException e) {
		        e.printStackTrace();
		    }
		    
		    
			JSONObject jobj=(JSONObject)obj;
			JSONObject jobj2 = new JSONObject();
			jobj2.put("Username",CUsername );
			jobj2.put("Text",Text);
			jobj.put(tvar, jobj2);
			//JSONObject jobj_2=(JSONObject)obj;//exact copy of previous one  to use next

		//	System.out.println(jobj+ "\nsize" + jobj.size() );
			//tvar=10;
			  FileWriter myWriter = new FileWriter("TweetVar.txt");
		myWriter.write(new Integer(tvar).toString());
		     myWriter.close();
			
			//	System.out.println("Tweet FILE: "+ jobj);

		//writing to file now
			@SuppressWarnings("resource")
				FileWriter writer=new FileWriter("Tweets.json");
				writer.write(jobj.toString());
			writer.flush();
				writer.close();
				//done ,user added
				//return 1;
				
		
		
		
	///Tweet function end	
			
				///File file = new File("TweetVar.txt");
				 
			    try (Scanner sc = new Scanner(file, StandardCharsets.UTF_8.name())) {
			        while (sc.hasNextLine()){
			            tvar=sc.nextInt();
			           
			        }
			    }
			    catch (IOException e) {
			        e.printStackTrace();
			    }
			    
				FileReader retweet_reader=new FileReader("Retweets.json");
			
				//System.out.println("IF");

				Object objj=jsonparser.parse(retweet_reader);
				JSONObject jobjj=(JSONObject)objj;
				JSONObject jobjj_2=new JSONObject();
				
				jobjj_2.put("Retweetid",tvar );
				jobjj_2.put("Tweetid",TweetId);
				jobjj.put(tvar, jobjj_2);
			//	System.out.println("RETWWT FILE: "+ jobjj);

				
				FileWriter writer1=new FileWriter("Retweets.json");
				writer1.write(jobjj.toString());
			writer1.flush();
				writer1.close();
				return 1;
				}
 */
	

/*
 * 	
 *   public int Reply(String CUsername,Integer TweetId,String Text)
		{
		JSONParser jsonparser=new JSONParser();
		int tvar=0;

			FileReader reader=new FileReader("Tweets.json");
			Object obj=jsonparser.parse(reader);

			File file = new File("TweetVar.txt");
			 
		    try (Scanner sc = new Scanner(file, StandardCharsets.UTF_8.name())) {
		        while (sc.hasNextLine()){
		            tvar=sc.nextInt();
		            tvar++;
		        }
		    }
		    catch (IOException e) {
		        e.printStackTrace();
		    }
		    
		    
			JSONObject jobj=(JSONObject)obj;
			JSONObject jobj2 = new JSONObject();
			jobj2.put("Username",CUsername );
			jobj2.put("Text",Text);
			jobj.put(tvar, jobj2);
			//JSONObject jobj_2=(JSONObject)obj;//exact copy of previous one  to use next

		//	System.out.println(jobj+ "\nsize" + jobj.size() );
			//tvar=10;
			  FileWriter myWriter = new FileWriter("TweetVar.txt");
		myWriter.write(new Integer(tvar).toString());
		     myWriter.close();
			
			//	System.out.println("Tweet FILE: "+ jobj);

		//writing to file now
			@SuppressWarnings("resource")
				FileWriter writer=new FileWriter("Tweets.json");
				writer.write(jobj.toString());
			writer.flush();
				writer.close();
				//done ,user added
				//return 1;
				
		
		
		
	///Tweet function end	
			
				///File file = new File("TweetVar.txt");
				 
			    try (Scanner sc = new Scanner(file, StandardCharsets.UTF_8.name())) {
			        while (sc.hasNextLine()){
			            tvar=sc.nextInt();
			           
			        }
			    }
			    catch (IOException e) {
			        e.printStackTrace();
			    }
			    
				FileReader retweet_reader=new FileReader("Replys.json");
			
				//System.out.println("IF");

				Object objj=jsonparser.parse(retweet_reader);
				JSONObject jobjj=(JSONObject)objj;
				JSONObject jobjj_2=new JSONObject();
				
				jobjj_2.put("Replyid",tvar );
				jobjj_2.put("Tweetid",TweetId);
				jobjj.put(tvar, jobjj_2);
			//	System.out.println("RETWWT FILE: "+ jobjj);

				
				FileWriter writer1=new FileWriter("Replys.json");
				writer1.write(jobjj.toString());
			writer1.flush();
				writer1.close();
				return 1;
		}
		
*/
 
/*

		    public int Block(String CUsername,String Username);
	{
		  
		JSONParser jsonparser=new JSONParser();
		JSONObject json1=new JSONObject();

		FileReader reader=new FileReader("BlockFile.json");
		Object obj=jsonparser.parse(reader);
		//System.out.println("OBJ : "+obj );

		JSONObject jobj=(JSONObject)obj;
		//JSONObject jobj_2=(JSONObject)obj;//exact copy of previous one  to use next

		//System.out.println(jobj+ "\nsize" + jobj.size() );
		for(int i=0;i<jobj.size();i++)
		{
			
		}
		boolean flag=false;
		//String name=user.Username;
		jobj=(JSONObject)jobj.get(CUsername);
		//System.out.println("User : "+jobj );
		//users doesnt exist for login
		if(jobj==null) //user doesnt even exist ,exit function
	{
		//	return -1; 
		//System.out.println("User doesnt exist" );
		JSONObject json=new JSONObject();
		json.put("Username", CUsername);
JSONArray jarr=new JSONArray();
jarr.add("#BlockList");
json.put("BlockList", jarr);
//json1.put("qasim", json);
json1=json;
		}
		else
		{
			json1=jobj;
		}
		//else//user exists now check for follow
	//	{
		
//System.out.println("obj : "+json1 );

		//JSONObject jj=(JSONObject)json1.get("qasim");
		//System.out.println("jj : "+jj );

			JSONArray array1=(JSONArray)json1.get("BlockList");
			
			//System.out.println("Array : "+array );
			//System.out.println("Array1 : "+array1);
		//	System.out.println("Username : "+json1.get("Username"));
			//System.out.println("New User add in File.json : "+json1);

	
			for(int i=0;i<array1.size();i++)
			{
				String block=(String)array1.get(i);
			//	System.out.println("block : "+i+block );
				
				if(Username.equals(block))
						{
					flag=true;
					//Follower already exits
				//	System.out.println("User already has this user blocked" );

					//return 0;
						}
				else
				{
					flag=false;
				}
				
					
			}
			
			if(!flag) {
				//Follower doesnt exist before so add him/her
				array1.add(Username);
			//	System.out.println("Follower Added : "+json1 );

			}
			JSONObject js=(JSONObject)obj;
			js.put(CUsername,json1 );
			
	//	System.out.println("Followers after block : "+js );
			
		FileWriter writer=new FileWriter("BlockFile.json");
		writer.write(js.toString());
			writer.flush();
			//return 1;//done ,follower added
			  }
*/








/*
 	//    public int Like(String CUsername,Integer Tweetid)
		{JSONParser jsonparser=new JSONParser();
		JSONObject json1=new JSONObject();

		
		//String CUsername="safdar";
		//int Tweetid=1;
		FileReader reader=new FileReader("Likes.json");
		Object obj=jsonparser.parse(reader);
		//System.out.println("OBJ : "+obj );

		JSONObject jobj=(JSONObject)obj;
		//JSONObject jobj_2=(JSONObject)obj;//exact copy of previous one  to use next

		//System.out.println(jobj+ "\nsize" + jobj.size() );
		for(int i=0;i<jobj.size();i++)
		{
			
		}
		boolean flag=false;
		Boolean check=false;
		//String name=user.Username;
	//	System.out.println("User : "+jobj );

		jobj=(JSONObject)jobj.get(new Integer(Tweetid).toString());
		//System.out.println("User : "+jobj );
		//users doesnt exist for login
		if(jobj==null) //user doesnt even exist ,exit function
	{
		//	return -1; 
		//System.out.println("User doesnt " );
		JSONObject json=new JSONObject();
		json.put("Tweetid", Tweetid);
JSONArray jarr=new JSONArray();
jarr.add("#Username");
json.put("Usernames", jarr);
//json1.put("qasim", json);
json1=json;
		}
		else
		{
			json1=jobj;
			check=true;
			
		}
		//else//user exists now check for follow
	//	{
		
//System.out.println("obj : "+json1 );

		//JSONObject jj=(JSONObject)json1.get("qasim");
		//System.out.println("jj : "+jj );

			JSONArray array1=(JSONArray)json1.get("Usernames");
			
			//System.out.println("Array : "+array );
			//System.out.println("Array1 : "+array1);
		//	System.out.println("Username : "+json1.get("Username"));
			//System.out.println("New User add in File.json : "+json1);

	
			for(int i=0;i<array1.size();i++)
			{
				String u_ser=(String)array1.get(i);
			//	System.out.println("Follower : "+i+u_ser );
				
				if(CUsername.equals(u_ser))
						{
					flag=true;
					//Follower already exits
				//	System.out.println("User already has already liked this tweet" );

				//	return 0;
						}
				else
				{
					flag=false;
				}
				
					
			}
			
			if(!flag) {
				//Follower doesnt exist before so add him/her
			//	System.out.println("!FLag= "+array1);

				array1.add(CUsername);

			//	System.out.println("!FLag= "+array1);

			}
			if(!check) {
		JSONObject js=(JSONObject)obj;
			js.put(Tweetid,json1 );
			FileWriter writer=new FileWriter("Likes.json");
				writer.write(js.toString());
					writer.flush();
			}
			else
			{
			//	System.out.println("obj : "+obj );
			FileWriter writer=new FileWriter("Likes.json");
					writer.write(obj.toString());
					writer.flush();
			}
		//System.out.println("Followers after addition : "+js );
			
	//	FileWriter writer=new FileWriter("Likes.json");
	//	writer.write(js.toString());
		//	writer.flush();
			//return 1;//done ,follower added
			  }
*/
 

/*
 * 
 * 
 * 
 * 
public ArrayList<Users> GetLikers(Integer Tweetid)
{
	ArrayList<Users> arr = new ArrayList<>();
	//ArrayList<String> arr = new ArrayList<>();
//int TweetId=1;
	JSONParser jsonparser=new JSONParser();

	FileReader reader=new FileReader("Likes.json");
	Object obj=jsonparser.parse(reader);
	//System.out.println("OBJ : "+obj );

	JSONObject jobj=(JSONObject)obj;
	//JSONObject jobj_2=(JSONObject)obj;//exact copy of previous one  to use next

	//System.out.println(jobj+ "\nsize" + jobj.size() );

	//String name=user.Username;
	jobj=(JSONObject)jobj.get(new Integer(TweetId).toString());
	//System.out.println("User : "+jobj );
	//users doesnt exist for login
	if(jobj==null) //user doesnt even exist ,exit function
	{
		return null; //user doesnt exist ..
	//	System.out.println("No Likes for this tweet");

		}
	else//user exists now check for follow
	{
		FileReader reader1=new FileReader("Users.json");
		Object uobj=jsonparser.parse(reader1);//to get the "Name" from users file
		JSONObject user_jobj=(JSONObject)uobj;
		//System.out.println("USer FILE"+user_jobj );

		JSONArray array=(JSONArray)jobj.get("Usernames");
	//	System.out.println(" Array"+array);

		if(array.size()<1) {
			return null;
		//	System.out.println("This tweet has no ");
		}
		else
		{
		for(int i=0;i<array.size();i++)
		{

			String u_ser=(String)array.get(i);//will get the followings in  number
			//System.out.println("Following var : "+following );

		JSONObject	tuser_jobj=(JSONObject)user_jobj.get(u_ser);
			
			if(tuser_jobj!=null) {
		//	System.out.println("USer follow"+tuser_jobj );

			String name=(String)tuser_jobj.get("Name");
			//System.out.println("USer string"+name );

								
			Users u;
			u.Name=name;
			u.Username=following;
			arr.add(u);
				return u;	
			//arr.add(name);
			}
			//ArrayList<Users> arr = new ArrayList<>();
	
		}
		
		}
		*/



/*
 
public ArrayList<Tweets> GetLikedTweets(String CUsername)
{
		File file = new File("TweetVar.txt");
		 int tvar=0;
	    try (Scanner sc = new Scanner(file, StandardCharsets.UTF_8.name())) {
	        while (sc.hasNextLine()){
	            tvar=sc.nextInt();
	            
	        }
	    }
	    catch (IOException e) {
	        e.printStackTrace();
	    }
	    //tvar has the tweet id of the latest tweet
	   
	    	
	    
		
	    
	    ArrayList<Tweets> arr = new ArrayList<>();
	  
	    String u_name;
	//	ArrayList<String> arr = new ArrayList<>();
		JSONObject json=new JSONObject();
	//String CUsername="khizar";
		JSONParser jsonparser=new JSONParser();

		FileReader reader=new FileReader("Likes.json");
		Object obj=jsonparser.parse(reader);
		//System.out.println("OBJ : "+obj );

		JSONObject jobj=(JSONObject)obj;
		//JSONObject jobj_2=(JSONObject)obj;//exact copy of previous one  to use next

		//System.out.println(jobj+ "\nsize" + jobj.size() );
		 for(int i=tvar;i>0;i--)
		    {
		//String name=user.Username;

		
		if((JSONObject)jobj.get(new Integer(i).toString())!=null)
		{
			
		json=(JSONObject)jobj.get(new Integer(i).toString());//if tweet with this id exist it will be returned in json object
			//System.out.println("i:"+i+"User:"+json);
			JSONArray array=(JSONArray)json.get("Usernames");
			
			if(array.size()<1) {
			//	return null;
				//System.out.println("This tweet has no likes ");
			}
			else
			{
			for(int j=0;j<array.size();j++)
			{
				if(CUsername.equals(array.get(j)))//check if that List of usernames has our CUsername
				{
				//	System.out.println("YESSS USER FOUND");
					FileReader reader1=new FileReader("Users.json");
					Object uobj=jsonparser.parse(reader1);//to get the "Name" from users file
					JSONObject user_jobj=(JSONObject)uobj;
					JSONObject	tuser_jobj=(JSONObject)user_jobj.get(CUsername);
					String name=(String)tuser_jobj.get("Name");
				//	System.out.println("User name :"+name ); //got the name of the username
					u_name=name;
					break;
					//to get tweet and its data
				

				}
				
			 }
			}
			
			FileReader reader2=new FileReader("Tweets.json");
			Object tobj=jsonparser.parse(reader2);
			JSONObject tweet_jobj=(JSONObject)tobj;
			JSONObject	t_jobj=(JSONObject)tweet_jobj.get(new Integer(i).toString());
			Tweets tw;
			tw.TweetId=i;
			tw.User.Username=CUsername;
			tw.User.Name=u_name;
			tw.Text=(String)t_jobj.get("Text");
			arr.add(tw);
//		/	System.out.println("Tweetr : "+t_jobj );
		}
	

}
		 return arr;
	}
		 */



/*

public ArrayList<Tweets> GetReplies(Integer Tweetid)
{
	File file = new File("TweetVar.txt");
	 int tvar=0;
    try (Scanner sc = new Scanner(file, StandardCharsets.UTF_8.name())) {
        while (sc.hasNextLine()){
            tvar=sc.nextInt();
            
        }
    }
    catch (IOException e) {
        e.printStackTrace();
    }
    //tvar has the tweet id of the latest tweet
   
    	
    
	
    
    ArrayList<Tweets> arr = new ArrayList<>();
  
    String u_name;
	//ArrayList<String> arr = new ArrayList<>();
	JSONObject json=new JSONObject();
	int TweetId=1;
//String CUsername="khizar";
	JSONParser jsonparser=new JSONParser();

	FileReader reader=new FileReader("Replys.json");
	Object obj=jsonparser.parse(reader);
	//System.out.println("OBJ : "+obj );

	JSONObject jobj=(JSONObject)obj;
	//JSONObject jobj_2=(JSONObject)obj;//exact copy of previous one  to use next

	//System.out.println(jobj+ "\nsize" + jobj.size() );
	 for(int i=tvar;i>0;i--)
	    {
	//String name=user.Username;

	
	if((JSONObject)jobj.get(new Integer(i).toString())!=null)
	{
		
	json=(JSONObject)jobj.get(new Integer(i).toString());//if tweet with this id exist it will be returned in json object
		System.out.println("i:"+i+"User:"+json);
		//JSONArray array=(JSONArray)json.get("Replyid");
	int Temp_id=Integer.parseInt(json.get("Replyid").toString());//This temp id is the one we will look for in tweet file
		System.out.println(Temp_id);
		FileReader reader1=new FileReader("Tweets.json");
		Object uobj=jsonparser.parse(reader1);//to get the "Name" from users file
		JSONObject user_jobj=(JSONObject)uobj;
		JSONObject	tuser_jobj=(JSONObject)user_jobj.get(new Integer(Temp_id).toString());
		System.out.println(tuser_jobj);
String name_u=(String)tuser_jobj.get("Username");
System.out.println(name_u);


FileReader reader2=new FileReader("Users.json");
Object uobj2=jsonparser.parse(reader2);//to get the "Name" from users file
JSONObject user_jobj2=(JSONObject)uobj2;


user_jobj2=(JSONObject)user_jobj2.get(name_u);


JSONObject jjss=(JSONObject)user_jobj2;
String User_Name=(String)user_jobj2.get("Username");

String simp_Name=(String)user_jobj2.get("Name");
System.out.println("THIS IS USER   "+simp_Name);
System.out.println("THIS IS USER   "+User_Name);


String txtx=(String)tuser_jobj.get("Text");
System.out.println("THIS IS USER   "+txtx);
Tweets tw;
tw.TweetId=Temp_id;
tw.User.Username=User_Name;
tw.User.Name=name_u;
tw.Text=txtx;
arr.add(tw);




}
	    }
	 return arr;
	 }
*/


/*
    public ArrayList<Users> GetBlockedUsers(String CUsername)
		{

	//	String CUsername="qasim";
	    ArrayList<Users> array = new ArrayList<>();

		JSONParser jsonparser=new JSONParser();
		JSONObject json1=new JSONObject();

		FileReader reader=new FileReader("BlockFile.json");
		Object obj=jsonparser.parse(reader);

		JSONObject jobj=(JSONObject)obj;

		jobj=(JSONObject)jobj.get(CUsername);
		JSONArray arr=new JSONArray();
		arr=(JSONArray)jobj.get("BlockList");
		//System.out.println(arr+ "\nsize" + jobj.size() );
		
		for(int i=0;i<arr.size();i++)
		{
			if(arr.get(i).equals("#BlockList"))
			{
				arr.remove(i);
			}
		}
	//	System.out.println(arr+ "\nsize::" + arr.size() );

		for(int i=0;i<arr.size();i++)
		{
			Users uu;
			FileReader reader1=new FileReader("Users.json");
			Object uobj=jsonparser.parse(reader1);//to get the "Name" from users file
			JSONObject user_jobj=(JSONObject)uobj;
			JSONObject	tuser_jobj=(JSONObject)user_jobj.get(arr.get(i));
			String name=(String)tuser_jobj.get("Name");
		//	System.out.println("User name :"+name ); //got the name of the username
			
			uu.Username=arr.get(i);
			uu.Name=name;
			array.add(uu);
		//	u_name=name;
		}
		
		
	return array;}
 */






/*
   public int Bookmark(String CUsername,Integer Tweetid)
		{
		JSONParser jsonparser=new JSONParser();
		JSONObject json1=new JSONObject();

		
	//	String CUsername="hammad";
		//int Tweetid=2;
		FileReader reader=new FileReader("Bookmarks.json");
		Object obj=jsonparser.parse(reader);
		//System.out.println("OBJ : "+obj );

		JSONObject jobj=(JSONObject)obj;
		
		boolean flag=false;
		boolean check=false;
		//String name=user.Username;
	//	System.out.println("User : "+jobj );

		jobj=(JSONObject)jobj.get(CUsername);
		//System.out.println("User : "+jobj );
		//users doesnt exist for login
		if(jobj==null) //user doesnt even exist ,exit function
	{
		//	return -1; 
		//System.out.println("User doesnt " );
		JSONObject json=new JSONObject();
		json.put("Username", CUsername);
JSONArray jarr=new JSONArray();
jarr.add(0);
json.put("Tweetids", jarr);
//json1.put("qasim", json);
json1=json;
		}
		else
		{
			json1=jobj;
			check=true;
			
		}
		//else//user exists now check for follow
	//	{
		
//System.out.println("obj : "+json1 );

		//JSONObject jj=(JSONObject)json1.get("qasim");
		//System.out.println("jj : "+jj );

			JSONArray array1=(JSONArray)json1.get("Tweetids");
			
		//System.out.println("Array : "+array1 );
			//System.out.println("Array1 : "+array1);
		//	System.out.println("Username : "+json1.get("Username"));
			//System.out.println("New User add in File.json : "+json1);

	
			for(int i=0;i<array1.size();i++)
			{
			//	int temp=(int)array1.get(i);
				int temp=Integer.parseInt(array1.get(i).toString());
			//	System.out.println("Follower : "+i+u_ser );
				
				if(Tweetid==temp)
						{
					flag=true;
					//Follower already exits
				//	System.out.println("User already has already liked this tweet" );
					array1.remove(i);
				//	return 0;
						}
				else
				{
					flag=false;
				}
				
					
			}
			
			if(!flag) {
				//Follower doesnt exist before so add him/her
			//	System.out.println("!FLag= "+array1);

				array1.add(Tweetid);

				//System.out.println("!FLag= "+array1);

			}
			
			if(!check) {
			//	System.out.println("objvh : "+obj );
				//System.out.println("objvh : "+json1 );

		JSONObject js=(JSONObject)obj;
			js.put(CUsername,json1 );
		FileWriter writer=new FileWriter("Bookmarks.json");
			writer.write(js.toString());
					writer.flush();
			}
			else
			{
		//	System.out.println("obj : "+obj );
		FileWriter writer=new FileWriter("Bookmarks.json");
				writer.write(obj.toString());
					writer.flush();
					}
		return 1;	}*/




/*
public ArrayList<Tweets> GetBookmarks(String CUsername)
{
ArrayList<Tweets> ar = new ArrayList<>();

JSONParser jsonparser=new JSONParser();
JSONObject json1=new JSONObject();


//	String CUsername="hammad";
//int Tweetid=2;
FileReader reader=new FileReader("Bookmarks.json");
Object obj=jsonparser.parse(reader);
//System.out.println("OBJ : "+obj );

JSONObject jobj=(JSONObject)obj;

boolean flag=false;
boolean check=false;
//String name=user.Username;
//	System.out.println("User : "+jobj );

jobj=(JSONObject)jobj.get(CUsername);
//System.out.println("User : "+jobj );
//users doesnt exist for login
if(jobj==null)
{
return -1;
}

//else//user exists now check for follow
//	{

//System.out.println("obj : "+json1 );

//JSONObject jj=(JSONObject)json1.get("qasim");
//System.out.println("jj : "+jj );

	JSONArray array1=(JSONArray)jobj.get("Tweetids");
	
//	System.out.println("Array : "+array1 );
	//System.out.println("Array1 : "+array1);
//	System.out.println("Username : "+json1.get("Username"));
	//System.out.println("New User add in File.json : "+json1);


	for(int i=0;i<array1.size();i++)
	{
	//	int temp=(int)array1.get(i);
		int temp=Integer.parseInt(array1.get(i).toString());
	//	System.out.println("Follower : "+i+u_ser );
		
		if(temp!=0)
				{
			flag=true;
			FileReader reader2=new FileReader("Tweets.json");
			Object tobj=jsonparser.parse(reader2);
			JSONObject tweet_jobj=(JSONObject)tobj;
			//	System.out.println("OOOBBBJJJ : "+i+tweet_jobj);

			JSONObject	t_jobj=(JSONObject)tweet_jobj.get(new Integer(i).toString());
		//	System.out.println("Precise : "+i+t_jobj);

			String trt=(String)t_jobj.get("Text");
		//	String uname=(String)t_jobj.get("Username");
			int tid=i;
			
			
			
			FileReader reader1=new FileReader("Users.json");
			Object uobj=jsonparser.parse(reader1);//to get the "Name" from users file
			JSONObject user_jobj=(JSONObject)uobj;
			//System.out.println("USer FILE"+user_jobj );

			user_jobj=(JSONObject)user_jobj.get(CUsername);
			//System.out.println("USer FILE"+user_jobj );
			String nname=(String)user_jobj.get("Name");
		//	System.out.println("USer FILE"+user_jobj );
			//System.out.println("USer name"+nname );

			
			Tweets tw;
			tw.TweetId=i;
			tw.User.Username=CUsername;
			tw.User.Name=nname;
			tw.Text=trt;
			ar.add(tw);
			//Follower already exits
		//	System.out.println("User already has already liked this tweet" );
			
		//	return 0;
				}
		
		
			
	}
	return ar;
}
*/



/*
    public int GetName(String Username) throws IOException, ParseException
   {
	//	String CUsername="khizar";
		JSONParser jsonparser=new JSONParser();

		FileReader reader1=new FileReader("Users.json");
		Object uobj=jsonparser.parse(reader1);//to get the "Name" from users file
		JSONObject user_jobj=(JSONObject)uobj;
		//System.out.println("USer FILE"+user_jobj );

		user_jobj=(JSONObject)user_jobj.get(CUsername);
		//System.out.println("USer FILE"+user_jobj );
		String nname=(String)user_jobj.get("Name");
		//System.out.println("NAME : "+nname);

		return nname;
   }
 */
 
/*
 	
			
		
		//   public ArrayList<Users> GetFollowers(String CUsername)
		{
		ArrayList<Users> res = new ArrayList<>();
//String CUsername="hammad";
		ArrayList<String> arr = new ArrayList<>();
		File file = new File("AllUsers.txt");
		 try (Scanner sc = new Scanner(file, StandardCharsets.UTF_8.name())) {
	        while (sc.hasNextLine()){
	          
	        	String ss=sc.next();
	        	if(!(ss.equals("#Users")))
	          arr.add(ss) ;
	        
	        }
	    }
	    catch (IOException e) {
	        e.printStackTrace();
	    }
		
			JSONParser jsonparser=new JSONParser();

		 FileReader reader=new FileReader("File.json");
			Object obj=jsonparser.parse(reader);
		
			for(int i=0;i<arr.size();i++) {
			JSONObject jobj=(JSONObject)obj;
			//System.out.println(jobj );

			jobj=(JSONObject)jobj.get(arr.get(i));
		if(jobj!=null) {	
			//System.out.println(jobj );

			//JSONObject jobjj=new JSONObject();
			JSONArray array1=(JSONArray)jobj.get("Following");			
			
			for(int j=0;j<array1.size();j++)
			{
				if(array1.get(j).equals(CUsername))
				{
					Users uu;
					
					uu.Username=(String)jobj.get("Username");
			uu.Name=	GetName(uu.Username);//username ka name

				res.add(uu);
				
				}
			}
			
			
			}
			}
		//	String name=user.Username;
			//jobj=(JSONObject)jobj.get(name);
		 
		 
		 return res;
} 
 */
