package MongoJavaPrograms;

import com.mongodb.MongoClient;
import com.mongodb.MongoCredential;
import com.mongodb.client.MongoDatabase;

public class ConnectToDatabase {

	public static void main(String[] args) {
		
		// Creating a Mongo client 
	      MongoClient mongo = new MongoClient( "localhost" , 27017 ); 
	   
	       
	      
	      //Connecting to the database 
	      MongoDatabase database = mongo.getDatabase("myDb");
	      System.out.println("Connected Successfully");
	      System.out.println("Database Name"+database.getName()); } 

	}


