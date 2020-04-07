package MongoJavaPrograms;


import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;

		public class DeletingDocument {


			public static void main(String[] args) {
				
				// Creating a Mongo client 
			      MongoClient mongo = new MongoClient( "localhost" , 27017 );
			      
			      
			      
			      // Accessing the database 
			      MongoDatabase database = mongo.getDatabase("myDb"); 
			      
			      
			      // Retrieving a collection
			      MongoCollection collection = database.getCollection("samplecollection");
			      System.out.println("Collection sampleCollection selected successfully"); 
			      
			      
			      // Deleting the documents 
			      collection.deleteOne(Filters.eq("name", "kavya")); 
			      System.out.println("Document deleted successfully...");  
			      
			      
			      } 

			}
		
		


	


