package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SwagLabPages {
	
	WebDriver d ;
	
	By username = By.id("user-name");
	By password  = By.id("password");
	By loginBTN = By.id("login-button");
	
	public SwagLabPages(WebDriver d) {
		this.d = d;
	}
	
	public void enterUsername(String uname) {
		System.out.println("Username used : "+uname);
		d.findElement(username).sendKeys(uname);
		
	}
	
	public void enterPassword(String pass) {
		System.out.println("Password Used : "+ pass);
		d.findElement(password).sendKeys(pass);
	}
	public void clickLogin() {
		d.findElement(loginBTN).click();
	}
	
//	public void selectProduct(String productName) {
//
//		
//
//		    By productButton = By.xpath(
//		        "//div[@class='inventory_item_name' and text()='"
//		        + productName
//		        + "']/ancestor::div[@class='inventory_item']//button"
//		    );
//
//		    d.findElement(productButton).click();
//		}

	public void selectProduct() {
		d.findElement(By.linkText("Sauce Labs Backpack")).click();
	}
	
	public void addToCart() {
		d.findElement(By.id("add-to-cart")).click();
		
		
		
		

	}
	
	public void goToCart() {
		d.findElement(By.className("shopping_cart_link")).click();
	}
	
	public void checkout() {
		d.findElement(By.id("checkout")).click();
	}
	
	public void enterInfo() {
		d.findElement(By.id("first-name")).sendKeys("Sanket");
		d.findElement(By.id("last-name")).sendKeys("Patil");
		d.findElement(By.id("postal-code")).sendKeys("410502");
	}
	
	public void continueOrder() {
		
		d.findElement(By.id("continue")).click();
	}
	
	public void completeOrder() {
		
		d.findElement(By.id("finish")).click();
	}
	
	public void generateReceipt() {
		d.findElement(By.name("generate-pdf-order")).click();
	}
	
	
	
	
	
	
//	public void getBackToLoginPage() {
//		String url = d.getCurrentUrl();
//		if(url.matches("https://www.saucedemo.com/")) {
//			
//		}
//		else{
//			d.get("https://www.saucedemo.com/");
//		}
//	}

}
