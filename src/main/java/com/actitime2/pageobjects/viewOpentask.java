package com.actitime2.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class viewOpentask 
{
	
	@FindBy(css="input[value='Delete This Task']")
    private WebElement deletetaskbutoon;
	
	
    @FindBy(css="input[value='Delete Task']")
    private WebElement confdeletbuton;
	
    @FindBy(xpath="//td[contains(text(),'Customer')]")

    private WebElement customernamelabel;
	
    @FindBy(xpath="//td[contains(text(),'Project')]")
    private WebElement projectnamelabel;
    
    @FindBy(xpath="//span[text()='FirstTask']")
    private WebElement taskname;
    
    public viewOpentask(WebDriver driver)
   
    {
       PageFactory.initElements(driver, this);
     }



	public WebElement getDeletetaskbutoon() {
		return deletetaskbutoon;
	}



	public WebElement getConfdeletbuton() {
		return confdeletbuton;
	}



	public WebElement getCustomernamelabel() {
		return customernamelabel;
	}



	public WebElement getProjectnamelabel() {
		return projectnamelabel;
	}



	public WebElement getTaskname() {
		return taskname;
	}
    
	
   
}
