package stepDefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Test_Hooks {
	@Given("^This is the first step$")
	public void this_is_the_first_step() {
		System.out.println("This is the first step");
	}

	@Then("^this is the second step$")
	public void this_is_the_second_step() {
		System.out.println("This is the second step");
	}

	@When("^this is the third step$")
	public void this_is_the_third_step() {
		System.out.println("This is the third step");
	}
}
