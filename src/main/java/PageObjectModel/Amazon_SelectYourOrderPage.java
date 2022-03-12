package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon_SelectYourOrderPage {
	public static WebDriver driver;
	
	@FindBy(xpath = "(//a[@target=\"_blank\"])[9]")
	private WebElement select;
	
	

	public WebElement getSelect() {
		return select;
	}

	public Amazon_SelectYourOrderPage(WebDriver driver0) {
		this.driver = driver0;
		PageFactory.initElements(driver0, this);
		
	}
	
	

}
