package seleniumgluecode;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

import org.junit.Assert;

public class Test {
	
	    public static ChromeDriver driver;
	    
	    @Given("^user is on homepage$")
	    public void user_is_on_homepage() throws Throwable {     
	    	WebDriverManager.chromedriver().setup();
	    	
	    	 ChromeOptions options = new ChromeOptions();	       
	    	 options.addArguments("--disable-extensions");
	    	 options.addArguments("test-type");
	    	 options.addArguments("--ignore-certificate-errors");
	    	 options.addArguments("no-sandbox");
	    	
	        driver = new ChromeDriver(options);
	        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	        driver.get("http://automationpractice.com/index.php");
	    }
	    
	    @When("^user navigates to Login Page$")
	    public void user_navigates_to_Login_Page() throws Throwable {
	        driver.findElement(By.linkText("Sign in")).click();
	    }
	    
	    @When("^user enters \"([^\"]*)\" and \"([^\"]*)\"$")
	    public void user_enters_username_and_Password(String arg1, String arg2) throws Throwable {
	    	driver.findElement(By.id("email")).sendKeys(arg1);
	        driver.findElement(By.id("passwd")).sendKeys(arg2);
	        driver.findElement(By.id("SubmitLogin")).click(); 
	        
	     
	    }
	    
	    @Then("^success or failure message is displayed$")
	    public void success_message_is_displayed() throws Throwable {
	    	if(driver.getCurrentUrl().equalsIgnoreCase(
	    		      "http://automationpractice.com/index.php?controller=my-account")){
	    		         System.out.println("Test Pass"); 
	    		      } else { 
	    		         System.out.println("Test Failed"); 
	    		      } 
	        driver.quit();  
	    }      
}
