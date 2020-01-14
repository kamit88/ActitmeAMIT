package com.actitime2.pageobjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public  class CreateNewCoustomerpage
{
@FindBy(name="name")
private WebElement customerName;


@FindBy(name="createCustomerSubmit")
private WebElement createCustomer;

@FindBy(xpath="//select[@name='customerId']")
private WebElement dropdown;

@FindBy(xpath="//input[@name='name']")
private WebElement pname;

@FindBy(name="createProjectSubmit")
private WebElement cps;
@FindBy(xpath="//input[@name='createProjectSubmit']")
private WebElement createprojectbutoon;
@FindBy(name="customerId")
private WebElement selectcustomer;

@FindBy(name="projectId")
private WebElement selectProject;

@FindBy(xpath="//input [starts-with(@name,'task')]")
private List<WebElement> taskTxtbx;

@FindBy(xpath="//input [starts-with(@name,'task')]")
private List<WebElement> DeadLineSelect;

@FindBy(css="img[id*='ext-gen']")
private List<WebElement> selectDate;

@FindBy(xpath="//button[text()='today']")
private WebElement todaybutton;

@FindBy(xpath="//select[starts-with(@name,'task')]")
private List<WebElement> billingtype;
@FindBy(xpath="//td[@class='formbuttonpane']//input[@value='Create Tasks']")
private WebElement createtask;

@FindBy(xpath="//input[@type='checkbox'][contains(@name,'task')]")
private List<WebElement> chkbox;


public CreateNewCoustomerpage(WebDriver driver)
{
PageFactory.initElements(driver, this);
}


public WebElement getCustomerName() {
	return customerName;
}

public WebElement getCreateCustomer() {
	return createCustomer;
}


public WebElement getDropdown() {
	return dropdown;
}



public WebElement getCreateprojectbutoon() {
	return createprojectbutoon;
}


public WebElement getPname() {
	return pname;
}


public WebElement getCps() {
	return cps;
}


public WebElement getSelectcustomer() {
	return selectcustomer;
}


public WebElement getSelectProject() {
	return selectProject;
}


public List<WebElement> getTaskTxtbx() {
	return taskTxtbx;
}


public List<WebElement> getDeadLineSelect() {
	return DeadLineSelect;
}


public List<WebElement> getSelectDate() {
	return selectDate;
}


public WebElement getTodaybutton() {
	return todaybutton;
}


public List<WebElement> getBillingtype() {
	return billingtype;
}


public WebElement getCreatetask() {
	return createtask;
}


public List<WebElement> getChkbox() {
	return chkbox;
}




}








