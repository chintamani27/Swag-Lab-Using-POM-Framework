package utils;
import org.testng.annotations.DataProvider;
public class DataProviders {
	

	    @DataProvider(name = "loginData")
	    public Object[][] getLoginData() {

	        return new Object[][] {
	            {"standard_user", "secret_sauce","Sauce Labs Backpack"},
	            {"locked_out_user", "secret_sauce","Sauce Labs Backpack"},
	            {"problem_user", "secret_sauce","Sauce Labs Backpack"},
	            {"performance_glitch_user", "secret_sauce","Sauce Labs Backpack"},
	            {"error_user", "secret_sauce","Sauce Labs Backpack"},
	            {"visual_user", "secret_sauce","Sauce Labs Backpack"}
	        };
	   }
	

}
