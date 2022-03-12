package Amazon.helper;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigrationReader {
	public static Properties ps;
	
	public ConfigrationReader() throws IOException {
		File f = new File("src\\test\\java\\Amazon\\property\\amazon.property");
		FileInputStream fis = new FileInputStream(f);
		ps = new Properties();
		ps.load(fis);
	}
	
	public String getBroswerName() {
		String Broswer = ps.getProperty("BroswerName");
		return Broswer;
	}
	
	public String getUrl() {
		String url = ps.getProperty("Url");
		return url;
	
	}
	
	public String getSearchContent() {
		String SearchContent = ps.getProperty("SearchContent");
		return SearchContent;
	}
}
