package Pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;

public class HomePage extends TestBase {

  @FindBy(xpath="(//a[@class='sf-with-ul'])[1]")
  WebElement womenLink;
  
  @FindBy(xpath="(//a[@title='Dresses'])[2]")
  WebElement dressesLink;
  
  @FindBy(xpath="(//a[@title='T-shirts'])[2]")
  WebElement tshirtLink;

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
  
  
  
}

