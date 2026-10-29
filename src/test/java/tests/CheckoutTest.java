package tests;

import org.testng.annotations.Test;

import bases.SetupBases;
import pages.CheckOutPage;
import pages.Login_Logout_Page;
import pages.ProductPage;

import utils.DataProviders;

public class CheckoutTest extends SetupBases{
	
	Login_Logout_Page p1;
	ProductPage p2;
	CheckOutPage p3;

	@Test(dataProvider = "loginData",dataProviderClass = DataProviders.class, priority=1)
    public void loginTest(String username,String password) 
    {
    	p1 = new Login_Logout_Page(d);
    	p1.enterUsername(username);
    	p1.enterPassword(password);
    	p1.clickLogin();
    	
    	p2 = new ProductPage(d);
    	p2.addToCart();
    	p2.goToCart();
    	
    	p3 = new CheckOutPage(d);
    	p3.checkout();
    	p3.enterInfo("Sanket","Patil","410506");
    	p3.continueOrder();
    	p3.completeOrder();
    	p3.generateReceipt();
    }
    
}
