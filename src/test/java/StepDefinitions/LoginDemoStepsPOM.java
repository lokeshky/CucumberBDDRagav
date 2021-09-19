package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import pages.loginPage;

public class LoginDemoStepsPOM {
	
//	WebDriver driver = null;
//	loginPage login;
//
//	@Given("browser is open")
//	public void browser_is_open() {
//		
//		System.out.println("-----I am inside logindemosteps POM page---");
//		
//		System.out.println("inside step - browser is open"); //ctrl + space to autocomplete
//		String projectPath=System.getProperty("user.dir");
//		System.setProperty("webdriver.chrome.driver", projectPath+"/src/test/resources/drivers/chromedriver.exe");
//		driver=new ChromeDriver(); //type chr then ctrl+space to auto suggestion
//		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
//		driver.manage().window().maximize();
//		
//	}
//
//	@And("user is on login page")
//	public void user_is_on_login_page() {
//		
//		driver.navigate().to("https://example.testproject.io/web/");
//
//	}
//
//	@When("^user is enters (.*) and (.*)$")
//	public void user_is_enters_username_and_password(String username, String password) throws InterruptedException {
//		
//		
//		login = new loginPage(driver);
//		login.enterUsername(username);
//		login.enterPassword(password);
//		//driver.findElement(By.id("name")).sendKeys(username);
//		//driver.findElement(By.id("password")).sendKeys(password);
//		
//		Thread.sleep(2000);
//		
//	}
//	
//	@And("user clicks login")
//	public void user_clicks_login() throws InterruptedException {
//		
//		login.clickLogin();
//		
//		//driver.findElement(By.id("login")).click();
//		
//		Thread.sleep(2000);
//		
//	    
//	}
//
//	@Then("user is navigated to home page")
//	public void user_is_navigated_to_home_page() throws InterruptedException {
//		
//		login.checkLogoutIsDisplayed();
//		
//		//driver.findElement(By.id("logout")).isDisplayed();
//		
//		Thread.sleep(2000);
//		
//		driver.close();
//		driver.quit();
//		
//	}

}
