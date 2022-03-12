package com.Amazon.org;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;


public class BaseClass {
	public static WebDriver driver;
	public static WebDriver BroswerLanch(String broswername) {
		try {
			if (broswername.equalsIgnoreCase("chrome")) {
				System.getProperty("webdriver.chrome.driver", "D:\\Selenium\\Prog\\Amazon\\Driver\\chromedriver.exe");
			 driver = new ChromeDriver();
				
			}else if (broswername.equalsIgnoreCase("Firefox")) {
				System.getProperty("webdriver.geckod.driver", "D:\\Selenium\\Prog\\Amazon\\Driver\\geckodriver.exe");
				 driver = new FirefoxDriver();
				
			}
			else {
				System.out.println("Invalid Broswer");

			}
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return driver;

	}
	
public static void Navigate_To(String url) {
	try {
		driver.navigate().to("url");
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

}
public static void Navigate_Forward() {
 try {
	driver.navigate().forward();
} catch (Exception e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
}
public static void Navigate_Back() {
try {
driver.navigate().back();
} catch (Exception e) {
// TODO Auto-generated catch block
e.printStackTrace();
}
}  
public static void Quit() {
try {
driver.quit();
} catch (Exception e) {
// TODO Auto-generated catch block
e.printStackTrace();
}
}
public static void Close() {
try {
driver.close();
} catch (Exception e) {
// TODO Auto-generated catch block
e.printStackTrace();
}
}
public static void ScreenShot() throws IOException {
try {
	TakesScreenshot scr = (TakesScreenshot) driver;
	File sc = scr.getScreenshotAs(OutputType.FILE);
	File des = new File("D:\\Selenium\\Prog\\Amazon\\ScreenShot");
	FileUtils.copyToDirectory(sc, des);
} catch (WebDriverException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
}

public static WebDriver Loc_ID(String id) {
try {
driver.findElement(By.id(id));
} catch (Exception e) {
// TODO Auto-generated catch block
e.printStackTrace();
}
return driver;
}
public static WebDriver Loc_Name(String name) {
	try {
		driver.findElement(By.name(name));
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return driver;

}
public static WebDriver Loc_LinkText(String text) {
	try {
		driver.findElement(By.linkText(text)).click();
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return driver;

	
}
public static WebDriver Loc_Xpath(String xpath) {
	try {
		driver.findElement(By.xpath(xpath)).click();
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return driver;

}
public static void Accept() {
	try {
		driver.switchTo().alert().accept();
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

}
public static void Dismiss() {
try {
driver.switchTo().alert().dismiss();
} catch (Exception e) {
// TODO Auto-generated catch block
e.printStackTrace();
}
}
public static void Prompt_Alert(String value) {
	try {
		Alert prompt = driver.switchTo().alert();
		prompt.sendKeys(value);
		prompt.accept();
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
public static void Robot() {
	try {
		Robot ro = new Robot();    // keyboard actions
		
		ro.keyPress(KeyEvent.VK_ENTER);
		ro.keyRelease(KeyEvent.VK_ENTER);
		
	} catch (AWTException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

}
public static void Maxmize() {
	try {
		driver.manage().window().maximize();
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

}
public static void ContextClick(String xpath) {
	try {
		Actions ac = new Actions(driver);    // mouse actions
		
		WebElement f1 = driver.findElement(By.xpath(xpath));
		ac.contextClick(f1).perform();
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

}
public static WebDriver get(String url) {
	try {
		driver.get(url);
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return driver;

}
public static WebDriver Loc_Xpathsendkeys(String xpath,String key) {
	try {
		driver.findElement(By.xpath(xpath)).sendKeys(key);;
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return driver;

}
public static void Sendkeys(WebElement element,String keys) {
	try {
		 element.sendKeys(keys);
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

	
}

public static void Click(WebElement element) {
	
	try {
		element.click();
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

}

public static void Actionsclass(String action,String xpath) {
	Actions ac = new Actions(driver);
	if (action.equalsIgnoreCase("Contextclick")) {
		WebElement f1 = driver.findElement(By.xpath(xpath));
		ac.contextClick(f1).perform();
	}
	 
	else if (action.equalsIgnoreCase("doubleclick")) {
			WebElement f1 = driver.findElement(By.xpath(xpath));
			ac.doubleClick().perform();
		}

}

public static void Selectclass(String xpath,String select,String value) {
	WebElement findElement = driver.findElement(By.id(xpath));
	try {
		findElement.click();
		Select sc = new Select(findElement);
		if (select.equalsIgnoreCase("selectByValue")) {
			sc.selectByValue(value);
		}
	/*	else if (select.equalsIgnoreCase("selectByIndex")) {
			sc.selectByIndex(value);
			
}*/
		else if (select.equalsIgnoreCase("selectByVisibleText")) {
		sc.selectByVisibleText(value);	
		}
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

}

public static void Dropdown(String str) {
	WebElement f1 = driver.findElement(By.xpath("str"));
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("arguments[0].scrollIntoView();",f1 );
}

public static void ImplicityWait() {
driver.manage().timeouts().implicitlyWait(6,TimeUnit.SECONDS);
}


}
