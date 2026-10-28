package withoutPOM;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest {
	WebDriver d;
	WebDriverWait wait;
	
	@BeforeMethod
	public void launchWebsite() {
		d = new ChromeDriver();
		wait = new WebDriverWait(d,Duration.ofSeconds(10));
		
		d.manage().window().maximize();

		d.get("https://the-internet.herokuapp.com/login");

	}
	
	@Test
	public void credentials() {
		d.findElement(By.id("username")).sendKeys("admin");
		d.findElement(By.id("password")).sendKeys("password");
		d.findElement(By.xpath("//button[@type='submit']")).click();
	}
	
	@AfterMethod
	public void closeDriver() {
		d.close();
		
	}

}
