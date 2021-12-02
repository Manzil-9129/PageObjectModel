package Pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import Base.TestBase;

public class ContactPage  extends TestBase{
ContactPage p=new ContactPage();

	//Enter email in create account
	@FindBy(css="#email_create")
	WebElement emailCA;
	
	//Expected Result
	@FindBy(xpath="//div[@id='create_account_error']/ol/li")
	WebElement Expectedresult;
	
	//Clicks on the sign link
	@FindBy(css="a[class='login']")
	WebElement signB;
	
	//Clicks on the create an account
	@FindBy(css="#SubmitCreate")
	WebElement CA_button;
	
	//To validate the create account
	@FindBy(xpath="(//div[@class='account_creation']/h3)[1]")
	WebElement Expectedresult2;

	public ContactPage() throws IOException {
		super();
		
		PageFactory.initElements(TestBase.driver,this);
	    
	}
	
	public void verify_wrong_create_account(String email_1)  {
	
	signB.click();
	emailCA.sendKeys(email_1);
	CA_button.click();
	
	}
	
	public void verifydetailspage(String email_2) throws IOException {
		signB.click();
		emailCA.sendKeys(email_2);
		CA_button.click();
	
	}
	
	
	public String validCA() {
		
		return Expectedresult.getText();
		
	
		}
	

	public String validdetails() {
	
		return Expectedresult2.getText();
	
	}
	
}
