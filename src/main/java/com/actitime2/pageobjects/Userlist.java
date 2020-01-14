package com.actitime2.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Userlist
{
	@FindBy(xpath="//span[text()='Create New User']")
private WebElement newcustobuton;

	@FindBy(xpath="//span[text()='User account has been successfully created.']")
	private WebElement newuserverfy;

	@FindBy(xpath="	//a[text()='Devgan, Ajay (Ajay_Dev)']")
	private WebElement newuserverfy1;
	

public Userlist(WebDriver driver)
{

    PageFactory.initElements(driver, this);
}

public WebElement getNewcustobuton() {
	return newcustobuton;
}

public WebElement getNewuserverfy() {
	return newuserverfy;
}

public WebElement getNewuserverfy1() {
	return newuserverfy1;
}


}
