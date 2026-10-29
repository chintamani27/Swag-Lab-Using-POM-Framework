package tests;

import org.testng.annotations.Test;

import bases.SetupBases;
import pages.Login_Logout_Page;
import pages.ProductPage;
import utils.DataProviders;

public class ProductSelectionTest extends SetupBases {

	Login_Logout_Page p1;
	ProductPage p2;
	
	 @Test(dataProvider = "loginData",dataProviderClass = DataProviders.class, priority=1)
	    public void selectProductTest(String username,String password) 
	    {
	    	p1 = new Login_Logout_Page(d);
	    	p2 = new ProductPage(d);
	    	
	    	p1.enterUsername(username);
	    	p1.enterPassword(password);
	    	p1.clickLogin();
	    	
	    	p2.addToCart();
	    	p2.goToCart();
	    	
	    }

}
