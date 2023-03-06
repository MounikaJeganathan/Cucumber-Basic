package stepDefinitionsEx;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DataTableW_Examples {
	WebDriver driver;
	WebDriverWait wait;

	@Given("^Open New URL Page$")
	public void open_new_url_page() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}

	/*
	 * @When("^Enter the values \"([^\"]*)\" and \"([^\"]*)\" given below$") public
	 * void enter_the_values_and_given_below(String user, String pass) {
	 * 
	 * WebElement username =
	 * wait.until(ExpectedConditions.elementToBeClickable(By.xpath(
	 * "//input[@name='username']")));
	 * 
	 * username.sendKeys(user);
	 * driver.findElement(By.name("password")).sendKeys(pass);
	 * 
	 * }
	 */

	@When("Enter the values {string} and {string} given below")
	public void enter_the_values_and_given_below(String user, String pass) {
		// Write code here that turns the phrase above into concrete actions

		wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		WebElement userNameWebElement = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@name='username']")));
		userNameWebElement.sendKeys(user);
		driver.findElement(By.name("password")).sendKeys(pass);
	}

	@Then("^Submit button is clicked$")
	public void submit_button_is_clicked() {
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}

}
