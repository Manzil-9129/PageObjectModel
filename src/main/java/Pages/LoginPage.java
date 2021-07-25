package Pages;

import java.io.IOException;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import Base.TestBase;

public class LoginPage extends TestBase{

	
       
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
		
		
		
		
}
