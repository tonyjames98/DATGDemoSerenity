package com.testgroup.airbnb.pages;

import org.junit.AfterClass;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("https://airbnb.com")
public class HomePage extends PageObject {

	@FindBy(xpath = "//*[contains(@id, 'GeocompleteController')]")
	WebElementFacade searchBox;

	@FindBy(xpath = "//span[contains(text(), 'Dates')]")
	WebElementFacade btnCalendar;

	@FindBy(xpath = "//span[contains(text(), 'Apply')]")
	WebElementFacade btnApply;

	public void searchItem(String searchText) {
        searchBox.sendKeys(searchText);
        searchBox.sendKeys(Keys.RETURN);
    }
	
	public void clickCalendar() {
        btnCalendar.click();
    }
	
	public void clickSelectedDate(String selectedDate) {
		WebElement btnDate = getDriver().findElement(By.xpath("//tr/td[contains(@aria-label,'"+ selectedDate +"')]"));
		btnDate.click();
    }

	public void clickApply() {
		btnApply.click();
    }

}
