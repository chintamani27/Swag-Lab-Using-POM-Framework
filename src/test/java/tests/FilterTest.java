package tests;

import org.testng.annotations.Test;

import bases.SetupBases;
import pages.FilterPages;
import pages.Login_Logout_Page;
import utils.DataProviders;

public class FilterTest extends SetupBases {

	Login_Logout_Page p1;
	
	FilterPages p2;
	
	
	
	@Test(dataProvider = "loginData",dataProviderClass = DataProviders.class, priority=1)
	public void testFilter(String username,String password) throws InterruptedException {
		p1=new Login_Logout_Page(d);
		p1.enterUsername(username);
		p1.enterPassword(password);
		p1.clickLogin();
		
		p2 = new FilterPages(d);
		p2.filterProducts();
	}
	
//	@Test
//	public void testFilter() throws InterruptedException {
//		p1=new Login_Logout_Page(d);
//		p1.enterUsername("standard_user");
//		p1.enterPassword("secret_sauce");
//		p1.clickLogin();
//		
//		p2 = new FilterPages(d);
//		p2.filterProducts();
//	}
	
}
