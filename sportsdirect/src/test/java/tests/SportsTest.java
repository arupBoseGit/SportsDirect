package tests;

import org.testng.annotations.Test;

import pages.Home;
import pages.Login;


public class SportsTest extends TestBase{

	Home home =null;
	Login login = null;
	
	
	@Test
	public void verifySPortLogin() throws Exception {
		home = new Home(getDriver());
		home.ClickToLogin();
		login = new Login(getDriver());
		login.performLogin("arupstudy2020@gmail.com", "Study2020");
		home = new Home(getDriver());
//		home.navigateSliders();
	}
	@Test
	public void selectMensShoes() throws Exception {
		//home = new Home(getDriver());
		home.navigateSliders();
	}
}
