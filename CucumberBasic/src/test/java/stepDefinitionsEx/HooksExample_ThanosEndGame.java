package stepDefinitionsEx;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HooksExample_ThanosEndGame {
	
	
	
	@Given("Thanos have infinity stone")
	public void thanos_have_infinity_stone() {
		System.out.println("Thanos have infinity stone");
	}
	
	@When("Thanos snaps his fingers")
	public void thanos_snaps_his_fingers() {
		System.out.println("Thanos snaps his fingers");
	}
	
	@Then("Half living things are died")
	public void half_living_things_are_died() {
		System.out.println("Half living things are died");
	}


}
