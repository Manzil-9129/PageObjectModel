package Testcases;

import org.testng.annotations.Test;

import Base.TestBase;
import Data.NewContactTestData;
import Pages.ContactPage;
import Pages.CreateAccountPage;
import Pages.LoginPage;
import Utilities.TestUtil;
import Utilities.Xls_Reader;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class New_ContactTest extends TestBase{
CreateAccountPage C_A_P;
ContactPage CP;
TestUtil Tu;
Xls_Reader reader;
	
public New_ContactTest() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
  

@BeforeMethod
public void beforemethod() throws IOException {
	browserinitialize();
    
	
	C_A_P= new CreateAccountPage();
	//Need to put the data 
	}
  

 @Test(dataProviderClass=NewContactTestData.class,dataProvider="data")
 public void fillalldetails(String FirstName,String LastName,String pwd) throws IOException, InterruptedException {
	    reader=new Xls_Reader("C:\\Users\\SHIV\\eclipse-workspace\\PageModel\\Sheet1.xlsx");
	    CP=new ContactPage();
		CP.verifydetailspage(pro.getProperty("email3")); 
	 
	 C_A_P.Filldetails_1(FirstName,LastName,pwd);// Need to fill data
	 C_A_P.Filldetails_2();
     
 }
 
 

 @Test
 public void verifyincompletedetails() throws IOException {
	    reader=new Xls_Reader("C:\\Users\\SHIV\\eclipse-workspace\\PageModel\\Sheet1.xlsx");
	    CP=new ContactPage();
		CP.verifydetailspage(pro.getProperty("email3"));
		C_A_P.Registerbutton();
	    boolean Expectedresult=C_A_P.Verifysign_Up_page();
	    Assert.assertTrue(Expectedresult);
	 
 }
 
 
 @AfterMethod
 public void aftermethod() {
	 TestBase.driver.quit();
 }

 
}
