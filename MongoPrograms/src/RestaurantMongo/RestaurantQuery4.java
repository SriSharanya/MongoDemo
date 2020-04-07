package RestaurantMongo;





import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.MongoClient;

public class RestaurantQuery4 {

	public static void main(String[] args) {
		
try {
			
			// Creating a Mongo client 
			MongoClient mongo=new MongoClient("localhost",27017);
			
			 // Accessing the database
			DB db=mongo.getDB("myDb");
			System.out.println("MongoDB Connected");
			DBCollection coll=db.getCollection("restaurants");
			BasicDBObject doc= new BasicDBObject();
			BasicDBObject query = new BasicDBObject();
			
			 query.put("state", "Telangana");
			doc.put("restaurant_id", 1);
			
			DBCursor cursor=coll.find(query).limit(3);
			
			while(cursor.hasNext())
			{
				
			System.out.println(cursor.next());
			
			}
			
		}catch(Exception e) {
			System.out.println(e);
			
		}

	}

}
