package Utilities;

import java.io.IOException;
import java.util.ArrayList;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import com.mongodb.internal.operation.SyncOperations;

import Base.TestBase;

public class TestUtil extends TestBase {

	public TestUtil() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}


	public static long PAGE_LOAD_TIMEOUT=20;
	public static long IMPLICIT_WAIT=10;
	
	
	
	public ArrayList<String> testdata() {
	Xls_Reader reader=new Xls_Reader("C:\\Users\\SHIV\\eclipse-workspace\\PageModel\\Sheet1.xlsx");	
	ArrayList<String> data=new ArrayList<>();
	
	for(int i=2;i<=reader.getRowCount("Sheet1");i++)
	{
		for(int j=0;j<reader.getColumnCount("Sheet1");j++)
		{
			data.add(reader.getCellData("Sheet1",j,i));
		}
	}
	 
	//  System.out.println(data);
	
	  return data;
	
	}
	
	
	}



	

