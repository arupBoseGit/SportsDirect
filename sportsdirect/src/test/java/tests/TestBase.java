package tests;

import java.io.File;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import core.DriverFactory;

public class TestBase {
	
	private WebDriver driver;
	private DriverFactory df;
	
	@Parameters("browser")
	@BeforeClass(alwaysRun=true)
	public void initDriver(String browser) {
		df = new DriverFactory();
		driver = df.getDriver(browser);
		//driver =  new DriverFactory().getDriver(browser);
	}
	
//	@DataProvider
//	public Object[][]getData(Method testcase) throws Exception{
//		File testDataLocation = new File( pathname:"");
//		List<HashMap<String,String>> extractedData = null;
//		String dataSource = TestConfig.getProperty("dataSource");
//		String envName = TestConfig.getProperty("env").toUpperCase();
//		
//		//setting the data source
//		if(dataSource.equalsIgnoreCase(anotherString: "excel")) {
//			this.testData = new ExcelDataProvider(testDataFile: testDataLocation.getAbsoluteFile()+"TestData.xlsx",envName);
//		}
//		else if (dataSource.equalsIgnoreCase(anotherString : "json))"{
//			this.testData = new JSONDataProvider(filepath: testDataLocation+"/data."+envName+".json");
//			}
//		else {throw new Exception("Invalid data source specified : "+datasource);
//		}
//		extractedData = this.testData.getAllData(testCase.getName());
//		return this.createDataProvider(extractedData);
//	}
	public WebDriver getDriver() {
		return driver;
	}
	
	@BeforeMethod(alwaysRun=true)
	public void launchApp() {
		driver.get("https://ie.sportsdirect.com/");
	}
	
//	@AfterClass
//	public void cleanUp() {
//		if(driver!=null) {
//			driver.quit();
//		}
	}
	


