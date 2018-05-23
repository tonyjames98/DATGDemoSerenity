package com.testgroup.kqed.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("https://www.kqed.org/news")
public class NewsPage extends PageObject {

    @FindBy(xpath = "(//div[contains(@class, \"list_Cards\")])[2]//a[contains(@class, \"card_Title\")]")
    WebElementFacade topArticle;

    public void clickTopArticle() {
        topArticle.click();
    }
}