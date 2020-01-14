package com.actitime2.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OpenTaskspage 
{
	@FindBy(linkText="Projects & Customers")
    private WebElement projectCustomer;
	@FindBy(css="input[value='Create New Tasks']")
    private WebElement cretnewtask;
	@FindBy(css="span[class='successmsg']")
    private WebElement taskmsgverify;
	//tasknamelinnk addrs is correct;
	@FindBy(xpath="(//a[contains(@href,'task_details')])[1]")
    private WebElement tasknamelink;
	
	
      public OpenTaskspage(WebDriver driver)
     
      {
         PageFactory.initElements(driver, this);
       }
	
      public WebElement getProjectCustomer() 
	{
		return projectCustomer;
	}

	public WebElement getCretnewtask() {
		return cretnewtask;
	}

	public WebElement getTaskmsgverify() {
		return taskmsgverify;
	}

	public WebElement getTasknamelink() {
		return tasknamelink;
	}
      
      
}
