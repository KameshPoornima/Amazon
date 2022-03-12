package Amazon.helper;

import java.io.IOException;

public class FileReaderManager {
	
	private FileReaderManager() {
		
	}
	
	public static FileReaderManager getInstance() {
		FileReaderManager fir = new FileReaderManager();
		return fir;
		
	}
	
	public static ConfigrationReader getcrtInstance() throws IOException {
		ConfigrationReader cr = new ConfigrationReader();
		return cr;
	}

}
