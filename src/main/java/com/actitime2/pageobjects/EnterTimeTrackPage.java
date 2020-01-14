package com.actitime2.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EnterTimeTrackPage extends BasePage
{
  @FindBy(xpath="(//td[@class='pagetitle'])[2]")
  private WebElement ettpPageTitle;
  @FindBy(xpath="//a[contains(@href,'task_details')]")
  private WebElement tasklink;
  
	
	public EnterTimeTrackPage(WebDriver driver)
	   {
		super(driver);
      PageFactory.initElements(driver,this);		
	  }
	public WebElement getEttpPageTitle() 
	{
		return ettpPageTitle;
	}
	public WebElement getTasklink() {
		return tasklink;
	}
	
	
}