package tests;

import org.testng.annotations.Test;

import bases.SetupBases;
import pages.Login_Logout_Page;

public class NegativeLoginTest extends SetupBases{
	
	Login_Logout_Page p1;
	
	@Test
	public void negativeLogin1() {
		p1 = new Login_Logout_Page(d);
		p1.enterUsername("");
		p1.enterPassword(null);
		p1.clickLogin();
	}
	
	@Test
	public void negativeLogin2() {
		p1 = new Login_Logout_Page(d);
		p1.enterUsername("");
		p1.enterPassword("secret_sauce");
		p1.clickLogin();
	}
	
	@Test
	public void negativeLogin3() {
		p1 = new Login_Logout_Page(d);
		p1.enterUsername("standard_user");
		p1.enterPassword(null);
		p1.clickLogin();
	}
	
	@Test
	public void negativeLogin4() {
		p1 = new Login_Logout_Page(d);
		p1.enterUsername("standard_user");
		p1.enterPassword("secret_sauce");
		p1.clickLogin();
	}
	
	

}
