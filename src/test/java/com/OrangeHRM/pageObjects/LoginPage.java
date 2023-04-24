package com.OrangeHRM.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	public WebDriver driver; //Driver2
	
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	// Locator for username field
	@FindBy(xpath="//input[@name='username']")
	WebElement unameTxtField;
	
	// Locator for Password field
	@FindBy(name="txtPassword")
	WebElement pwdTxtField;
	
	// Locator for Login button
	@FindBy(name="Submit")
	WebElement loginBtn;
	
	// Entering Username
	public void setUsername(String username) {
		unameTxtField.clear();
		unameTxtField.sendKeys(username);
		String unameEntered = unameTxtField.getAttribute("value");
		System.out.println("Value entered in Username field is - " + unameEntered);
	}
	
	// Entering Password
	public void setPassword(String password) {
		pwdTxtField.clear();
		pwdTxtField.sendKeys(password);
		String passwordEntered = pwdTxtField.getAttribute("value");
		System.out.println("Value entered in Password field is - " + passwordEntered);
	}
	
	// Clicking on Login button
	public void clickLoginButton() {
		loginBtn.click();
		System.out.println("Clicked on Login button");
	}
	
	
	
	

}
