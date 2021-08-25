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
import Pages.TshirtsPage;

public class Tshirts_Test extends TestBase {
TshirtsPage tshirtpage;
ExtentReports reports;
ExtentTest Details;	

	public Tshirts_Test() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	@BeforeMethod(alwaysRun=true)
	public void initialize() throws IOException
	{ 	
		reports=new ExtentReports();
        reports=ExtentReportManager.report();
	    Details=reports.createTest("Adding_To_cart_Test");
		browserinitialize();
		tshirtpage=new TshirtsPage();
	}
	
	@Test
	public void Select_the_Tshirt() {

		Details.log(Status.INFO, "Starting the test");
		Details.log(Status.INFO, "Opening the Browser");
		Details.log(Status.INFO, "Adding");
		Details.log(Status.PASS,"Test Passed" );  
		
		
		
		tshirtpage.Women_Link_hover();
		
		boolean flag=tshirtpage.image_displayed();
		
		Assert.assertTrue(flag);
		
		tshirtpage.click_Addtocart();
		
	}
	
	@AfterMethod(alwaysRun=true)
	public void quit() {
		reports.flush();
		driver.quit();
	}
	
	
}
