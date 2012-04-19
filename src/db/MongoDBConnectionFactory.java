package db;

import java.net.UnknownHostException;

import com.mongodb.Mongo;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.BasicDBObject;
import com.mongodb.DBObject;
import com.mongodb.DBCursor;
import com.mongodb.MongoException;

public class MongoDBConnectionFactory {
    // http://www.mongodb.org/display/DOCS/Java+Tutorial
	// The Mongo object instance actually represents a pool of connections to the database;
	// you will only need one object of class Mongo even with multiple threads.
	
	Mongo m;
	String dbname = "allkt";
	
	public MongoDBConnectionFactory() throws UnknownHostException, MongoException{
		this.m = new Mongo();
	}
	
	public MongoDBConnectionFactory(String address) throws UnknownHostException, MongoException{
		this.m = new Mongo(address);
	}
	
	public MongoDBConnectionFactory(String address, int port) throws UnknownHostException, MongoException{
		this.m = new Mongo(address, port);
	}
	
	
	
	
	public DB getConnection(){
		return this.m.getDB(this.dbname);
	}
	
	
	
	
	
} // end of connection factory
