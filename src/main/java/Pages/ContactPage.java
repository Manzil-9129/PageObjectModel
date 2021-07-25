package Pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import Base.TestBase;

public class ContactPage  extends TestBase{


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
	
	public void create_account()  {
	
	signB.click();
	emailCA.sendKeys(pro.getProperty("email2"));
	CA_button.click();
	
	}
	
	public void create_account2() {
		signB.click();
		emailCA.sendKeys(pro.getProperty("email3"));
		CA_button.click();
	}
	
	
	public void validCA() {
		String Actualresult="Invalid email address.";
		System.out.println(Expectedresult.getText());
		Assert.assertTrue(Actualresult.equals(Expectedresult.getText()));
		
		}
	
	public void validdetails() {
		String Actualresult="YOUR PERSONAL INFORMATION";
		System.out.println(Expectedresult2.getText());
		Assert.assertTrue(Expectedresult2.getText().equals(Actualresult));
	}
	
}
