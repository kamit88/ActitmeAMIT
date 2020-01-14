package com.actitime2.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage 
{
	@FindBy(xpath="//div[contains(text(),'Tasks')]")
    private WebElement task;
	
	@FindBy(id="logoutLink")
	private WebElement logout;
	
	@FindBy(xpath="//div[contains(text(),'Users')]")
	private WebElement userlink;
	
    public BasePage(WebDriver driver)
    {
	PageFactory.initElements(driver, this);
     }
     public WebElement getTask() 
     {
	   return task;
     }
	public WebElement getLogout() 
	{
	return logout;
	}
	public WebElement getUserlink() {
		return userlink;
	}


}
