	package Pages;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.sun.org.apache.bcel.internal.generic.Select;

import Base.TestBase;
import ExtentReportG.ExtentReportManager;
import Utilities.TestUtil;

public  class CreateAccountPage extends TestBase {
TestUtil Tu;


	//Checks the Checkbox
	@FindBy(css="#id_gender1")
	WebElement mrcheckbox;
	
	
	@FindBy(css="#customer_firstname")
	WebElement firstnamebox;
	
	@FindBy(css="#customer_lastname")
	WebElement lastnamebox;
	
	@FindBy(css="#passwd")
	WebElement passwordbox;
	
	@FindBy(css="#days")
	WebElement selectdays;
	
	@FindBy(css="#months")
	WebElement month;
	
	
	@FindBy(css="#years")
	WebElement year;	
	
	
	@FindBy(css="#submitAccount")
	WebElement registerbutton;
	
	@FindBy(xpath="//div[@class='alert alert-danger']")
	WebElement signuperror;
	
	public CreateAccountPage() throws IOException {
		super();
		PageFactory.initElements(TestBase.driver, this);
	}
	
	
	public void Filldetails_1(String First_name,String Last_name,String pwd) {
		mrcheckbox.click();
	    firstnamebox.sendKeys(First_name);
		lastnamebox.sendKeys(Last_name);
	    passwordbox.sendKeys(pwd);
	
	}
	
	public void Filldetails_2() throws InterruptedException {
	 	selectdays.click();
	 	
	 	
	   driver.findElement(By.xpath("//select[@id='days']/option[@value='17']")).click();
	   
	   Thread.sleep(500);
	   month.click();
	   driver.findElement(By.xpath("//select[@id='months']/option[@value='5']")).click();
	   
	   Thread.sleep(500);
	   year.click();
	   driver.findElement(By.xpath("//select[@id='years']/option[@value='1998']")).click();
	   
	}
	
	public void Registerbutton() {
		 registerbutton.click();
	}
	
	public boolean Verifysign_Up_page() throws IOException {
    return signuperror.isDisplayed();
	}


	



	
	
}
