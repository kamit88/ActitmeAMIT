package com.actitime2.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Editusersetting 
{
	@FindBy(css="input[value='Delete This User']")
private WebElement deleteuserbuton;

	

public Editusersetting(WebDriver driver)
{

    PageFactory.initElements(driver, this);
}


public WebElement getDeleteuserbuton() {
	return deleteuserbuton;
}


}