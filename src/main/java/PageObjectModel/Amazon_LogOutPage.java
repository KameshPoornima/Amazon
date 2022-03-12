package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon_LogOutPage {
	public static WebDriver driver;
	
	
	
	@FindBy(id = "nav-link-accountList")
	private WebElement Account_List;
	
	
	@FindBy(linkText = "Sign Out")
	private WebElement logout;
	
	
	 public Amazon_LogOutPage(WebDriver driver0) {
		this.driver=driver0;
		PageFactory.initElements(driver0, this);

	}
	
		

	public WebElement getAccount_List() {
		return Account_List;
	}


	public WebElement getLogout() {
		return logout;
	}

}
