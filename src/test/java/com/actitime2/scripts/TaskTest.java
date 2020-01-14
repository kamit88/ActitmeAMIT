package com.actitime2.scripts;

import org.testng.annotations.Test;

import com.actitime2.fetures.ExcelUtilites;
import com.actitime2.fetures.LoginFeatures;
import com.actitime2.fetures.TaskFeatures;
import com.actitime2.generic.BaseLib;

public class TaskTest extends BaseLib
{   
//	@Test
//
//	public void createNewCustomer()
//	{
//	ExcelUtilites eu=new ExcelUtilites("./testdata/testdata.xlsx");
//    String username=eu.readData("Sheet1",3,1);
//    String password=eu.readData("Sheet1",3,2);
//    LoginFeatures lf=new LoginFeatures(driver);
//    lf.login(username, password);
//    String customerName=eu.readData("Sheet1",3, 3);
//    TaskFeatures tf=new TaskFeatures(driver);
//    tf.createCustomer(customerName);
//    tf.verifycreatCustomer(customerName);
//    tf.clickLogout();
//    
//   }
//
//@Test(dependsOnMethods="deleteprojects")
//public void deleteCustomers()
//{
//	ExcelUtilites eu=new ExcelUtilites("./testdata/testdata.xlsx");
//    String username=eu.readData("Sheet1",4,1);
//    String password=eu.readData("Sheet1",4,2);
//    LoginFeatures lf=new LoginFeatures(driver);
//    lf.login(username, password);
//    String customerName=eu.readData("Sheet1",4, 3);
//    TaskFeatures tf=new TaskFeatures(driver);
//    tf.deleteCustomer(customerName);
//    tf.verifdeleteCustomer(customerName);
//    
//}
//
//
//@Test(dependsOnMethods="createNewCustomer")
//
//public void createProject()
//{    ExcelUtilites eu=new ExcelUtilites("./testdata/testdata.xlsx");
//     String username=eu.readData("Sheet1",5,1);
//     String password=eu.readData("Sheet1",5,2);
//     LoginFeatures lf=new LoginFeatures(driver);
//     lf.login(username, password);
//     String customerName=eu.readData("Sheet1",5, 3);
//     String projName=eu.readData("Sheet1",5, 4);
//     TaskFeatures tf=new TaskFeatures(driver);
//     tf.createproject(customerName,projName);
//     tf.verifycreatproject(projName);
//     tf.clickLogout();
//}
//@Test(dependsOnMethods="createProject")
//
//public void deleteprojects()
//{
//	ExcelUtilites eu=new ExcelUtilites("./testdata/testdata.xlsx");
//    String username=eu.readData("Sheet1",5,1);
//    String password=eu.readData("Sheet1",5,2);
//    LoginFeatures lf=new LoginFeatures(driver);
//    lf.login(username, password);
//    String customerName=eu.readData("Sheet1",5, 3);
//    String projectName=eu.readData("Sheet1",5, 4);
//
//    TaskFeatures tf=new TaskFeatures(driver);
//    tf.deleteProject(customerName,projectName);
//    tf.verifdeleteproject(projectName);(dependsOnMethods="createProject")
//}
//@Test
//public void createTask()
//{
//	ExcelUtilites eu=new ExcelUtilites("./testdata/testdata.xlsx");
//    String username=eu.readData("Sheet1",5,1);
//    String password=eu.readData("Sheet1",5,2);
//    LoginFeatures lf=new LoginFeatures(driver);
//    lf.login(username, password);
//    String customerName=eu.readData("Sheet1",5, 3);
//    String projectName=eu.readData("Sheet1",5, 4);
//    String taskName=eu.readData("Sheet1",5, 5);
//    TaskFeatures tf=new TaskFeatures(driver);
//    tf.createTask(customerName,projectName,taskName);
//    tf.verifycreatetask(customerName,projectName);
//    tf.clickLogout();
//  }
//@Test
//public void deletetask()
//{
//	ExcelUtilites eu=new ExcelUtilites("./testdata/testdata.xlsx");
//    String username=eu.readData("Sheet1",5,1);
//    String password=eu.readData("Sheet1",5,2);
//    LoginFeatures lf=new LoginFeatures(driver);
//    lf.login(username, password);
//    String customerName=eu.readData("Sheet1",5, 3);
//    String projectName=eu.readData("Sheet1",5, 4);
//    String taskName=eu.readData("Sheet1",5, 5);
//    TaskFeatures tf=new TaskFeatures(driver);
//    tf.deleteTasks();
//    tf.verifydeltTask(taskName);
//   }
}
