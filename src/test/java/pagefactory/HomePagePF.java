package pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePagePF {
	
	WebDriver driver;
	
	@FindBy(id="logout")
	WebElement btn_logout;
	
	public HomePagePF(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	public void checkLogoutIsDisplayed() {
		btn_logout.isDisplayed();
	}

}
