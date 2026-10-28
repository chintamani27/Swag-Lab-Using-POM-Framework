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
