package khayashi4337.tool.postman.parser.postman;



import java.io.IOException;
import java.io.InputStream;

import org.springframework.core.io.ClassPathResource;

import com.fasterxml.jackson.databind.ObjectMapper;

public class PosCollectionFile {

	public void read(String filePath) {
		try (InputStream is = new ClassPathResource(filePath).getInputStream()) {
			
			ObjectMapper objctMapper = new ObjectMapper();
			Class clazz = PosCollection.class;
			PosCollection posCollection = objctMapper.readValue(is, clazz);
			
			System.out.println("info._exporter_id:" + posCollection.info._exporter_id);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
	}

}
