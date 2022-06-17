package khayashi4337.tool.postman.parser;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import khayashi4337.tool.postman.parser.postman.PosCollectionFile;

@SpringBootTest
public class PosCollectionFileTest {

	@Test
	void test01() {
		System.out.println("test01 start");
		
		PosCollectionFile file = new PosCollectionFile();
		file.read("postman_sample.json");
	}
	
}
