package co.nz.google.cucumber.steps;

import co.nz.google.cucumber.steps.serenity.UserSteps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class GoogleHomeSteps {

	@Steps
	UserSteps user;

	@Given("I can access the Google Search Engine")
	public void givenIHaveSearchedFor() {
		user.opens_google_page();
	}

	@When("I run a search for (.*)")
	public void iRunASearchFor(String searchTerm) {
		user.searchs(searchTerm);
	}

}
