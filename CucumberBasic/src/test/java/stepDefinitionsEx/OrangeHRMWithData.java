package stepDefinitionsEx;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OrangeHRMWithData {

	WebDriver driver;
	WebDriverWait wait;

	@Given("^Enter the Orangehrmlive URL Page$")
	public void enter_the_orangehrmlive_url_page() {

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}

	@When("^Enter the Login Details with user name \"(.*?)\" and password \"(.*?)\"$")
	public void enter_the_login_details_with_user_name_and_password(String user, String pass) {

		wait = new WebDriverWait(driver, Duration.ofSeconds(20));

		WebElement username = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@name='username']")));
		username.sendKeys(user);
		driver.findElement(By.name("password")).sendKeys(pass);

	}

	@When("^Click login button$")
	public void click_login_button() {
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
	}

	@Then("^Verify page is loaded successfully$")
	public void verify_page_is_loaded_successfully() {
		boolean status=	driver.findElement(By.xpath("//*[contains(text(),'Employee Name')]")).isDisplayed();
		System.out.println(status);
		Assert.assertTrue(status);
		
	}

}
