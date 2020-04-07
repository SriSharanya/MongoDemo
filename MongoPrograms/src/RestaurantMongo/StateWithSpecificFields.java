package RestaurantMongo;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.MongoClient;

public class StateWithSpecificFields {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try {
			
			// Creating a Mongo client 
			MongoClient mongo=new MongoClient("localhost",27017);
			
			 // Accessing the database
			DB db=mongo.getDB("myDb");
			System.out.println("MongoDB Connected");
			DBCollection coll=db.getCollection("restaurants");
			
			BasicDBObject query = new BasicDBObject();
			BasicDBObject doc= new BasicDBObject();
			
			
			query.put("state", "Telangana");
			doc.put("restaurant_id", 1);
			doc.put("name", 1);
			//doc.put("state", 1);
			//doc.put("zip code", 1);
			//doc.put("_id", 0);
			
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
