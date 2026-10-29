package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utils.WaitUtils;

public class ProductPage {
	WebDriver d;
	
	By productsToBeSelect = By.xpath("//button[contains(@class,'btn_inventory')]");
	By goToCart = By.className("shopping_cart_link");
	
	public ProductPage(WebDriver d) {
		this.d = d;
	}
	
	
	public void addToCart() {
		
		WaitUtils.waitForElement(d, productsToBeSelect);
		List<WebElement> products = d.findElements(productsToBeSelect);

	    for (WebElement p : products) {
	        p.click();
	    }
	}
	
	public void goToCart() {
		WaitUtils.waitForElement(d, goToCart);
		d.findElement(goToCart).click();
	}

}
