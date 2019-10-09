import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Relational implements Database{

	@Override
	public void store(String data) {
		System.out.println("Running table store");
		
		try {
			Files.write(Paths.get("relational.txt"), data.getBytes());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
