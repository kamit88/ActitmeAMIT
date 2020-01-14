package com.actitime2.scripts;

import org.testng.annotations.Test;

import com.actitime2.fetures.ExcelUtilites;
import com.actitime2.fetures.LoginFeatures;
import com.actitime2.fetures.TaskFeatures;
import com.actitime2.fetures.UserFeature;
import com.actitime2.generic.BaseLib;

public class UserTest extends BaseLib
{
//	@Test
//	public void UserTests()
//	{
//		ExcelUtilites eu=new ExcelUtilites("./testdata/testdata.xlsx");
//	    String username=eu.readData("Sheet1",9,1);
//	    String password=eu.readData("Sheet1",9,2);
//	    LoginFeatures lf=new LoginFeatures(driver);
//	    lf.login(username, password);
//	    String userName=eu.readData("Sheet1",9, 3);
//	    String idpassword=eu.readData("Sheet1",9, 4);
//	    String firstname=eu.readData("Sheet1",9, 5);
//	    String lastName=eu.readData("Sheet1",9, 6);
//	    String mailid=eu.readData("Sheet1",9, 7);
//        
//	    UserFeature uf=new UserFeature(driver);
//
//	    uf.createNewUser(userName,idpassword,firstname,lastName,mailid);
//	   // uf.verifyNewUser(lastName,firstname ,userName);
//	    
//}
//	@Test
//	public void funnewuser()
//	{
//		ExcelUtilites eu=new ExcelUtilites("./testdata/testdata.xlsx");
//	    String username=eu.readData("Sheet1",10,1);
//	    String password=eu.readData("Sheet1",10,2);
//	    LoginFeatures lf=new LoginFeatures(driver);
//	    lf.login(username, password);
//	    UserFeature uf=new UserFeature(driver);
//        uf.vefynewuserpage();
//	}
	@Test
	public void deleteuser()
	{
		ExcelUtilites eu=new ExcelUtilites("./testdata/testdata.xlsx");
	    String username=eu.readData("Sheet1",10,1);
	    String password=eu.readData("Sheet1",10,2);
	    LoginFeatures lf=new LoginFeatures(driver);
	    lf.login(username, password);
	    UserFeature uf=new UserFeature(driver);
	    uf.deleteuser();
        //uf.vefynewuserpage();
		
	}
}