package co.nz.google.cucumber.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

import org.openqa.selenium.Keys;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

@DefaultUrl("http://google.co.nz")
public class GoogleHomePage extends PageObject {

	@FindBy(how = How.NAME, using = "q")
	WebElementFacade searchField;


	public void search(String searchTerm) {
		searchField.sendKeys(searchTerm);
		searchField.sendKeys(Keys.RETURN);
	}

	
}
