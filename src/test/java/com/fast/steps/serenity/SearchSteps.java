package com.fast.steps.serenity;

import com.fast.pages.SearchPage;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.Keys;

public class SearchSteps {

    SearchPage searchPage;


    @Step
    public void openHomePage() {
        searchPage.open();


    }

    @Step
    public void enter(String keyword) {
        searchPage.search("shirt");


    }

}



