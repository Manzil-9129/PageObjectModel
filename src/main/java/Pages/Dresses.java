package Pages;

import java.io.IOException;

import Base.TestBase;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
public class Dresses  extends TestBase {

	

	
	
	public Dresses() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	//Clicks on the Cart 
	@FindBy(css="div[class='shopping_cart']")
	WebElement cartB;
	
	
	
	
}
