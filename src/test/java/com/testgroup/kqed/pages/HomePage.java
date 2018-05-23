package com.testgroup.kqed.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("https://www.kqed.org/")
public class HomePage extends PageObject {

    @FindBy(xpath = "//div[contains(@class, \"AudioPlayer\")]")
    WebElementFacade footer;

    // Dynamic text likely to change
    @FindBy(className = "src-components-NavMenu-___NavMenu__navMenu_Tab_Title___7bmSo")
    WebElementFacade navTitle;

    @FindBy(className = "src-components-NavMenu-___NavMenu__navMenu_Tab___1-kvG")
    WebElementFacade navDropDown;

    @FindBy(xpath = "//a[text()=\"News\"][contains(@class, \"DropdownDesktop\")]")
    WebElementFacade newsSection;

    @FindBy(xpath = "//a[text()=\"Radio\"][contains(@class, \"DropdownDesktop\")]")
    WebElementFacade radioSection;

  
    public boolean isPageLoaded() {
        return navTitle.getText().equalsIgnoreCase("home");
    }

    public void hideFooter() {
        evaluateJavascript("arguments[0].setAttribute('style','display:none')", footer);
    }

    public void openNewsSection() {
        navDropDown.click();
        newsSection.click();
    }
 
}