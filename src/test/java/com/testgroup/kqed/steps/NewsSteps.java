package com.testgroup.kqed.steps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.steps.ScenarioSteps;

import static org.assertj.core.api.Assertions.assertThat;

import com.testgroup.kqed.pages.NewsArticlePage;
import com.testgroup.kqed.pages.NewsPage;

public class NewsSteps extends ScenarioSteps {

    NewsPage newsPage;
    NewsArticlePage newsArticlePage;

    @When("^I select the latest news item$")
    public void whenISelectTheLatestNewsItem() {
        newsPage.clickTopArticle();
    }

    @Then("^I see an article published today$")
    public void iSeeAnArticlePublishedToday() {
        assertThat(newsArticlePage.getArticlePublishDate()).isEqualToIgnoringCase("May 23");
    }
}
