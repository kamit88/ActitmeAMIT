package com.actitime2.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Creaetenewuser 
{
	@FindBy(name="username")
	private WebElement username;
	
	@FindBy(name="passwordText")
	private WebElement userpass;
	
	@FindBy(name="passwordTextRetype")
	private WebElement repass;
	
	@FindBy(name="firstName")
	private WebElement fname;
	@FindBy(name="lastName")
	private WebElement lname;
	@FindBy(name="email")
	private WebElement useremail;
	@FindBy(css="input[value*='Create User ']")
	private WebElement createuserbuton;
   public Creaetenewuser(WebDriver driver)
    {
    	
        PageFactory.initElements(driver, this);
    }
public WebElement getUsername() {
	return username;
}
public WebElement getUserpass() {
	return userpass;
}

public WebElement getRepass() {
	return repass;
}

public WebElement getFname() {
	return fname;
}
public WebElement getLname() {
	return lname;
}
public WebElement getUseremail() {
	return useremail;
}
public WebElement getCreateuserbuton() {
	return createuserbuton;
}
    
}
