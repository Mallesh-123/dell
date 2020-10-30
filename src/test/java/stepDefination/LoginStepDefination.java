package stepDefination;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepDefination {
	
	WebDriver driver;
	static {
		System.setProperty("webdriver.chrome.driver","./ChromeDriver.exe ");
		
	}
	
	@Given("^the browser is launched$")
	public void the_browser_is_launched() throws Throwable {
		driver= new ChromeDriver();
		
	}

	@Given("^the application is loaded$")
	public void the_application_is_loaded() throws Throwable {
		driver.get("https://demo.actitime.com/");
	}

	@When("^the user enters valid username$")
	public void the_user_enters_valid_username() throws Throwable {
		
	    driver.findElement(By.id("username")).sendKeys("trainee");
	}

	@When("^the user enters the valid password$")
	public void the_user_enters_the_valid_password() throws Throwable {
		 driver.findElement(By.name("pwd")).sendKeys("trainee");
	    
	}

	@When("^the user clicks on the login button$")
	public void the_user_clicks_on_the_login_button() throws Throwable {
	    
	}

	@Then("^dashboard should be displayed$")
	public void dashboard_should_be_displayed() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}
	@When("^the user enters credentials as username and password$")
	public void the_user_enters_credentials_as_username_and_password(DataTable arg1) throws Throwable {
	    List<Map<String, String>> datamap = arg1.asMaps(String.class, String.class);
	    driver.findElement(By.id("username")).sendKeys(datamap.get(0).get("username"));
	    driver.findElement(By.name("pwd")).sendKeys(datamap.get(0).get("password"));
	    Thread.sleep(3000);
	    
	}

	

}
