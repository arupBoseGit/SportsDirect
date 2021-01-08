package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
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
	
	@FindBy(xpath="(.//img[@title='Nike - Revolution 5 Men'])[1]")
	private WebElement menNike;
	
	@FindBy(xpath=".//input[@type='search' and @id='txtSearch']")
	private WebElement productSearch;
	
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
	
	public void navigateSliders() throws InterruptedException {
		MoveToElement(driver,slidernavigate);
		Thread.sleep(2000);
		//driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		//MoveToElement(driver,nike);
		nike.click();
		menNike.click();
		
	}
	
	public void productSearch(String productkey) {
		productSearch.click();
		productSearch.sendKeys(productkey);
		productSearch.sendKeys(Keys.ENTER);
	}
}
