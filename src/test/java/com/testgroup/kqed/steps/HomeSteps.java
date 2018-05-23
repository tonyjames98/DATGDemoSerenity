package com.testgroup.kqed.steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import net.thucydides.core.steps.ScenarioSteps;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.fail;

import com.testgroup.kqed.pages.HomePage;

public class HomeSteps extends ScenarioSteps {

    HomePage homePage;

    @Given("^I am on the KQED website$")
    public void givenIAmOnTheKQEDWebsite() {
        homePage.open();
        homePage.hideFooter();
        assertThat(homePage.isPageLoaded()).isTrue();
    }

    @When("^I go to the (.*) section$")
    public void whenIGoToTheNewsSection(String section) {
        switch (section.toLowerCase()) {
            case "news":
                homePage.openNewsSection();
                break;
            default:
                fail("Unimplemented section");
        }
    }
}
