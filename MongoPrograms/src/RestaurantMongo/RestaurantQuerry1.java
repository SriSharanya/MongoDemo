package RestaurantMongo;

import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.MongoClient;

public class RestaurantQuerry1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			// Creating a Mongo client 
			MongoClient mongo=new MongoClient("localhost",27017);
			
			 // Accessing the database
			DB db=mongo.getDB("myDb");
			System.out.println("MongoDB Connected");
			DBCollection coll=db.getCollection("restaurants");
			DBCursor cursor=coll.find();
			
			while(cursor.hasNext())
			{
				int i=1;
			System.out.println(cursor.next());
			i++;
			}
			
		}catch(Exception e) {
			System.out.println(e);
			
		}
		

	}

}
