package TestRunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions (
		features = {"C:\\Users\\89sig\\Learning-workspace\\Cucumber\\src\\test\\java\\Features\\Login.feature"},
		glue = "StepDefinition",
		dryRun = false,
		//pretty will give clear output in console window
		//html:test-output will create test-output folder with html report
		plugin = {"pretty","html:test-output"},
		//mono choreme will remove unwanteed char in console
		monochrome = true
		
		
		)
public class TestRunner {

}
