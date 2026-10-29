package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utils.WaitUtils;

public class CheckOutPage {
	WebDriver d;
	
	By checkout = By.id("checkout");
	By firstName = By.id("first-name");
	By lastName = By.id("last-name");
	By zipCode = By.id("postal-code");
	By continueOrder = By.id("continue");
	By finishBtn = By.id("finish");
	By generatePdf = By.name("generate-pdf-order");
	
	public CheckOutPage(WebDriver d) {
		this.d = d;
	}
	
	
	
	public void checkout() {
		WaitUtils.waitForElement(d, checkout);
		d.findElement(checkout).click();
	}
	
	public void enterInfo(String fname,String lname, String zcode) {
		
		WaitUtils.waitForElement(d, firstName);
		d.findElement(firstName).sendKeys(fname);
		
		WaitUtils.waitForElement(d, lastName);
		d.findElement(lastName).sendKeys(lname);
		
		WaitUtils.waitForElement(d, zipCode);
		d.findElement(zipCode).sendKeys(zcode);
	}
	
	public void continueOrder() {
		WaitUtils.waitForElement(d, continueOrder);
		
		d.findElement(continueOrder).click();
	}
	
	public void completeOrder() {

		WaitUtils.waitForElement(d, finishBtn);
		d.findElement(finishBtn).click();
	}
	
	public void generateReceipt() {
		WaitUtils.waitForElement(d, generatePdf);
		d.findElement(generatePdf).click();
		System.out.println("order placed successfully!!");
		
	}

}
