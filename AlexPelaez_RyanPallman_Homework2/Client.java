// Authors 
// Alexander Pelaez and Ryan Pallman
public class Client {
	public static void main(String[] args) {
		DBSoftware DB = new DBSoftware(new Relational()); 
		
		DB.databaseStore("Relational");
		DB.setStoreStrategy(new NoSQL());
		DB.databaseStore("NoSQL");
		DB.setStoreStrategy(new Graph());
		DB.databaseStore("Graph");
	}
}
