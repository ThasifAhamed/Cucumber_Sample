
// Step 1: In POM class we will find all the elements and Generate getters methods

package com.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_page {
	//Syntax From Here 
	public WebDriver driver;
	 public Login_page(WebDriver driver) {// public Login_page is same name as class name
			this.driver = driver;
			PageFactory.initElements(driver, this);
		}
	 // To Here Syntax
	 
	 //From below find Elements
	 
	 @FindBy(xpath = "//input[@id='username']")
	 WebElement Username;
	 @FindBy(xpath = "//input[@id='password']")
	 WebElement Password;
	 @FindBy(xpath = "//input[@id='login']")
	 WebElement login_button;
	 
	 // To here find Elements
	 
	 // follow this step to get getter methods select all the FindBy right click->Source->
	 //Generate Getter and Setter->Select all-> Select getters-> Generate
	 public WebDriver getDriver() {
		return driver;
	}
	public WebElement getUsername() {
		return Username;
	}
	public WebElement getPassword() {
		return Password;
	}
	public WebElement getLogin_button() {
		return login_button;
	}
	
}
