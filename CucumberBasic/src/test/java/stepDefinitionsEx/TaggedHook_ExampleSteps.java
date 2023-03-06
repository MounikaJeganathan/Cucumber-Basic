package stepDefinitionsEx;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TaggedHook_ExampleSteps {
	
	@Given("first step")
	public void first_step() {
		System.out.println("1st Steps");
	}
	@When("second step")
	public void second_step() {
		System.out.println("2nd Steps");
	}
	@Then("Third step")
	public void third_step() {
		System.out.println("3rd Steps");
	}

}
