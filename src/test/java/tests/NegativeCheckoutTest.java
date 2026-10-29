package tests;

import org.testng.annotations.Test;

import bases.SetupBases;
import pages.CheckOutPage;
import pages.Login_Logout_Page;
import pages.ProductPage;

public class NegativeCheckoutTest extends SetupBases{
	
	Login_Logout_Page p1;
	ProductPage p2;
	CheckOutPage p3;
	
	@Test(priority=1)
	public void ngeativeTest1() {
		p1 = new Login_Logout_Page(d);
    	p1.enterUsername("standard_user");
    	p1.enterPassword("secret_sauce");
    	p1.clickLogin();
    	
    	p2 = new ProductPage(d);
    	p2.addToCart();
    	p2.goToCart();
    	
    	p3 = new CheckOutPage(d);
    	p3.checkout();
    	p3.enterInfo(null,"Patil","410506");
    	p3.continueOrder();
    	p3.completeOrder();
    	p3.generateReceipt();
	}
	
	@Test(priority=2)
	public void ngeativeTest2() {
		p1 = new Login_Logout_Page(d);
    	p1.enterUsername("standard_user");
    	p1.enterPassword("secret_sauce");
    	p1.clickLogin();
    	
    	p2 = new ProductPage(d);
    	p2.addToCart();
    	p2.goToCart();
    	
    	p3 = new CheckOutPage(d);
    	p3.checkout();
    	p3.enterInfo("sanket","Patil", null);
    	p3.continueOrder();
    	p3.completeOrder();
    	p3.generateReceipt();
	}
	
	@Test(priority=3)
	public void ngeativeTest3() {
		p1 = new Login_Logout_Page(d);
    	p1.enterUsername("standard_user");
    	p1.enterPassword("secret_sauce");
    	p1.clickLogin();
    	
    	p2 = new ProductPage(d);
    	p2.addToCart();
    	p2.goToCart();
    	
    	p3 = new CheckOutPage(d);
    	p3.checkout();
    	p3.enterInfo("sanket",null,"410506");
    	p3.continueOrder();
    	p3.completeOrder();
    	p3.generateReceipt();
	}
	
	@Test(priority=4)
	public void ngeativeTest4() {
		p1 = new Login_Logout_Page(d);
    	p1.enterUsername("standard_user");
    	p1.enterPassword("secret_sauce");
    	p1.clickLogin();
    	
    	p2 = new ProductPage(d);
    	p2.goToCart();
    	
    	p3 = new CheckOutPage(d);
    	p3.checkout();
    	p3.enterInfo("sanket","patil","410506");
    	p3.continueOrder();
    	p3.completeOrder();
    	p3.generateReceipt();
	}

}
