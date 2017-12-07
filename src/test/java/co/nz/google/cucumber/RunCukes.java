package co.nz.google.cucumber;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
		glue = { "co.nz.google.cucumber.steps" }, 
		plugin = { "html:build/cucumber-html-report",
					"pretty:build/cucumber-pretty.txt",
					"json:build/cucumber.json" }, 
		features = { "src/test/resources/features/core/" }
		)

public class RunCukes {
}
