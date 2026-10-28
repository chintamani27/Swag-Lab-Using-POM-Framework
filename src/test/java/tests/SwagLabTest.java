package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import bases.SetupBases;
import pages.SwagLabPages;
import utils.DataProviders;


public class SwagLabTest extends SetupBases {
	
	SwagLabPages p ;
	

//    @Test(dataProvider = "loginData",
//          dataProviderClass = DataProviders.class)
//    public void loginTest(
//            String username,
//            String password,
//            String productName) {
//    	p =  new SwagLabPages(d);
//		
//		//username = standard_user password = secret_sauce
//		p.enterUsername(username);
//		p.enterPassword(password);
//		p.clickLogin();
//		
//		String url = d.getCurrentUrl();
//		
//		if(url.contains("https://www.saucedemo.com/inventory.html")) {
//			
//			System.out.println("Login Success !!");
//			p.selectProduct(productName);
//			//p.addToCart();
//		}
//		
//		
//		else{
//			WebElement error = d.findElement(By.xpath("//div/h3"));
//			System.out.println("Login Failed: "+error.getText());
//			
//		}
//		
//
//		
//    }
	
	@Test
	public void loginTest() {
		p = new SwagLabPages(d);
		p.enterUsername("standard_user");
		p.enterPassword("secret_sauce");
		p.clickLogin();
		p.selectProduct();
		p.addToCart();
		p.goToCart();
		p.checkout();
		p.enterInfo();
		p.continueOrder();
		p.completeOrder();
		p.generateReceipt();
	}

	

}
