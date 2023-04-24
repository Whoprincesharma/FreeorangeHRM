package com.OrangeHRM.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.OrangeHRM.pageObjects.DashboardPage;
import com.OrangeHRM.pageObjects.LoginPage;
import com.OrangeHRM.testBase.BaseClass;

public class TC001_Login_Test extends BaseClass {
	
	@Test
	public void loginTest() throws IOException {
		LoginPage lp = new LoginPage(driver);
		lp.setUsername(prop.getProperty("username"));
		logger.info("Username entered is - " + prop.getProperty("username"));
		
		lp.setPassword(prop.getProperty("password"));
		logger.info("Password entered is - " + prop.getProperty("password"));
		
		lp.clickLoginButton();
		logger.info("Clicked on Login button");
		
		DashboardPage dp = new DashboardPage(driver);
		boolean actVal = dp.dashboardLinkDisplayed();
		
		//adding assertions
		Assert.assertEquals(actVal, true, "User did not logged in successfully");
		logger.info("User logged into the application successfully");
		
		capturescreen(driver, "TC001_Login_Test");
	}
	
	

}
