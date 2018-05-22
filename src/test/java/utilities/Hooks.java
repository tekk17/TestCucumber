package utilities;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {
	@Before(order = 1)
	public void beforeScenarioHook() {
		System.out.println("This will execute before the scenario");
	}

	@After(order = 1)
	public void afterScenarioHook() {
		System.out.println("This will execute after the scenario");
	}

	@Before("@First")
	public void beforeFirstScenario() {
		System.out.println("This will execute before first scenario");
	}

	@After("@First")
	public void afterFirstScenario() {
		System.out.println("This will execute after the first scenario");
	}

	@Before("@Second")
	public void beforeSecondScenario() {
		System.out.println("This will execute before the second scenario");
	}

	@After("@Second")
	public void afterSecondScenario() {
		System.out.println("This will execute after the second scenario");
	}

	@Before(order = 0)
	public void beginningOfAFeature() {
		System.out.println("-------------Start of the scenario-----------");
	}

	@After(order = 0)
	public void endOfScenario() {
		System.out.println("-------------End of scenario--------------");
	}
}
