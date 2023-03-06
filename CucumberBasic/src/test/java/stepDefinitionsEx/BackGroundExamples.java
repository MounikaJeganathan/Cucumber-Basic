package stepDefinitionsEx;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BackGroundExamples {
	
	@Given("Students finished the high school")
	public void students_finished_the_high_school() {
	System.out.println("Students finished the high school");
	}
	@Given("Student finidhed the higher secondary")
	public void student_finidhed_the_higher_secondary() {
		System.out.println("Students finished the higher secondary");
	}
	
	@Given("Student applied for medical course")
	public void student_applied_for_medical_course() {
		System.out.println("Student applied for medical course");
	}
	@When("cleared the entrance exam")
	public void cleared_the_entrance_exam() {
	System.out.println("cleared the entrance exam");
	}
	@Then("eligible to join medical collage")
	public void eligible_to_join_medical_collage() {
	System.out.println("eligible to join medical collage");
	}

	@Given("Student applied for engineer")
	public void student_applied_for_engineer() {
		System.out.println("Student applied for engineer");
	}
	@When("should have good cutoff")
	public void should_have_good_cutoff() {
		System.out.println("should have good cutoff");
	}
	@Then("eligible to join engineering collage")
	public void eligible_to_join_engineering_collage() {
		System.out.println("eligible to join engineering collage");
	}
}
