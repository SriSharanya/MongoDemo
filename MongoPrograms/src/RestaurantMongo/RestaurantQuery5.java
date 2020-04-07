package RestaurantMongo;



import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.MongoClient;




public class RestaurantQuery5 {

	public static void main(String[] args) {
		
try {
			
			// Creating a Mongo client 
			MongoClient mongo=new MongoClient("localhost",27017);
			
			 // Accessing the database
			DB db=mongo.getDB("myDb");
			System.out.println("MongoDB Connected");
			DBCollection coll=db.getCollection("restaurants");
			
			BasicDBObject doc= new BasicDBObject();
			
			doc.put("grades.score", new BasicDBObject("$gt", 25).append("$lt", 60));
			
			DBCursor cursor=coll.find(doc);
		
			while(cursor.hasNext())
			{
				
			System.out.println(cursor.next());
			
			}
			
		}catch(Exception e) {
			System.out.println(e);
			
		}

	}

}

			