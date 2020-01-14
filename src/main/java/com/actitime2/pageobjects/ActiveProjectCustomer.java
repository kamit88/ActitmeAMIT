package com.actitime2.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActiveProjectCustomer extends BasePage
{
	@FindBy(css="input[value='Create New Customer']")
	private WebElement createNewCoustomer;
	@FindBy(xpath="//table[@id='SuccessMessages']//span")
	private WebElement succmsg;
	
	@FindBy(name="selectedCustomer")
	private WebElement selCustomer;
	
	@FindBy(css="input[value*='Show']")
	private WebElement showBtn;
	
	@FindBy(xpath="//td[starts-with(@id,'customerNameCell')]//a[contains(@href,'customers')]")
	private  WebElement CustLink;
	
	@FindBy(xpath="//input[@value='Delete This Customer']")
	private WebElement DelCust;
	
	@FindBy(css="//input[value='Delete Customer']")
	private WebElement DelPopUp;
	
	@FindBy(xpath="//input[@value='Create New Project']")
	private WebElement createnewProject;
	
	@FindBy(xpath="//td[starts-with(@id,'projectNameCell')]//a[contains(@href,'customer')]")
	private WebElement projectlink;
	
	
    public ActiveProjectCustomer(WebDriver driver)
    {
    	super(driver);
        PageFactory.initElements(driver, this);
    }
    public WebElement getSelCustomer() 
	{
		return selCustomer;
	}
    public WebElement getCreateNewCoustomer() 
	{
		return createNewCoustomer;
	}
    
    public WebElement getSuccmsg() 
    {
		return succmsg;
	}
	public WebElement getShowBtn() 
	{
		return showBtn;
	}
    public WebElement getCustLink() 
	{
		return CustLink;
	}
    public WebElement getDelCust() 
	{
		return DelCust;
	}
    public WebElement getDelPopUp() 
	{
		return DelPopUp;
	}
	public WebElement getCreatenewProject() {
		return createnewProject;
	}
	public WebElement getProjectlink() {
		return projectlink;
	}
	
	
	}
	
    
	

