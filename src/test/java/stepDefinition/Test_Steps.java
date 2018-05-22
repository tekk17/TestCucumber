package stepDefinition;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import javafx.beans.binding.IntegerBinding;

import java.util.*;

public class Test_Steps {
	@Given("^There are two integers$")
	public void There_are_two_integers(DataTable numbers) throws Throwable {
		// Express the Regexp above with the code you wish you had
		for(Map<String,String> digits : numbers.asMaps(String.class,String.class)) {
			System.out.println("Adding two numbers : " + digits.get("number1") + ", " + digits.get("number2"));
		}
	}

	@Then("^Add and return the sum of two integers$")
	public void Add_and_return_the_sum_of_two_integers(DataTable numbers) throws Throwable {
		// Express the Regexp above with the code you wish you had
		for(Map<String,String> digits : numbers.asMaps(String.class,String.class)) {
			int number1 = Integer.parseInt(digits.get("number1"));
			int number2 = Integer.parseInt(digits.get("number2"));
			int result = number1 + number2;
			System.out.println("The sum is: " + result);
		}
	}

	@Given("^Performing Addition of integers$")
	public void There_are_two_integers() throws Throwable {
		System.out.println("Performing addition of two numbers");
	}

	@When("^The two integers are \"(.*)\" and \"(.*)\"$")
	public void printTheTwoIntegers(int number1, int number2) {
		System.out.println("The two integers being added are: " + number1 + " " + number2);
	}

	@Then("^Add and return the sum of two integers \"(.*)\" and \"(.*)\"$")
	public void printTheSumOfTwoIntegers(int number1, int number2) {
		int result = number1 + number2;
		System.out.println("The Sum of two integers: " + number1 + "+" + number2 + " = " + result);
	}

	@When("^The dataset integers to be added are$")
	public void performIntegerAdditionFromDataTable(DataTable integers) {
		List<List<String>> numberTable = integers.raw();
		for(int i=0;i<2;i++) {
			int number1 = Integer.parseInt(numberTable.get(i).get(0));
			int number2 = Integer.parseInt(numberTable.get(i).get(1));
			System.out.println("The two integers being added are: " + number1 + " " + number2);
		}
	}

	@Then("^The sum of the dataset integers$")
	public void addAndPrintDataSetIntegers(DataTable integers) {
		List<List<String>> numberTable = integers.raw();
		for(int i=0;i<2;i++) {
			int number1 = Integer.parseInt(numberTable.get(i).get(0));
			int number2 = Integer.parseInt(numberTable.get(i).get(1));
			int result = number1 + number2;
			System.out.println("The Sum of two integers: " + number1 + "+" + number2 + " = " + result);
		}
	}
}
