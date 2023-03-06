package stepDefinitionsEx;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OpenGoogleStepDefinition {
	WebDriver driver;
	@Given("user is entering google.com")
	public void user_is_entering_google_com() {
	    // Write code here that turns the phrase above into concrete actions
		
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		
		
	}
	
	
	@When("user is typing the search term {string}")
	public void user_is_typing_the_search_term(String searchterm) {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.name("q")).sendKeys(searchterm);
		
		
	}
	
	
	@When("Enter the return key")
	public void enter_the_return_key() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
	}
	
	
	@Then("user should see the result")
	public void user_should_see_the_result() {
	    // Write code here that turns the phrase above into concrete actions
		boolean status=	driver.findElement(By.partialLinkText("milaasi")).isDisplayed();
		if (status) {
			System.out.println("Displayed");
		}
		driver.close();
	}
	
	

}
