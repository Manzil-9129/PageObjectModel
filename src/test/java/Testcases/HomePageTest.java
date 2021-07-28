package Testcases;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import Base.TestBase;
import ExtentReportG.ExtentReportManager;
import Pages.HomePage;

import org.testng.annotations.BeforeMethod;

import java.io.IOException;
import org.testng.Assert;

import org.testng.annotations.AfterMethod;

public class HomePageTest extends TestBase{
   HomePage HP;
   ExtentReports reports;	
   ExtentTest Home_Page;
	public HomePageTest() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	
	}
	
	@BeforeMethod
	  public void beforeMethod() throws IOException {
	  reports=new ExtentReports();
	  reports=ExtentReportManager.report();
	  Home_Page=reports.createTest("Login Test");
	  browserinitialize();
	  HP=new HomePage();
	  
	 }

	@Test
  public void Validatewomenlink() {
        

		Home_Page.log(Status.INFO, "Starting the test");
		Home_Page.log(Status.INFO, "Opening the Browser");
		Home_Page.log(Status.INFO, "Verify Women Link");
		Home_Page.log(Status.PASS,"Test Passed" );  
		boolean flag=HP.VerifyWomenLink();
        Assert.assertTrue(flag);
	}
	
	@Test
	public void ValidatedressesLink() {
	
        

		Home_Page.log(Status.INFO, "Starting the test");
		Home_Page.log(Status.INFO, "Opening the Browser");
		Home_Page.log(Status.INFO, "Verify Dresses link");
		Home_Page.log(Status.PASS,"Test Passed" );  
		boolean flag=HP.VerifydressLink();
	    Assert.assertTrue(flag);
	}
	
	@Test
	public void Validate_tshirtsLink() {
        

		Home_Page.log(Status.INFO, "Starting the test");
		Home_Page.log(Status.INFO, "Opening the Browser");
		Home_Page.log(Status.INFO, "Verify Tshirts Link");
		Home_Page.log(Status.PASS,"Test Passed" );  
		boolean flag=HP.Verifyt_shirtsLink();
	    Assert.assertTrue(flag);
	}
  
	

  @AfterMethod
  public void afterMethod() {
      reports.flush();
	  driver.quit();
  }

}
