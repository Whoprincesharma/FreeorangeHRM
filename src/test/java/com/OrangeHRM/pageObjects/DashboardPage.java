package com.OrangeHRM.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage {
	
	public WebDriver driver; //Driver2
		
	
	public DashboardPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	// Locator for dashboard Link
	@FindBy(id="menu_dashboard_index")
	WebElement dashboardLnk;
	

	public boolean dashboardLinkDisplayed() {
		boolean status = dashboardLnk.isDisplayed();
		return status;
	}
}
