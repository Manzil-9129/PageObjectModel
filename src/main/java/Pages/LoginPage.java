package Pages;

import java.io.IOException;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import Base.TestBase;
import ExtentReportG.ExtentReportManager;

public class LoginPage extends TestBase{

	ExtentReports reports;
	ExtentTest Login;	
       
	//PAGE FACTORY
	
		//Clicks on the sign link
		@FindBy(css="a[class='login']")
		WebElement signB;
		
		//Enter email
		@FindBy(css="#email")
		WebElement emailadd;
		
		//Enter the password
		@FindBy(css="#passwd")
		WebElement pwdadd;
		
		//Clicks the Sign in 
		@FindBy(css="button[id='SubmitLogin']")
		WebElement signB2;
		
		
		//Initialize the element
		public LoginPage() throws IOException {
		   super();
		   PageFactory.initElements(TestBase.driver,this);
		}
		
		public void login() {
		signB.click();
		emailadd.sendKeys(pro.getProperty("email"));
		pwdadd.sendKeys(pro.getProperty("pwd"));
		
		
		}
		
		public void reportGenerate() {
		reports=new ExtentReports();
        reports=ExtentReportManager.report();
        Login=reports.createTest("Home-Page-Test");
		}
		
		public void wrongemail_Log() {
			 Login.log(Status.INFO, "Starting the test");
			 Login.log(Status.INFO, "Opening the Browser");
			 Login.log(Status.INFO, "Verify the wrong email");
			 Login.log(Status.PASS,"Test Passed" );
		}
		
		public void Login_Log() {
			 Login.log(Status.INFO, "Starting the test");
			 Login.log(Status.INFO, "Opening the Browser");
			 Login.log(Status.INFO, "Login");
			 Login.log(Status.PASS,"Test Passed" );
		}
		
}
