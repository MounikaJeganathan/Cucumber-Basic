package stepDefinitionsEx;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class DataTableWOHeader {
	WebDriver driver;
	WebDriverWait wait;

	@Given("^Enter the Login URL Page$")
	public void enter_the_login_url_page() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

	}

	@When("^Enter the below user name and password$")
	public void enter_the_below_user_name_and_password(DataTable dataTable) {

		List<String> someList = dataTable.asLists().get(0);
		String user = someList.get(0);
		String pass = someList.get(1);

		/*
		 * List<String> credentials = dataTable.asList(String.class); String user =
		 * credentials.get(0); String pass = credentials.get(1);
		 */

		wait = new WebDriverWait(driver, Duration.ofSeconds(20));

		WebElement username = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@name='username']")));

		username.sendKeys(user);
		driver.findElement(By.name("password")).sendKeys(pass);

	}

	@When("^Click submit button$")
	public void click_submit_button() {

		driver.findElement(By.xpath("//button[@type='submit']")).click();

	}

}
