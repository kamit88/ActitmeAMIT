package com.actitime2.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Editcustomerinfo 
{@FindBy(css="input[value='Delete This Customer']")
private WebElement Delcust;

@FindBy(xpath="//input[@id='deleteButton']")
private WebElement delbutn;
@FindBy(xpath="//input[@value='Delete This Project']")
private WebElement deletproject;
public Editcustomerinfo(WebDriver driver)
{
PageFactory.initElements(driver, this);
}
public WebElement getDelcust() {
	return Delcust;
}
public WebElement getDelbutn() {
	return delbutn;
}
public WebElement getDeletproject() {
	return deletproject;
}




}
