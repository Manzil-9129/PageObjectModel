package Pages;

import java.io.IOException;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Base.TestBase;
import org.openqa.selenium.support.PageFactory;
public class Addtocart  extends TestBase {

	//This is Add to cart page 
    //Fixed

	

	//Clicks on the Cart 
	@FindBy(css="div[class='shopping_cart']")
	WebElement cartB;
	
	
	
	public Addtocart() throws IOException {
		super();
		PageFactory.initElements(driver, this);
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
