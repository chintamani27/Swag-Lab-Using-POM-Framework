package tests;

import org.testng.annotations.Test;

import bases.SetupBases;
import pages.Login_Logout_Page;
import utils.DataProviders;

public class Login_LogOut_Test extends SetupBases {
	
	Login_Logout_Page  p ;

	@Test(dataProvider = "loginData",dataProviderClass = DataProviders.class, priority=1)
    public void loginTest(String username,String password) 
    {
    	p =  new Login_Logout_Page(d);
		
		//username = standard_user password = secret_sauce
		p.enterUsername(username);
		p.enterPassword(password);
		p.clickLogin();
    }
	
//	@Test(priority=2)
//    public void loginTest() 
//    {
//    	p =  new Login_Logout_Page(d);
//		
//		//username = standard_user password = secret_sauce
//		p.enterUsername(username);
//		p.enterPassword(password);
//		p.clickLogin();
//    }
}
