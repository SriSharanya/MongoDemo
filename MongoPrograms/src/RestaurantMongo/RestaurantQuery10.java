package RestaurantMongo;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.MongoClient;

public class RestaurantQuery10 {

	public static void main(String[] args) {
		
try {
			
			// Creating a Mongo client 
			MongoClient mongo=new MongoClient("localhost",27017);
			
			 // Accessing the database
			DB db=mongo.getDB("myDb");
			System.out.println("MongoDB Connected");
			DBCollection coll=db.getCollection("restaurants");
			
			BasicDBObject query = new BasicDBObject();
			
			query.put("name", 
				new BasicDBObject("$regex", "res")
				.append("$options", "i"));
			
		BasicDBObject doc= new BasicDBObject();
			
			doc.put("name", 1);
			doc.put("state", 1);
			doc.put("cuisine", 1);
			doc.put("address.coord", 1);
			
			DBCursor cursor=coll.find(query,doc);
			
			while(cursor.hasNext())
			{
				
			System.out.println(cursor.next());
			
			}
			
		}catch(Exception e) {
			System.out.println(e);
			
		}

	}

}
