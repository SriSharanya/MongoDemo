package RestaurantMongo;

import java.util.ArrayList;
import java.util.List;

import com.mongodb.AggregationOptions;
import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;

public class RestaurantQuery11 {

	public static void main(String[] args) {
		
try {
	DBCursor cursor=null;
			// Creating a Mongo client 
			MongoClient mongo=new MongoClient("localhost",27017);
			
			 // Accessing the database
			DB db=mongo.getDB("myDb");
			System.out.println("MongoDB Connected");
			DBCollection coll=db.getCollection("restaurants");
			
			DBObject query= new BasicDBObject("_id","$state");
			query.put("count",new BasicDBObject("$sum",1) );
			
			DBObject group = new BasicDBObject("group",query);
			
			List<DBObject> obj=new ArrayList<DBObject>();
			obj.add(new BasicDBObject("$match",new BasicDBObject()));
			obj.add(group);
			
			cursor=coll.find(group);
			
			cursor=coll.aggregate(obj,Aggregations.builder().build());
			System.out.println(output.getCommandResult());
			
			while(cursor.hasNext())
			{
				DBObject dbObject=(DBObject) cursor.next();	
			System.out.println(cursor.next());
			
			}
			
		}catch(Exception e) {
			System.out.println(e);
			
		}

		
		
	}

}
