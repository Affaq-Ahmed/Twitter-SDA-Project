package Json;
import java.util.Arrays;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;


public class ain {

	public ain() {
		// TODO Auto-generated constructor stub
	}

	@SuppressWarnings("unchecked")
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
	
	}
	
		
	
			
			
	
		 
	 
		
	
		
	
	
}
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
		String name=user.Username;
		jobj=(JSONObject)jobj.get(name);
		//System.out.println("User : "+jobj );
		//users doesnt exist for login
		if(jobj==null) {
		//	return -1; //user doesnt exist ..we can add him
			
			JSONObject obj3=new JSONObject();
			obj3.put("Username", name);
			obj3.put("Password", user.Password);
			jobj_2.put(name, obj3);
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
 *   public int Follow(String CUsername,String Username) throws IOException, ParseException
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
			return -1; //user doesnt exist ..we can add him
			//System.out.println("User doesnt exist" );

			}
		else//user exists now check for follow
		{
			JSONArray array=(JSONArray)jobj.get("Following");
			//System.out.println("Array : "+array );
			for(int i=0;i<array.size();i++)
			{
				String follower=(String)array.get(i);
				System.out.println("Follower : "+i+follower );
				
				if(Username.equals(follower))
						{
					flag=true;
					//Follower already exits
				//	System.out.println("User already has this follower" );

					return 0;
						}
				else
				{
					flag=false;
				}
				
					
			}
			if(!flag) {
				//Follower doesnt exist before so add him/her
				array.add(Username);
				//System.out.println("Follower Added" );

			}
			
			//System.out.println("Followers after addition : "+obj );
			FileWriter writer=new FileWriter("File.json");
			writer.write(obj.toString());
			writer.flush();
			return 1;//done ,follower added

		}

		
		}
 */
/*
 *
 * //unfollow
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
					return -1; //user doesnt exist ..
					//System.out.println("User doesnt exist" );

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
						return 0;//Follower doeosnt exist
					}
					
				//	System.out.println("Followers after addition : "+obj );
					
					//return 1;//done ,follower added

				}
				return 0;
				}
 */
