import java.util.ArrayList;
import org.bson.*;
import com.mongodb.client.*;
import com.mongodb.ConnectionString;
import com.mongodb.MongoClientSettings;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoDatabase;


public class connect {
	public static void main(String[] args) {
		try {
			
//			ConnectionString connString = new ConnectionString(
//				    "mongodb+srv://admin:Amine@delinetcluster.iqoov.mongodb.net/delinet?w=majority"
//				);
//				MongoClientSettings settings = MongoClientSettings.builder()
//				    .applyConnectionString(connString)
//				    .retryWrites(true)
//				    .build();
//				MongoClient mongoClient = MongoClients.create(settings);
//				MongoDatabase database = mongoClient.getDatabase("delinet");
//				System.out.println("Connected to DeliNet Cloud Cluster Database..." + database);
				
				MongoClient mongoClient1 = MongoClients.create(
						"mongodb+srv://admin:admin@delinetcluster.iqoov.mongodb.net/<dbname>?retryWrites=true&w=majority");
				MongoDatabase database1 = mongoClient1.getDatabase("delinet");
				System.out.println("Connected to DeliNet Cloud Cluster Database1..." + database1);
				
				MongoCollection<Document> collection = database1.getCollection("users");
				System.out.println("Collection ......" + collection);
				
				MongoCursor<Document> doc  = collection.find().iterator();
				System.out.println("....Iterration ......" + doc);
//				while(doc.hasNext()) {
////					System.out.println(doc.next().values());
//					ArrayList<Object> veri = new ArrayList(doc.next().values());
//					System.out.println(veri.get(0));
//					}
			}
		catch(Error e) {
			System.out.println("Error....:" + e);
			}
		}
}