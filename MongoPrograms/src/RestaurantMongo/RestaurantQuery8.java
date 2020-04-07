package RestaurantMongo;

import java.util.ArrayList;
import java.util.List;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.MongoClient;

public class RestaurantQuery8 {

	public static void main(String[] args) {
		
try {
			
			// Creating a Mongo client 
			MongoClient mongo=new MongoClient("localhost",27017);
			
			 // Accessing the database
			DB db=mongo.getDB("myDb");
			System.out.println("MongoDB Connected");
			DBCollection coll=db.getCollection("restaurants");
			
			BasicDBObject query= new BasicDBObject();
			query.put("restaurant_id", 1);
			query.put("name", 1);
			query.put("state", 1);
			query.put("cuisine", 1);
			
			BasicDBObject doc= new BasicDBObject();
			
			List<BasicDBObject> obj = new ArrayList<BasicDBObject>();
			obj.add(new BasicDBObject("grades.score",new BasicDBObject("$gt", 10) ));
			
			doc.put("$ne", obj);
			
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
