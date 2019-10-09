import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Graph implements Database{

	@Override
	public void store(String data) {
		System.out.println("Running node store");
		
		try {
			Files.write(Paths.get("graph.txt"), data.getBytes());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
