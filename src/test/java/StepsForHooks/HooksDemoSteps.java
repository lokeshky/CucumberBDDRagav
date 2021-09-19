package StepsForHooks;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.*;

public class HooksDemoSteps {
	
	WebDriver driver = null;
	
	@Before
	public void browserSetup() {
		
		System.out.println("I am inside browser setup");
		System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
		driver=new ChromeDriver();
		
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	
	@After
	public void tearDown() {
		System.out.println("I am inside tearDown");
		driver.close();
		driver.quit();
	}
	
	@BeforeStep
	public void BeforeSteps() {
		System.out.println("I am inside BeforeSteps");
		
	}
	
	@AfterStep
	public void AfterSteps() {
		System.out.println("I am inside AfterSteps");
		
	}
	
	@Given("user is on login page")
	public void user_is_on_login_page() {
	    
	}
	@When("user enters valid username and password")
	public void user_enters_valid_username_and_password() {
	}
	@And("clicks on login button")
	public void clicks_on_login_button() {
	}
	@Then("user is navigated to home page")
	public void user_is_navigated_to_home_page() {
	}




}
