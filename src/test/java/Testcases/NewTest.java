package Testcases;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.ContactPage;
import Pages.LoginPage;

public class NewTest extends TestBase{

	public NewTest() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}



	ContactPage contact_page;
	LoginPage LP;
	


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
	public void createaccount() {
     
    
     contact_page.create_account();
     contact_page.validCA();
    
     
	 
	}

  @Test
  public void filldetails() 
  {
  
 
  contact_page.create_account2();
  contact_page.validdetails();
  
	
  }



  @AfterMethod
  public void afterMethod() {
  driver.quit();
  }
}
