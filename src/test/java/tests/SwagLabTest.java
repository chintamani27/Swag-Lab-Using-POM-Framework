package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import bases.SetupBases;
import pages.SwagLabPages;


public class SwagLabTest extends SetupBases {
	
	SwagLabPages p ;
	
	@Test
	public void verifyLogin_1() {
		p =  new SwagLabPages(d);
		
		//username = standard_user password = secret_sauce
		p.enterUsername("standard_user");
		p.enterPassword("secret_sauce");
		p.clickLogin();
		
		String url = d.getCurrentUrl();
		
		if(url.contains("https://www.saucedemo.com/inventory.html")) {
			
			System.out.println("Login Success !!");
		}
		
		
		else{
			WebElement error = d.findElement(By.xpath("//div/h3"));
			System.out.println("Login Failed: "+error.getText());
			
		}
		
		
		
		
	}
	
	@Test
	public void verifyLogin_2() {
		p =  new SwagLabPages(d);
		
		//username = standard_user password = secret_sauce
		p.enterUsername("locked_out_user");
		p.enterPassword("secret_sauce");
		p.clickLogin();
		
		String url = d.getCurrentUrl();
		
		if(url.contains("https://www.saucedemo.com/inventory.html")) {
			
			System.out.println("Login Success !!");
		}
		
		
		else{
			WebElement error = d.findElement(By.xpath("//div/h3"));
			System.out.println("Login Failed: "+error.getText());
			
		}
		
		
		
		
	}
	
	@Test
	public void verifyLogin_3() {
		p =  new SwagLabPages(d);
		
		//username = standard_user password = secret_sauce
		p.enterUsername("problem_user");
		p.enterPassword("secret_sauce");
		p.clickLogin();
		
		String url = d.getCurrentUrl();
		
		if(url.contains("https://www.saucedemo.com/inventory.html")) {
			
			System.out.println("Login Success !!");
		}
		
		
		else{
			WebElement error = d.findElement(By.xpath("//div/h3"));
			System.out.println("Login Failed: "+error.getText());
			
		}
		
		
		
		
	}
	
	@Test
	public void verifyLogin_4() {
		p =  new SwagLabPages(d);
		
		//username = standard_user password = secret_sauce
		p.enterUsername("performance_glitch_user");
		p.enterPassword("secret_sauce");
		p.clickLogin();
		
		String url = d.getCurrentUrl();
		
		if(url.contains("https://www.saucedemo.com/inventory.html")) {
			
			System.out.println("Login Success !!");
		}
		
		
		else{
			WebElement error = d.findElement(By.xpath("//div/h3"));
			System.out.println("Login Failed: "+error.getText());
			
		}
		
		
		
		
	}
	
	@Test
	public void verifyLogin_5() {
		p =  new SwagLabPages(d);
		
		//username = standard_user password = secret_sauce
		p.enterUsername("error_user");
		p.enterPassword("secret_sauce");
		p.clickLogin();
		
		String url = d.getCurrentUrl();
		
		if(url.contains("https://www.saucedemo.com/inventory.html")) {
			
			System.out.println("Login Success !!");
		}
		
		
		else{
			WebElement error = d.findElement(By.xpath("//div/h3"));
			System.out.println("Login Failed: "+error.getText());
			
		}
		
		
		
		
	}
	
	@Test
	public void verifyLogin_6() {
		p =  new SwagLabPages(d);
		
		//username = standard_user password = secret_sauce
		p.enterUsername("visual_user");
		p.enterPassword("secret_sauce");
		p.clickLogin();
		
		String url = d.getCurrentUrl();
		
		if(url.contains("https://www.saucedemo.com/inventory.html")) {
			
			System.out.println("Login Success !!");
		}
		
		
		else{
			WebElement error = d.findElement(By.xpath("//div/h3"));
			System.out.println("Login Failed: "+error.getText());
			
		}
		
		
		
		
	}
	
	

}
