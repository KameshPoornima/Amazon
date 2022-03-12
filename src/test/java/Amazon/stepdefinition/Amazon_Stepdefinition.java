package Amazon.stepdefinition;

import java.io.IOException;
import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.Amazon.org.BaseClass;

import Amazon.Runner.Amazon_Runner;
import Amazon.helper.FileReaderManager;
import Amazon.helper.PageObjectManager;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Amazon_Stepdefinition extends BaseClass {
	public static WebDriver driver = Amazon_Runner.driver;
	PageObjectManager pom = new PageObjectManager(driver);
	
	

	@Given("User Launched the Broswer")
	public void user_launched_the_broswer() {
		System.out.println("Brosweer Launched");
	}
	
	@When("User Enters on Url")
	public void user_enters_on_url() throws IOException {
		String url = FileReaderManager.getInstance().getcrtInstance().getUrl();
		get(url);
	}
	
	
	@When("User  Enters on Details in Search Box")
	public void user_enters_on_details_in_search_box() throws IOException {
		String searchContent = FileReaderManager.getInstance().getcrtInstance().getSearchContent();
		Sendkeys(pom.getAhp().getSearchbar(), searchContent);
	}
	
	@When("User Click Search Button")
	public void user_click_search_button() {
		Click(pom.getAhp().getSearchButton());
	}
	
	
	@Then("Verified the Searching Functionality to Navigate The SelectProductPage")
	public void verified_the_searching_functionality_to_navigate_the_select_product_page() throws IOException {
		ScreenShot();
		System.out.println("Verified the HomePage of Amazon to Navigate the Product Select Page ");
	}


	

	@Given("User Select The Product on Web Page")
	public void user_select_the_product_on_web_page() {
		System.out.println("Poco M3 Pro 5G (Power Black, 4GB RAM,64GB Storage)");
	}
	
	@When("Click on the Specified Product")
	public void click_on_the_specified_product() {
		Click(pom.getAsop().getSelect());
       
		String MainWindow=driver.getWindowHandle();		
		
            Set<String> s1=driver.getWindowHandles();		
        java.util.Iterator<String> i1=s1.iterator();		
        		
        while(i1.hasNext())			
        {		
            String ChildWindow=i1.next();		
            		
            if(!MainWindow.equalsIgnoreCase(ChildWindow))			
            {    		
                 
                    driver.switchTo().window(ChildWindow);
            }
        }
		
	}
	
	@Then("Verified the Select Product Functionality To Navigate The My Product Page")
	public void verified_the_select_product_functionality_to_navigate_the_my_product_page() throws IOException {
		ScreenShot();
		System.out.println("Selected POco m3 Pro 5G");
	}




	@Given("User click the Cart Button")
	public void user_click_the_cart_button() {
		Click(pom.getAcp().getAddCart());
		System.out.println("price is"+pom.getAcp().getPrice());
		Click(pom.getAcp().getclose());
	}
	
	@Then("Verified the My product Functionality To Navigate to the LogOut Page")
	public void verified_the_my_product_functionality_to_navigate_to_the_log_out_page() {
		System.out.println("Verified the Cart Page");
	}


	
	@Given("User Moves to mouse on Account and List")
	public void user_moves_to_mouse_on_account_and_list() {
		WebElement account_List = pom.getAlop().getAccount_List();
		Actions a = new Actions(driver);
		a.moveToElement(account_List).perform();
		
	}
	
	@When("User click Sign Out Button")
	public void user_click_sign_out_button() {
		WebElement logout = pom.getAlop().getLogout();
		Actions a = new Actions(driver);
		a.moveToElement(logout).click().perform();
	}
	
	@Then("Verified the Sign Out Functionality")
	public void verified_the_sign_out_functionality() throws IOException {
		ScreenShot();
		System.out.println("LogOut Successfully");
	}




	


}
