
public class DBSoftware {
	private Database database;
	 
	public DBSoftware(Database db) {
		this.database = db;
		System.out.println("Instantiating DBSoftware");
	}
	
	public void databaseStore(String data) {
		System.out.println("Calling store method in " + this.database.getClass().getName() + " database");
		this.database.store(data);
	}
	public void setStoreStrategy(Database db) {
		System.out.println("Setting store strategy");
		this.database = db;
		
	}

}
