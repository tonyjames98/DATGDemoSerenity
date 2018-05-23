package com.testgroup.airbnb.steps;

import org.junit.AfterClass;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.server.handler.interactions.MouseDown;

import com.testgroup.airbnb.pages.HomePage;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.steps.ScenarioSteps;




public class SmokeTestSteps extends ScenarioSteps  {

    HomePage homePage;

	@Before
	public void beforeScenario() {
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDrivers\\chromedriver.exe");
	}

	@Given("^I open the Open AirBnB Website$")
	public void i_open_the_Open_AirBnB_Website() throws Throwable {
		homePage.open();
	}

	@Given("^I type \"([^\"]*)\" and presses Enter$")
	public void i_type_and_presses_Enter(String searchText) throws Throwable {
		homePage.searchItem(searchText);
	}

	@Given("^I click on the calendar button$")
	public void i_click_on_the_calendar_button() throws Throwable {
		homePage.clickCalendar();		
	}

	@Given("^I click on \"([^\"]*)\"$")
	public void i_click_on(String selectedDate) throws Throwable {
		homePage.clickSelectedDate(selectedDate);
	}
	
	
	@Given("^I click on apply$")
	public void i_click_on_apply() throws Throwable {
		homePage.clickApply();	
	}
	

}
