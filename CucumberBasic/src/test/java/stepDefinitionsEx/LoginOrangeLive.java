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

public class LoginOrangeLive {
	
	WebDriver driver;
	WebDriverWait wait;
	@Given("^Enter the Orangehrmlive URL$")
	public void Enter_the_Orangehrmlive_URL() {
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		
	}

	@When("^Enter the Login Details$")
	public void Enter_the_Login_Details() {
		wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		
		WebElement username = wait.until(
				ExpectedConditions.elementToBeClickable(By.xpath("//input[@name='username']")));
				username.sendKeys("Admin");
				driver.findElement(By.name("password")).sendKeys("admin123");
		
		
	}
	@When("^Click login$")
	public void click_login() {
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	
	}

	
	@Then("^Verify page is loaded$")
	public void verify_page_is_loaded() {
	
		boolean status=	driver.findElement(By.xpath("//*[contains(text(),'Employee Name')]")).isDisplayed();
		Assert.assertTrue(status);
		

	
	}

	
	
}
