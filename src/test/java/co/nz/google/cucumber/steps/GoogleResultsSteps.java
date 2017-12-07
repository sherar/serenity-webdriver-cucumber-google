package co.nz.google.cucumber.steps;

import org.junit.Assert;

import co.nz.google.cucumber.steps.serenity.UserSteps;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import net.thucydides.core.annotations.Steps;

public class GoogleResultsSteps {

	@Steps
	UserSteps user;

	@Then("I get more than one result")
	public void givenIHaveSearchedFor() {
		Assert.assertTrue(user.get_amount_of_results() > 1);
	}

	@And("the results are returned in under a second")
	public void theResultsAreReturnedInUnderASecond() {
		Assert.assertTrue(user.get_time_elapsed() <= 1);
	}

}
