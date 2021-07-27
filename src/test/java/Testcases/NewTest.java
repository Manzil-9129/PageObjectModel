package Testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.ContactPage;
import Pages.CreateAccountPage;
import Pages.LoginPage;

public class NewTest extends TestBase{

	public NewTest() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}



	ContactPage contact_page;
	LoginPage LP;
	CreateAccountPage C_A_P;


@BeforeMethod
	  public void beforeMethod() throws IOException {
	      browserinitialize();
	      LP=new LoginPage();
	      contact_page=new ContactPage();
	      
		 }

@Test
  public void login()  {
		
		LP.login();
	}
 


    @Test
    public void Validate_wrongemail() {
    	contact_page.verify_wrong_create_account(pro.getProperty("email2"));
    	String Actualresult="Invalid email address.";
    	String Expectedresult=contact_page.validCA();
		Assert.assertEquals(Actualresult,Expectedresult);
    }
    
    
  @Test
  public void filldetails() throws IOException 
  {
  contact_page.verifydetailspage(pro.getProperty("email3"));
   String Actualresult="YOUR PERSONAL INFORMATION";
	String Expectedresult=contact_page.validdetails();
	Assert.assertEquals(Actualresult, Expectedresult);
  }
  

 


  @AfterMethod
  public void afterMethod() {
  driver.quit();
  }
}
