package MongoJavaPrograms;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoDatabase;

public class CreateCollection {

	public static void main(String[] args) {
	
		// Creating a Mongo client 
	      MongoClient mongo = new MongoClient( "localhost" , 27017 ); 
	      System.out.println("server connected successfully");
	     
	    
	      
	      //Accessing the database 
	      MongoDatabase database = mongo.getDatabase("myDb");
	      System.out.println("Connected Successfully");
	      System.out.println("Database Name"+database.getName());
	      
	      //Creating a collection 
	      database.createCollection("DDhyd"); 
	      System.out.println("Collection created successfully"); 
	   } 

	}


