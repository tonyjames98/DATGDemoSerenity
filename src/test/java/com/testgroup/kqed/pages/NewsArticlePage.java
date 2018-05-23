package com.testgroup.kqed.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("https://www.kqed.org/news")
public class NewsArticlePage extends PageObject {

    @FindBy(xpath = "//time")
    WebElementFacade articlePublishDate;

    public String getArticlePublishDate() {
        return articlePublishDate.getText();
    }
}