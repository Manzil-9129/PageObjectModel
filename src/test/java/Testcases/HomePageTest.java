package Testcases;

import org.testng.annotations.Test;
import Base.TestBase;
import Pages.HomePage;

import org.testng.annotations.BeforeMethod;

import java.io.IOException;
import org.testng.Assert;

import org.testng.annotations.AfterMethod;

public class HomePageTest extends TestBase{
   HomePage HP;
	
	public HomePageTest() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	
	}
	
	@BeforeMethod
	  public void beforeMethod() throws IOException {
	  browserinitialize();
	  HP=new HomePage();
	  
	 }

	@Test
  public void Validatewomenlink() {
  boolean flag=HP.VerifyWomenLink();
  Assert.assertTrue(flag);
	}
	
	@Test
	public void ValidatedressesLink() {
	boolean flag=HP.VerifydressLink();
	Assert.assertTrue(flag);
	}
	
	@Test
	public void Validate_tshirtsLink() {
	boolean flag=HP.Verifyt_shirtsLink();
	Assert.assertTrue(flag);
	}
  
	

  @AfterMethod
  public void afterMethod() {
  driver.quit();
  }

}
