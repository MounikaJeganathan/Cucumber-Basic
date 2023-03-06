package stepDefinitionsEx;

import java.time.Duration;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DataTableW_Header {
	WebDriver driver;
	WebDriverWait wait;
	
	
	@Given("^Open Login Page$")
	public void open_login_page() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
	}
	@When("^Enter the below table values in the login page$")
	public void enter_the_below_table_values_in_the_login_page(io.cucumber.datatable.DataTable dataTable) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    // For other transformations you can register a DataTableType.
		
		List<Map<String, String>> keyValue=dataTable.asMaps(String.class,String.class);
		
		String user =keyValue.get(0).get("Username");
		String pass =keyValue.get(0).get("Password");
		
		
		wait = new WebDriverWait(driver, Duration.ofSeconds(20));

		WebElement username = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@name='username']")));

		username.sendKeys(user);
		driver.findElement(By.name("password")).sendKeys(pass);

	}
	@Then("^Click on Login Button$")
	public void click_on_login_button() {
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	
	}

}
