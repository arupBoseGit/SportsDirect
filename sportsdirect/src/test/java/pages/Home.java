package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Home extends BasePage{
	//WebElement for Home
		private WebDriver driver = null;
	
	// home page elements Locators
	@FindBy(xpath=".//nav[@id='topMenu']/ul/li")
	private WebElement sliders;
	
	@FindBy(xpath=".//span[@class='hidden-xs' and contains(text(),'Sign In')]")
	private WebElement login;
	
	@FindBy(xpath="(.//nav[@id='topMenu']/ul/li)[3]")
	private WebElement slidernavigate; 
	
	@FindBy(xpath="(.//li[@class='mmHasChild level1 sdmColHeaderHidden']/ul/li/a)[4]")
	private WebElement nike;
	
	
	//constructor to initialise pagefactory
	
	public Home(WebDriver driver) throws Exception {
		super(driver);
		this.driver=driver;
		if(!isHomePageDisplayed())throw new Exception("Home PAge not displayed");
		// TODO Auto-generated constructor stub
	}
	
	public boolean isHomePageDisplayed() {
		return sliders.isDisplayed();
	}
	
	public void ClickToLogin() {
		login.click();
	}
	
	public void navigateSliders() {
		MoveToElement(driver,slidernavigate);
		//driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		//MoveToElement(driver,nike);
		//nike.click();
		
	}
}
