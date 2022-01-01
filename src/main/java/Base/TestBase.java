package Base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;

import Utilities.TestUtil;
import Utilities.Xls_Reader;

public class TestBase {

	public static WebDriver driver;
	public static Properties pro;
	
	public TestBase() throws IOException {
		pro=new Properties();
		FileInputStream fI=new FileInputStream("C:\\Users\\SHIV\\eclipse-workspace\\PageModel\\config.properties");
		pro.load(fI);
		
		Xls_Reader reader=new Xls_Reader("C:\\Users\\SHIV\\eclipse-workspace\\PageModel\\Sheet1.xlsx");
		
	}
	
	
	
	public void browserinitialize() throws IOException {
	
		String browser=pro.getProperty("browser");
		if(browser.equals("Firefox"))
		{
			
		System.setProperty("webdriver.gecko.driver","C:\\Selenium Project\\geckodriver.exe");
		driver=new FirefoxDriver();
		}
		else if (browser.equals("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver","C:\\Selenium Project\\chromedriver.exe");
		}
		else
		{
			System.out.println("Not Working");
		}
		
		
	    driver.manage().window().maximize();
	    driver.manage().deleteAllCookies();
	    driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
	    driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT,TimeUnit.SECONDS);  
	    driver.get("http://automationpractice.com/index.php");

		}
	
		public void failed() throws IOException {
			
			
			File src2=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			
			FileUtils.copyFile(src2, new File("C:\\Users\\SHIV\\eclipse-workspace\\PageModel\\Screenshots\\FailedTestCases.jpg"));
			
		}
		
		
		
	
	
	
	
	
	
	
	
	
	
	
	
	
}
