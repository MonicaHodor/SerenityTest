package com.fast.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://fasttrackit.org/selenium-test/women.html")
public class ProductGridPage extends PageObject {

    @FindBy(css = "div[id=\"header-search\"]")
    private WebElementFacade searchPanel;

    String keyword = "a";
    @FindBy(css = "input[id=\"search\"]")
    private WebElementFacade searchForA;

    @FindBy(css = "a[class=\"next i-next\"] ")
    private WebElementFacade pages;

    public void clickOnSearch() {
        searchPanel.click();
    }

    public void enterKeyword(String keyword) {
        searchForA.typeAndEnter(keyword);
    }
    public void clickOnPages(){
        pages.click();
    }
}
