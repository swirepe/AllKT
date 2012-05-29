package db;

import java.io.File;

import org.tmatesoft.sqljet.core.SqlJetException;
import org.tmatesoft.sqljet.core.SqlJetTransactionMode;
import org.tmatesoft.sqljet.core.table.SqlJetDb;

public class SqliteConnectionFactory {

	protected String dbname;
	protected SqlJetDb db;
	
	protected String[] tableQueries = {
			
	};
	
	public SqliteConnectionFactory(String dbname, boolean init) throws SqlJetException{
		this.dbname = dbname;
		
		if(init){
			init();
		}else{
			this.db = SqlJetDb.open(new File(dbname), true);
		}
	} // end of constructor
	
	
	/**
	 * this throws away the contents of the file
	 * @throws SqlJetException
	 */
	public void init() throws SqlJetException{
		File dbFile = new File(dbname);
		dbFile.delete();
		      
		SqlJetDb db = SqlJetDb.open(dbFile, true);
		db.getOptions().setAutovacuum(true);
		db.beginTransaction(SqlJetTransactionMode.WRITE);
		try {
		  db.getOptions().setUserVersion(1);
		  
		  for(String tq: this.tableQueries){
			  db.createTable(tq);  
		  }
		  
		  
		} finally {
		  db.commit();
		}
	} // end of method init
	
	
} // end of class Sqlite connection factory
