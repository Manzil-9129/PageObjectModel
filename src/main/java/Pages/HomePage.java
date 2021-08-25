package Pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import Base.TestBase;
import ExtentReportG.ExtentReportManager;

public class HomePage extends TestBase {

	ExtentReports reports;
	ExtentTest Details;	
	
  @FindBy(xpath="(//a[@class='sf-with-ul'])[1]")
  WebElement womenLink;
  
  @FindBy(xpath="(//a[@title='Dresses'])[2]")
  WebElement dressesLink;
  
  @FindBy(xpath="(//a[@title='T-shirts'])[2]")
  WebElement tshirtLink;
  
  @FindBy(xpath="(//a[text()='T-shirts'])[1]")
  WebElement tshirtslink;
  
  public HomePage() throws IOException {
	  super();
	  PageFactory.initElements(TestBase.driver,this);
	 }

  public boolean VerifyWomenLink() {
	  return womenLink.isDisplayed();
  }
  

  public boolean VerifydressLink() {
	  return dressesLink.isDisplayed();
  }
  
  

  public boolean Verifyt_shirtsLink() {
	  return tshirtLink.isDisplayed();
  }
  
  public void reportGenerate() {
		reports=new ExtentReports();

		reports=ExtentReportManager.report();
		Details=reports.createTest("Home-Page-Test");
	}

  
}

