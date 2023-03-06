package stepDefinitionsEx;

import io.cucumber.java.en.Given;

public class ExpressionSteps {

	/*
	 * @Given("^I have (\\d+) laptop$") 
	 * public void I_have_laptop(int count) {
	 * System.out.println("Laptop count" + count); 
	 * }
	 * 
	 * @Given("^I have (\\d+\\.\\d+) CGPA$") 
	 * public void I_have_CGPA(float mark) {
	 * System.out.println("My CGPA " + mark );
	 *  }
	 * 
	 * @Given("^\"(.*?)\" is not elder to \"(.*?)\" and \"(.*?)\"$")
	 * 
	 * public void is_not_elder_to(String n1,String n2,String n3) {
	 * System.out.println(n1 +" is not elder than "+ n2 +" and "+ n3);
	 * 
	 * }
	 */ 
	
// we can use without expression in current version
	
	@Given("I have {int} laptop")
	public void i_have_laptop(Integer count) {
		System.out.println("Laptop count" + count); 
	}
	@Given("I have {double} CGPA")
	public void i_have_cgpa(Double mark) {
		System.out.println("My CGPA " + mark );

	}
	@Given("{string} is not elder to {string} and {string}")
	public void is_not_elder_to_and(String n1, String n2, String n3) {

		System.out.println(n1 +" is not elder than "+ n2 +" and "+ n3);
	
	}	



}
