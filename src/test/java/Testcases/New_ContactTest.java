package Testcases;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import Base.TestBase;
import Data.NewContactTestData;
import ExtentReportG.ExtentReportManager;
import Pages.ContactPage;
import Pages.CreateAccountPage;
import Pages.LoginPage;
import Utilities.TestUtil;
import Utilities.Xls_Reader;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class New_ContactTest extends TestBase{
CreateAccountPage C_A_P;
ContactPage CP;
TestUtil Tu;
Xls_Reader reader;
ExtentReports reports;


ExtentTest Details;
public New_ContactTest() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
  

@BeforeMethod
public void beforemethod() throws IOException {
	reports=new ExtentReports();

	reports=ExtentReportManager.report();
	Details=reports.createTest("Details Test");
	browserinitialize();
    C_A_P= new CreateAccountPage();
	//Need to put the data 
	}
  

 @Test(dataProviderClass=NewContactTestData.class,dataProvider="data")
 public void fillalldetails(String FirstName,String LastName,String pwd) throws IOException, InterruptedException {

		Details.log(Status.INFO, "Starting the test");
		Details.log(Status.INFO, "Opening the Browser");
		Details.log(Status.INFO, "Filling Details");
		Details.log(Status.PASS,"Test Passed" );  
	 
	 reader=new Xls_Reader("C:\\Users\\SHIV\\eclipse-workspace\\PageModel\\Sheet1.xlsx");
	 
	 CP=new ContactPage();
	
	 CP.verifydetailspage(pro.getProperty("email3")); 
	 
	 C_A_P.Filldetails_1(FirstName,LastName,pwd);// Need to fill data
	 C_A_P.Filldetails_2();
     
 }
 
 

 @Test
 public void verifyincompletedetails() throws IOException {

		Details.log(Status.INFO, "Starting the test");
		Details.log(Status.INFO, "Opening the Browser");
		Details.log(Status.INFO, "Verify the Missing Detail Error");
		Details.log(Status.PASS,"Test Passed" );
	 
	 
	    reader=new Xls_Reader("C:\\Users\\SHIV\\eclipse-workspace\\PageModel\\Sheet1.xlsx");
	    CP=new ContactPage();
		CP.verifydetailspage(pro.getProperty("email3"));
		C_A_P.Registerbutton();
	    boolean Expectedresult=C_A_P.Verifysign_Up_page();
	    Assert.assertTrue(Expectedresult);
	 
 }
 
 
 @Test
 public void filldetails() throws IOException 
 {
		Details.log(Status.INFO, "Starting the test");
		Details.log(Status.INFO, "Opening the Browser");
		Details.log(Status.INFO, "Verify the CreateAccount Page");
		Details.log(Status.PASS,"Test Passed" );
	 
	 
      CP.verifydetailspage(pro.getProperty("email3"));
      String Actualresult="YOUR PERSONAL INFORMATION";
	  String Expectedresult=CP.validdetails();
	 Assert.assertEquals(Actualresult, Expectedresult);
 }
 
 
 @AfterMethod
 public void aftermethod() {
	 
	 reports.flush();
	 TestBase.driver.quit();
 }

 
}
