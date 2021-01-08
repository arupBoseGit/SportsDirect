package tests;

import org.testng.annotations.Test;

import pages.Home;
import pages.Login;
import pages.MensShoes;


public class SportsTest extends TestBase{

	Home home =null;
	Login login = null;
	
	
	@Test(priority=1)
	public void verifySPortLogin() throws Exception {
		home = new Home(getDriver());
		home.ClickToLogin();
		login = new Login(getDriver());
		login.performLogin("arupstudy2020@gmail.com", "Study2020");
		//home = new Home(getDriver());
		//home.navigateSliders();
	}
	@Test (priority=2)
	public void selectMensShoes() throws Exception {
		//home = new Home(getDriver());
		home.navigateSliders();
	}
	
	@Test (priority=3)
	public void MenShoesSelection() throws Exception {
		MensShoes menshoes = new MensShoes(getDriver());
		menshoes.shoesSelection();
		//.//div[@id='divsiblinglistwrapper']/ul/li
	}
//	public void productKeyTest() throws Exception {
//		home=new Home(getDriver());
//		home.productSearch("530123");
//		
//	}
//	
}
