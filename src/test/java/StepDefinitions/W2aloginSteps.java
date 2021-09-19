package StepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class W2aloginSteps {
	
	@Before
	public void setUp() {
		System.out.println("lanuching the browser");
	}
	
	@After
	public void tearDown() {
		System.out.println("quiting the browser");
	}
	
	@Before("@prodnew")
	public void setUpProd() {
		System.out.println("lanuching the browser in prod");
	}
	
	@After("@prodnew")
	public void tearDownprod() {
		System.out.println("quiting the browser in prod");
	}
	
	@Given("^user navigates to facebook$")
	public void user_navigates_to_facebook() {
	    System.out.println("user navigates to facebook");
	}

	@When("^user validates the title of the facebook$")
	public void user_validates_the_title_of_the_facebook() {
		System.out.println("user validates the title of the facebook");
	}

	@Then("^user enters \"[a-zA-Z]{1,}\" username$")
	public void user_enters_username() {
		System.out.println("user enters username");
	}

	@And("^user enters \"[a-zA-Z]{1,}\" password$")
	public void user_enters_password() {
		System.out.println("user enters password");
	}

	@Then("^user \"[a-zA-Z]{1,}\" successfully logged in$")
	public void user_shouldbe_successfully_logged_in() {
		System.out.println("user successfully logged in");
	}
	

}
