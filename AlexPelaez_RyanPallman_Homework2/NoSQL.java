import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class NoSQL implements Database{

	@Override
	public void store(String data) {
		System.out.println("Running document store");
		
		try {
			Files.write(Paths.get("nosql.txt"), data.getBytes());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
