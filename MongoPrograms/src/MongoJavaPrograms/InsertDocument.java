package MongoJavaPrograms;

import org.bson.Document;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

public class InsertDocument {

	public static void main(String[] args) {
	
		MongoCollection<Document> collection=null;

		Document document=null;
		// Creating a Mongo client
		MongoClient mongo = new MongoClient( "localhost" , 27017 );
		
		// Accessing the database
		MongoDatabase database = mongo.getDatabase("myDb");
		
		// Creating a collection
		database.createCollection("abc");
		System.out.println("Collection created successfully");
		
		// Retrieving a collection
		collection = database.getCollection("Mongodb");
		System.out.println("Collection sampleCollection selected successfully");
		
		//Inserting document into the collection
		document = new Document();
		document.put("name", "sharanya");
		document.put("email", "s@gmail.com");
		document.put("address", "Jgl");
		document.put("pno", "9987654321");
		
		
		collection.insertOne(document);
		System.out.println("Document inserted successfully");
		
		
	
	}
	}


