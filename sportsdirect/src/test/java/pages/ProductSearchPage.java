package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductSearchPage extends BasePage{

	private WebDriver driver=null;
	
	@FindBy(xpath=".//div[@id='divsiblinglistwrapper']/ul/li")
	private WebElement productcategory;
	
	public ProductSearchPage(WebDriver driver) throws Exception {
		super(driver);
		if(!isProductPageDisplayed())throw new Exception("Product Page not displyed");
		// TODO Auto-generated constructor stub
	}
	
	public boolean isProductPageDisplayed() {
		return productcategory.isDisplayed();
	}
	
	
}
