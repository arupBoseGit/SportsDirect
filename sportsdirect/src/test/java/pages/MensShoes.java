package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MensShoes extends BasePage{

	private WebDriver driver=null;
	
		
	@FindBy(xpath=".//ul[@id='ulSizes']/li")
	private WebElement shoeSize;
	
	@FindBy(xpath="(.//ul[@id='ulSizes']/li)[4]")
	private WebElement SelectShoeSize;
	
	@FindBy(xpath=".//a[@id='aAddToBag']")
	private WebElement addToCart;
	
	public MensShoes(WebDriver driver) throws Exception {
		super(driver);
		this.driver=driver;
	//	if(!isShoeSizeDisplayed())throw new Exception("Correct page not displayed");
		}
	
	public boolean isShoeSizeDisplayed() {
		return shoeSize.isDisplayed();
	}
	
	public void shoesSelection() {
		
		//SelectShoeSize.click();
		//addToCart.click();
	}
}
