package Utilities;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;

import Base.TestBase;

public class Listener_Class extends TestBase implements ITestListener{

	public Listener_Class() throws IOException {
		super();
	}

	
	@Override
	public void onTestFailure(ITestResult result) {
		try {
			failed();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
	}
	
	
	
	
	
	
	
	
}
