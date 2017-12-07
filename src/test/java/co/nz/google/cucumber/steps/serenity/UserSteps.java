package co.nz.google.cucumber.steps.serenity;

import co.nz.google.cucumber.pages.GoogleHomePage;
import co.nz.google.cucumber.pages.GoogleResultsPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class UserSteps extends ScenarioSteps {

	GoogleResultsPage resultsPage;
	GoogleHomePage homePage;

	@Step
	public void opens_google_page() {
		homePage.open();
		getDriver().manage().window().maximize();
	}

	@Step
	public void searchs(String searchTerm) {
		homePage.search(searchTerm);
	}

	@Step
	public int get_amount_of_results() {
		return resultsPage.gerResults();
	}
	
	@Step
	public int get_time_elapsed() {
		return resultsPage.getTimeElapsed();
	}

}
