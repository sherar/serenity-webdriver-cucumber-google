package co.nz.google.cucumber.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class GoogleResultsPage extends PageObject {

	@FindBy(how = How.ID, using = "resultStats")
	WebElementFacade resultStats;

	final String TIME_ELAPSED_REGEX = "\\((.*) seconds";
	final String RESULTS_REGEX = "About (.*) results";

	
	public int getTimeElapsed() {
		return Math.round(Float.parseFloat(parseResults(resultStats.getText(), TIME_ELAPSED_REGEX)));
	}

	public int gerResults() {
		return Integer.parseInt(parseResults(resultStats.getText(), RESULTS_REGEX).replaceAll(",", ""));
	}

	
	/**
	 * 
	 * @param mydata
	 * @param regex
	 * @return parsed results based on the RegExp used
	 */
	private String parseResults(String mydata, String regex) {
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(mydata);
		return matcher.find() ? matcher.group(1) : "null";
	}
}
