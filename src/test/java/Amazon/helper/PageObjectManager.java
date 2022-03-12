package Amazon.helper;

import org.openqa.selenium.WebDriver;

import PageObjectModel.AmazonHomePage;
import PageObjectModel.Amazon_CartPage;
import PageObjectModel.Amazon_LogOutPage;
import PageObjectModel.Amazon_MyProductPage;
import PageObjectModel.Amazon_PaymentPage;
import PageObjectModel.Amazon_SelectYourOrderPage;

public class PageObjectManager {
	public static WebDriver driver;
	
	private AmazonHomePage Ahp;
	private Amazon_SelectYourOrderPage Asop;
	private Amazon_MyProductPage Ampp;
	private Amazon_CartPage Acp;
	private Amazon_PaymentPage App;
	private Amazon_LogOutPage Alop;
	
	public PageObjectManager( WebDriver driver0) {
		this.driver=driver0;
	}
	
	
	public AmazonHomePage getAhp() {
		Ahp = new AmazonHomePage(driver);
		return Ahp;
	}
	public Amazon_SelectYourOrderPage getAsop() {
		Asop = new Amazon_SelectYourOrderPage(driver);
		return Asop;
	}
	public Amazon_MyProductPage getAmpp() {
		Ampp = new Amazon_MyProductPage();
		return Ampp;
	}
	public Amazon_CartPage getAcp() {
		Acp = new Amazon_CartPage(driver);
		return Acp;
	}
	public Amazon_PaymentPage getApp() {
		return App;
	}
	public Amazon_LogOutPage getAlop() {
		Alop = new Amazon_LogOutPage(driver);
		return Alop;
	}

}
