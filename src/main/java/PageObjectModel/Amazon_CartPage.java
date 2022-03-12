package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon_CartPage {
	public static WebDriver driver;
	
	
	@FindBy(id = "add-to-cart-button")
	private WebElement addCart;


	public WebElement getAddCart() {
		return addCart;
	}
	
	@FindBy(id = "attach-accessory-cart-subtotal")
	private WebElement Price;
	

	@FindBy(id = "attach-close_sideSheet-link")
	private WebElement close;


	public WebElement getPrice() {
		return Price;
	}
	
	public WebElement getclose() {
		return close;
	}



	public Amazon_CartPage(WebDriver driver0) {
		this.driver = driver0;
		PageFactory.initElements(driver0, this);

}
}
