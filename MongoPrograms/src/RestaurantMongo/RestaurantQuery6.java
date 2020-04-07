package RestaurantMongo;

import java.util.ArrayList;
import java.util.List;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.MongoClient;

public class RestaurantQuery6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try {
			
			// Creating a Mongo client 
			MongoClient mongo=new MongoClient("localhost",27017);
			
			 // Accessing the database
			DB db=mongo.getDB("myDb");
			System.out.println("MongoDB Connected");
			DBCollection coll=db.getCollection("restaurants");
			
			BasicDBObject query= new BasicDBObject();
			query.put("cuisine", new BasicDBObject("$ne", "Bakery"));
			
			BasicDBObject doc= new BasicDBObject();
			List<BasicDBObject> obj = new ArrayList<BasicDBObject>();
			obj.add(new BasicDBObject("grades.score",new BasicDBObject("$gt", 25) ));
			obj.add(new BasicDBObject("address.coord",new BasicDBObject("$lt", -65.754168) ));
			
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
