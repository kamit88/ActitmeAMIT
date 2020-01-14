package com.actitime2.scripts;

import org.testng.annotations.Test;

import com.actitime2.fetures.ExcelUtilites;
import com.actitime2.fetures.LoginFeatures;
import com.actitime2.generic.BaseLib;


public class LoginTest extends BaseLib 
{

	@Test(priority=1)
	public void validLogin()
	{
		
		ExcelUtilites eu=new ExcelUtilites("./testdata/testdata.xlsx");
	    String username=eu.readData("Sheet1",1,1);
	    String password=eu.readData("Sheet1",1,2);
	    LoginFeatures lf=new LoginFeatures(driver);
	    lf.login(username, password);
	    		lf.verifyHomePage();
	}
	@Test(priority=2)
	public void invalidLogin()
	{ExcelUtilites eu=new ExcelUtilites("./testdata/testdata.xlsx");
    String username=eu.readData("Sheet1",2,1);
    String password=eu.readData("Sheet1",2,2);
    LoginFeatures lf=new LoginFeatures(driver);
    lf.login(username, password);
    lf.verfifyinvalidLogin();
}}
