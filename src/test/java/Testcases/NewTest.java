package Testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import Base.TestBase;
import ExtentReportG.ExtentReportManager;
import Pages.ContactPage;
import Pages.CreateAccountPage;
import Pages.LoginPage;

public class NewTest extends TestBase{
ContactPage contact_page;
LoginPage LP;
CreateAccountPage C_A_P;
ExtentReports reports;	
ExtentTest Login;
//Constructor
public NewTest() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}



@BeforeMethod
	  public void beforeMethod() throws IOException {
	reports=new ExtentReports();
    reports=ExtentReportManager.report();
	Login=reports.createTest("Login Test");
	      browserinitialize();
	      LP=new LoginPage();
	      contact_page=new ContactPage();
	      
		 }

@Test
  public void login()  {


	Login.log(Status.INFO, "Starting the test");
	Login.log(Status.INFO, "Opening the Browser");
	Login.log(Status.INFO, "Login Failed Test");
	Login.log(Status.PASS,"Test Passed" );  
		LP.login();
	}
 


@Test
  public void Validate_wrongemail() {

	   Login.log(Status.INFO, "Starting the test");
	   Login.log(Status.INFO, "Opening the Browser");
	   Login.log(Status.INFO, "Validate wrongemail");
	   Login.log(Status.PASS,"Test Passed" );
	
	    contact_page.verify_wrong_create_account(pro.getProperty("email2"));
    	String Actualresult="Invalid email address.";
    	String Expectedresult=contact_page.validCA();
		Assert.assertEquals(Actualresult,Expectedresult);
    }
    
  

 @AfterMethod
  public void afterMethod() {
     reports.flush();
	 driver.quit();
  }
}
