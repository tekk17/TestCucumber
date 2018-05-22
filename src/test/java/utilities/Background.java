package utilities;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Background {
	@Given("^this is the given background$")
	public void backgroundBegin() {
		System.out.println("This is the first background step");
	}

	@When("^this is the step being performed$")
	public void backgroundContinue() {
		System.out.println("This is the second background step");
	}

	@Then("^this is the background execution$")
	public void backgroundEnd() {
		System.out.println("This is the third background step");
	}
}
