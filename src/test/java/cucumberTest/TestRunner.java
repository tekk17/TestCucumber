package cucumberTest;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * @CucumberOptions(features = "Feature/SampleTest.feature",
glue = { "com.testSteps.Test_Steps" })
 */
@RunWith(Cucumber.class)
@CucumberOptions(
		//features = {"Feature/TaggedHooks1.feature","Feature/TestingHooks.feature","Feature/TestBackGround.feature"},
		features = {"Feature/AddNumbersUsingTables.feature"},
		glue = {"stepDefinition","utilities"},
		monochrome = true,
		format = {"html:testOutput"}
		//tags = {"@AddingWithDataTables,@AddingWithDataTablesSet2"}
)

public class TestRunner {

}
