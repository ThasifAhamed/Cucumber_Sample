
//Step 2: In Base_Class we have to write all base_class code for elements in POM class

package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base_Class {
	public static WebDriver driver;
	
	public static WebDriver browser_open() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Thasif Ahamed\\eclipse-workspace\\Basecls\\Driver\\chromedriver.exe");
		return driver = new ChromeDriver();
	}
	public void wondow_max() {
   	 driver.manage().window().maximize();
		
	}
	public static void url(String url) {
		driver.get(url);	
	}
	public static void Sendkeys(WebElement name, String search) {
		name.sendKeys(search);	
	}
	public static void click(WebElement login) {
		login.click();	
	}
}
