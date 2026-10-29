package pages;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.support.ui.Select;

import utils.WaitUtils;

public class FilterPages {

	WebDriver d;
	 
	By filter = By.className("product_sort_container");
	
	
	public FilterPages(WebDriver d) {
		this.d = d;
	}
	public void filterProducts() {

	    WaitUtils.waitForElement(d, filter);

	    String[] values = {"az", "za", "lohi", "hilo"};

	    for (String value : values) {
	        Select sel = new Select(d.findElement(filter));
	        sel.selectByValue(value);

	        System.out.println("Selected filter: " + value);
	    }
	}
	

}
