package tests;

import org.testng.annotations.Test;

import bases.SetupBases;
import pages.CheckOutPage;
import pages.FilterPages;
import pages.Login_Logout_Page;
import pages.ProductPage;
import utils.DataProviders;

public class End_To_End_Test extends SetupBases {

	Login_Logout_Page p1 ;
	FilterPages p2 ;
	ProductPage p3 ;
	CheckOutPage p4 ;
	
	@Test(dataProvider = "loginData" , dataProviderClass = DataProviders.class)
	public void test(String u , String p) {
		p1 = new Login_Logout_Page(d);
		p2 = new FilterPages(d);
		p3 = new ProductPage(d);
		p4 = new CheckOutPage(d);
		
		p1.enterUsername(u);
		p1.enterPassword(p);
		p1.clickLogin();
		
		//p2.filterProducts();
		
		p3.addToCart();
		p3.goToCart();
		
		p4.checkout();
		p4.enterInfo("sanket","patil","213020");
		p4.continueOrder();
		p4.completeOrder();
		p4.generateReceipt();
		
	}
}
