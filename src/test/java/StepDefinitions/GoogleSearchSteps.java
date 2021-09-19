package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class GoogleSearchSteps {

	//ctrlA + ctrlI for formatting
	
	WebDriver driver = null;
	

//	@Given("browser is open")
//	public void browser_is_open() {
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
//	@And("user is on google search page")
//	public void user_is_on_google_search_page() {
//		
//		System.out.println("inside step - user is on google search page ");
//		driver.navigate().to("https://www.google.com");
//		
//		
//	}
//
//	@When("user enters a text in search box")
//	public void user_enters_a_text_in_search_box() throws InterruptedException {
//		
//		System.out.println("inside step - user enters a text in search box");
//		
//		driver.findElement(By.name("q")).sendKeys("automation step by step");
//		
//		Thread.sleep(2000);		
//		
//	}
//
//	@And("hits enter")
//	public void hits_enter() throws InterruptedException {
//		
//		System.out.println("inside step - user hits enter");
//		
//		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
//		
//		Thread.sleep(2000);
//		
//	}
//
//	@Then("user is navigated to serach results")
//	public void user_is_navigated_to_serach_results() throws InterruptedException {
//		
//		System.out.println("inside step - user is navigated to serach results");
//		
//		if ( driver.getPageSource().contains("Online Courses") ) 
//			System.out.println("yes it has online courses");
//		else
//			System.out.println("no online course");
//		
//		Thread.sleep(2000 );
//		
//		driver.close();
//		
//		driver.quit();
//	}

}
