package MongoJavaPrograms;

import java.util.Iterator;



import com.mongodb.MongoClient;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import com.mongodb.client.model.Updates;

public class UpdatingDocument {

	public static void main(String[] args) {
		
		 // Creating a Mongo client 
	      MongoClient mongo = new MongoClient( "localhost" , 27017 ); 
	     
	        
	      
	      // Accessing the database 
	      MongoDatabase database = mongo.getDatabase("myDb"); 
	      
	      // Retrieving a collection 
	      MongoCollection collection = database.getCollection("samplecollection");
	      System.out.println("Collection myCollection selected successfully"); 
	      
	      collection.updateOne(Filters.eq("name","srisharanya"), Updates.set("email", "sri@gmail.com"));       
	      System.out.println("Document update successfully...");  
	      
	      // Retrieving the documents after updation 
	      // Getting the iterable object
	      FindIterable iterDoc = collection.find(); 
	      int i = 1; 
	      
	      // Getting the iterator 
	      Iterator it = iterDoc.iterator(); 
	      while (it.hasNext()) {  
	         System.out.println(it.next());  
	         i++; 
	      }     

	}

}
