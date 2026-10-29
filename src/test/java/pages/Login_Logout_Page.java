package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utils.WaitUtils;

public class Login_Logout_Page {

	WebDriver d ;
	
	By username = By.id("user-name");
	By password  = By.id("password");
	By loginBTN = By.id("login-button");
	By logOut = By.id("react-burger-menu-btn");
	By SideBar = By.id("logout_sidebar_link");
	
	
	public Login_Logout_Page(WebDriver d) {
		this.d = d;
	}
	
	
	public void enterUsername(String uname) {
		System.out.println("Username used : "+uname);
		WaitUtils.waitForElement(d, username);
		d.findElement(username).sendKeys(uname);
		
	}
	
	
	public void enterPassword(String pass) {
		System.out.println("Password Used : "+ pass);
		WaitUtils.waitForElement(d, password);
		d.findElement(password).sendKeys(pass);
	}
	
	
	public void clickLogin() {
		WaitUtils.waitForElement(d, loginBTN);
		d.findElement(loginBTN).click();
		
		String url = d.getCurrentUrl();
		
		if(url.contains("https://www.saucedemo.com/inventory.html")) {
			System.out.println("Login Success!!");
		}else {
			WebElement error = d.findElement(By.xpath("//div/h3"));
			System.out.println("Login Failed: "+error.getText());
		}
	}
	

	public void logOut() {
		WaitUtils.waitForElement(d, logOut);
		d.findElement(logOut).click();
		 JavascriptExecutor js = (JavascriptExecutor) d;
			WaitUtils.waitForElement(d, SideBar);
		    WebElement sideBar = d.findElement(SideBar);
		    js.executeScript("arguments[0].click();", sideBar);
	}
	
}
