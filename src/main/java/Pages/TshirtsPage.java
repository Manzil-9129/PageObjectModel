package Pages;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;

public class TshirtsPage extends TestBase{

	public TshirtsPage() throws IOException {
		super();
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="(//a[@class='sf-with-ul'])[1]")
	WebElement womenLink;
	  
	@FindBy(xpath="(//a[text()='T-shirts'])[1]")
	WebElement tshirtslink;

	@FindBy(xpath="//span[text()='Add to cart']")
	WebElement Addtocart;
	
	@FindBy(xpath="//a[@class='product_img_link']/img")
	WebElement img;
	
	@FindBy(css=".cross")
	WebElement popupclose;

	  public void Women_Link_hover()
	  { 
		  Actions builder=new Actions(driver);
		  builder.moveToElement(womenLink).build().perform();
		  tshirtslink.click();
		  
		  
	  }
	
	  public void click_Addtocart()
	  {
		  Addtocart.click();
		  popupclose.click();
	  }
	  
	 
	  public boolean image_displayed()
	  {
		 boolean flag=img.isDisplayed();
		 return flag;
	  }
	  

	
}
