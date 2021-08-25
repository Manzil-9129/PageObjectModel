package Data;

import Utilities.TestUtil;
import Utilities.Xls_Reader;

import java.io.IOException;

import org.testng.annotations.DataProvider;

import Base.TestBase;
public class NewContactTestData extends TestBase {

public NewContactTestData() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}



@DataProvider(name="data")
public static Object[][] data() throws IOException{
	Xls_Reader reader=new Xls_Reader("C:\\Users\\SHIV\\eclipse-workspace\\PageModel\\Sheet1.xlsx");
    TestUtil Tu=new TestUtil();
	
    int counter=0;
    Object[][] internaldata;
	internaldata=new Object[reader.getRowCount("Sheet1")-1][(reader.getColumnCount("Sheet1"))];
	
	    for(int d=0;d<reader.getRowCount("Sheet1")-1;d++) {
		
		for(int d2=0;d2<reader.getColumnCount("Sheet1");d2++)
		{
			internaldata[d][d2]=Tu.testdata().get(counter);
			counter++;
		}
	}
	   System.out.println(internaldata);
	    return internaldata;
	
	
	
}
	
	
	
}
