package Testcases;

import org.testng.annotations.Test;

import Base.TestBase;
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
  

 @Test
 public void fillalldetails() throws IOException, InterruptedException {
	    reader=new Xls_Reader("C:\\Users\\SHIV\\eclipse-workspace\\PageModel\\Sheet1.xlsx");
	    CP=new ContactPage();
		CP.verifydetailspage(reader.getCellData("Sheet1",3,2)); 
	 
	 C_A_P.Filldetails_1(reader.getCellData("Sheet1",0,2),reader.getCellData("Sheet1",2,1),reader.getCellData("Sheet1",2,2));// Need to fill data
	 C_A_P.Filldetails_2();
     
 }

 @Test
 public void verifyincompletedetails() throws IOException {
	    reader=new Xls_Reader("C:\\Users\\SHIV\\eclipse-workspace\\PageModel\\Sheet1.xlsx");
	    CP=new ContactPage();
		CP.verifydetailspage(reader.getCellData("Sheet1",3,2));
		C_A_P.Registerbutton();
	    boolean Expectedresult=C_A_P.Verifysign_Up_page();
	    Assert.assertTrue(Expectedresult);
	 
 }
 
 
 @AfterMethod
 public void aftermethod() {
	 TestBase.driver.quit();
 }

 
}
