package Amazon.Runner;

import java.io.IOException;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.Amazon.org.BaseClass;

import Amazon.helper.FileReaderManager;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\java\\Com\\Amazon\\feature\\Amazon.feature",
glue="Amazon\\stepdefinition",
plugin = "pretty",
dryRun = false,monochrome = false)

public class Amazon_Runner extends BaseClass {
	public static WebDriver driver;
	
	@BeforeClass
	public static void Setup() throws IOException {
		String broswerName = FileReaderManager.getcrtInstance().getBroswerName();
		driver = BaseClass.BroswerLanch(broswerName);
	}
	
	@AfterClass
	public static void tearDown() {
		driver.close();
		driver.quit();

	}

}
