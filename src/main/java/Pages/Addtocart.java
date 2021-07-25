package Pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Base.TestBase;

public class Addtocart  extends TestBase {

	


	public Addtocart() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	//Clicks on the Cart 
	@FindBy(css="div[class='shopping_cart']")
	WebElement cartB;
}
