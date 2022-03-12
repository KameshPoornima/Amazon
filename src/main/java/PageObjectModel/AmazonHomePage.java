package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonHomePage {
	
	public static WebDriver driver;
	
	
	@FindBy(id = "twotabsearchtextbox")
	private WebElement Searchbar;
	
	@FindBy(xpath = "//input[@type=\"submit\"]")
	private WebElement SearchButton;
	
	
	public AmazonHomePage(WebDriver driver0) {
		this.driver=driver0;
		PageFactory.initElements(driver0, this);
	}
	

	public WebElement getSearchbar() {
		return Searchbar;
	}

	public WebElement getSearchButton() {
		return SearchButton;
	}
	

}
