package com.actitime2.fetures;

import java.util.List;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;

import com.actitime2.pageobjects.ActiveProjectCustomer;
import com.actitime2.pageobjects.CreateNewCoustomerpage;
import com.actitime2.pageobjects.Editcustomerinfo;
import com.actitime2.pageobjects.EnterTimeTrackPage;
import com.actitime2.pageobjects.OpenTaskspage;
import com.actitime2.pageobjects.viewOpentask;

public class TaskFeatures 
{
	WebDriver driver;
	EnterTimeTrackPage ettp;
	OpenTaskspage otp;
	ActiveProjectCustomer apcp;
	CreateNewCoustomerpage cnc;
	Editcustomerinfo edi;
	viewOpentask vot;
    public TaskFeatures(WebDriver driver)
	{
        this.driver=driver;
	    ettp=new EnterTimeTrackPage(driver);
	    otp=new OpenTaskspage(driver);
	    apcp=new ActiveProjectCustomer(driver);
	    cnc=new CreateNewCoustomerpage(driver);
	    edi=new Editcustomerinfo(driver);
	    vot=new viewOpentask(driver);
	 }
	//feture
	public void createCustomer(String CustomerName)
	{
		ettp.getTask().click();
		otp.getProjectCustomer().click();
		apcp.getCreateNewCoustomer().click();
		cnc.getCustomerName().sendKeys(CustomerName);
		cnc.getCreateCustomer().click();
		
		
	}
	public void deleteCustomer(String customerName)
	{
		ettp.getTask().click();
		otp.getProjectCustomer().click();
		apcp.getSelCustomer().click();
		Select sel =new Select(apcp.getSelCustomer());
		sel.selectByVisibleText(customerName);
		apcp.getShowBtn().click();
		apcp.getCustLink().click();
		apcp.getDelCust().click();
		edi.getDelbutn().click();
		
	}
	public void verifycreatCustomer(String CustomerName)
	{
		String actualmsg = apcp.getSuccmsg().getText();
		String ExpMsg="Customer \""+CustomerName+"\" has been successfully created.";
		Assert.assertEquals(actualmsg, ExpMsg);
		Reporter.log(ExpMsg,true);
	}
	public void clickLogout()
	{
		apcp.getLogout().click();
	}
	public void verifdeleteCustomer(String expCustomer)
	{
		Select sel=new Select(apcp.getSelCustomer());
		List<WebElement> allope = sel.getOptions();
		for(int i=0;i<allope.size();i++)
		{
	     String actualCustomerName=allope.get(i).getText();
		Assert.assertNotEquals(actualCustomerName, expCustomer);
	    }
		String actualmsg=apcp.getSuccmsg().getText();
		String expectedmsg="Customer has been successfully deleted.";
		Assert.assertEquals(actualmsg, expectedmsg);
		Reporter.log(expectedmsg,true);
	}
	public void createproject(String CustomerName,String projName)
	{
		ettp.getTask().click();
		otp.getProjectCustomer().click();
		apcp.getCreatenewProject().click();
		Select sel =new Select(cnc.getDropdown());
		sel.selectByVisibleText(CustomerName);
		cnc.getPname().sendKeys(projName);
		//cnc.getCps().click();
		cnc.getCreateprojectbutoon().click();
		
	}
	
	public void verifycreatproject(String CustomerName)
	{
		String actualmsg = apcp.getSuccmsg().getText();
		String ExpMsg="Project \""+CustomerName+"\" has been successfully created.";
		Assert.assertEquals(actualmsg, ExpMsg);
		Reporter.log(ExpMsg,true);
	}
	
		public void deleteProject(String customerName,String projectName)
		{
			ettp.getTask().click();
			otp.getProjectCustomer().click();
			Select sel=new Select(apcp.getSelCustomer());
			sel.selectByVisibleText(customerName);
			apcp.getShowBtn().click();
			apcp.getProjectlink().click();
			edi.getDeletproject().click();
			edi.getDelbutn().click();
		}
		public void verifdeleteproject(String projectName)
		{
			
			String actualmsg=apcp.getSuccmsg().getText();
			String expectedmsg="Project has been successfully deleted.";
			Assert.assertEquals(actualmsg, expectedmsg);
			
			try
			{
				if (apcp.getProjectlink().getText().equalsIgnoreCase(projectName)) 
				{
					Assert.assertTrue(false);
				}
			}
			catch(NoSuchElementException e)
			{
				Assert.assertTrue(true);
			}
			
			Reporter.log(projectName+" "+expectedmsg,true);
			
		}
    
	public void createTask(String customerName,String projectName,String taskName)
	{
		ettp.getTask().click();
	    otp.getCretnewtask().click();
	     Select sel=new Select(cnc.getSelectcustomer());
	     sel.selectByVisibleText(customerName);
	     Select sel1=new Select(cnc.getSelectProject());
	     sel1.selectByVisibleText(projectName);
	     cnc.getTaskTxtbx().get(0).sendKeys(taskName);
	     cnc.getSelectDate().get(0).click(); 
	     cnc.getTodaybutton().click();
	     Select sel2=new Select(cnc.getBillingtype().get(0));
	     sel2.selectByIndex(1);
	     cnc.getChkbox().get(0).click();
	     cnc.getCreatetask().click();
	    }
	public void verifycreatetask(String customerName,String projectName)
	{
	    String actualmsg=otp.getTaskmsgverify().getText();
		String expectedmsg="1 new task was added to the customer \""+customerName+"\", project \""+projectName+"\".";
		Assert.assertEquals(actualmsg, expectedmsg);
		otp.getTasknamelink().click();
	    if(vot.getCustomernamelabel().getText()==customerName && vot.getProjectnamelabel().getText()==projectName )
	    {
	    	String actualname=vot.getTaskname().getText();
			String expectedname="FirstTask";
			Assert.assertEquals(actualname, expectedname);
	    	//Assert.assertTrue(true);
			
	    }
		Reporter.log(expectedmsg,true);
	    
		
	}
	public void deleteTasks()
	{
		ettp.getTask().click();
		otp.getTasknamelink().click();
		vot.getDeletetaskbutoon().click();
		vot.getConfdeletbuton().click();
	}
	public void verifydeltTask(String taskName)
	{
	    String actualmsg=otp.getTaskmsgverify().getText();
		String expectedmsg="Task has been successfully deleted.";
		Assert.assertEquals(actualmsg, expectedmsg);
	    Reporter.log(expectedmsg,true);try
		{
			if (otp.getTasknamelink().getText().equalsIgnoreCase(taskName)) 
			{
				Assert.assertTrue(false);
			}
		}
		catch(NoSuchElementException e)
		{
			Assert.assertTrue(true);
		}
		
	}
}
