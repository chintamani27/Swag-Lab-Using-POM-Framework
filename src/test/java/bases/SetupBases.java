package bases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class SetupBases {

	protected WebDriver d ;
	@BeforeMethod
	public void launchWebSite() {
		d = new EdgeDriver();
		d.manage().window().maximize();
		d.get("https://www.saucedemo.com/");
		
	}
	
	@AfterMethod
	public void closeWebsite() throws InterruptedException {
		
		d.quit();
	}
}
