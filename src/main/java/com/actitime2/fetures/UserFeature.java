package com.actitime2.fetures;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.Reporter;

import com.actitime2.pageobjects.ActiveProjectCustomer;
import com.actitime2.pageobjects.Creaetenewuser;
import com.actitime2.pageobjects.CreateNewCoustomerpage;
import com.actitime2.pageobjects.Editcustomerinfo;
import com.actitime2.pageobjects.Editusersetting;
import com.actitime2.pageobjects.EnterTimeTrackPage;
import com.actitime2.pageobjects.OpenTaskspage;
import com.actitime2.pageobjects.Userlist;
import com.actitime2.pageobjects.viewOpentask;

public class UserFeature 
{
	WebDriver driver;
	EnterTimeTrackPage ettp;
	OpenTaskspage otp;
	ActiveProjectCustomer apcp;
	CreateNewCoustomerpage cnc;
	Editcustomerinfo edi;
	viewOpentask vot;
	Creaetenewuser cnu;
	Userlist ul;
	Editusersetting eus;
    public UserFeature(WebDriver driver)
	{
        this.driver=driver;
	    ettp=new EnterTimeTrackPage(driver);
	    otp=new OpenTaskspage(driver);
	    apcp=new ActiveProjectCustomer(driver);
	    cnc=new CreateNewCoustomerpage(driver);
	    edi=new Editcustomerinfo(driver);
	    vot=new viewOpentask(driver);
	    cnu=new Creaetenewuser(driver);
	    ul=new Userlist(driver);
	    eus=new Editusersetting(driver);
	 }
    public void createNewUser(String userName,String idpassword,String firstname,String lastName,String mailid)
    {
		ettp.getUserlink().click();
		ul.getNewcustobuton().click();
		cnu.getUsername().sendKeys(userName);
		cnu.getUserpass().sendKeys(idpassword);
		cnu.getRepass().sendKeys(idpassword);
		cnu.getFname().sendKeys(firstname);
		cnu.getLname().sendKeys(lastName);
		cnu.getUseremail().sendKeys(mailid);
		cnu.getCreateuserbuton().click();
	}
    public void verifyNewUser(String lastName,String firstname ,String userName)
    {
//    	String acpectedmsg=ul.getNewuserverfy().getText();
//    	String expectedmsg="User account has been successfully created.";
//    	Assert.assertEquals(acpectedmsg, expectedmsg);
//    	
    	String acpectedmsg1=ul.getNewuserverfy1().getText();
    	String expectedmsg1=lastName+","+firstname+"("+userName+")"+"";
    	Assert.assertEquals(acpectedmsg1, expectedmsg1);
    	Reporter.log(expectedmsg1,true);	
    }
    public void vefynewuserpage()
    {
    	String actualText = ettp.getEttpPageTitle().getText();
		String expectedText="Enter Time-Track";
		Assert.assertEquals(actualText, expectedText);
		
		String actualTitle=driver.getTitle();
		String expectedTitle="actiTIME - Enter Time-Track";
		Assert.assertEquals(actualTitle, expectedTitle);
		Reporter.log("home page is verfied suc",true);
    }
    public void deleteuser()
    {
		ettp.getUserlink().click();
		ul.getNewuserverfy1().click();
		eus.getDeleteuserbuton();
		Alert alt=driver.switchTo().alert();
		String alertText=alt.getText();
		Reporter.log(alertText,true);
		alt.accept();

    	
    }
    

}
