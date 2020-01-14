package com.actitime2.fetures;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.Reporter;

import com.actitime2.pageobjects.EnterTimeTrackPage;
import com.actitime2.pageobjects.LoginPage;


public class LoginFeatures 
{
	WebDriver driver;
	LoginPage lp;
	EnterTimeTrackPage ettp;
	public LoginFeatures(WebDriver driver)
	{
		this.driver=driver;
		lp=new LoginPage(driver);
		ettp=new EnterTimeTrackPage(driver);
		
	}
	//feature
	public void login(String username,String password)
	{
		lp.getUnTxtBx().sendKeys(username);
		lp.getPwTxtBx().sendKeys(password);
		lp.getLoginBtn().click();
		
		
	}
	public void verifyHomePage()
	{
		String actualText = ettp.getEttpPageTitle().getText();
		String expectedText="Enter Time-Track";
		Assert.assertEquals(actualText, expectedText);
		
		String actualTitle=driver.getTitle();
		String expectedTitle="actiTIME - Enter Time-Track";
		Assert.assertEquals(actualTitle, expectedTitle);
		Reporter.log("home page is verfied suc",true);
	}
 public void verfifyinvalidLogin()
 {       String actualText=lp.getInvalidLoginMsgEle().getText();
       String expectedMsg="Username or Password is invalid. Please try again.";
    		   Assert.assertEquals(actualText,expectedMsg);
       Reporter.log("invalid login is verified successfully",true);
 }
 
}
