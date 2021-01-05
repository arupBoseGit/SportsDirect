package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login extends BasePage{

private WebDriver driver = null;
	
@FindBy (xpath=".//input[@type='email' and @class='form-control']")
private WebElement Userbutton;

@FindBy (xpath=".//input[@type='password' and @class='form-control']")
private WebElement password;

@FindBy (xpath=".//a[@id='LoginButton']")
private WebElement loginbutton;


	//constructor to initialise pagefactory
	
	public Login(WebDriver driver) throws Exception {
		super(driver);
		this.driver=driver;
		if(!isLoginPageDisplayed()) throw new Exception("Login Page not displayed");
}
	public boolean isLoginPageDisplayed() {
		return Userbutton.isDisplayed();
	}
	public void performLogin(String email, String pasword) {
		Userbutton.sendKeys(email);
		password.sendKeys(pasword);
		loginbutton.click();
	}
}
