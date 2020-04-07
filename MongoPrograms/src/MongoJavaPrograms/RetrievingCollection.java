package MongoJavaPrograms;

import java.util.ArrayList;
import java.util.List;

import org.bson.Document;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

public class RetrievingCollection {

	public static void main(String[] args) {
		
		
		 //creating a mongo client
		MongoClient client = new MongoClient("localhost", 27017);
		
		//Accessing the database
		MongoDatabase database = client.getDatabase("myDb");
		
		MongoCollection<Document> collection = database
				.getCollection("samplecollection");
 
		List<Document> documents = (List<Document>) collection.find().into(
				new ArrayList<Document>());
 
               for(Document document : documents){
                   System.out.println(document);
               }
	     

	}

}
