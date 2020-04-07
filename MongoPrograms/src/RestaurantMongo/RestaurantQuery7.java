package RestaurantMongo;
import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.MongoClient;


public class RestaurantQuery7 {

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
			
			doc.put("restaurant_id", 1);
			doc.put("name", 1);
			doc.put("state", 1);
			doc.put("cuisine", 1);
			
			query.put("name", 
					new BasicDBObject("$regex", "Q Hub"));
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
