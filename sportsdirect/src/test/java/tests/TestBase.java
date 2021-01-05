package tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
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
	


