package com.fast.features.search;

import com.fast.steps.serenity.SearchSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class SearchByKeywordShirtTest {

    @Managed(uniqueSession = true)
    public WebDriver webdriver;

    @Steps
    SearchSteps searchSteps;


    @Test
    public void searching_by_keyword_shirt_should_display_the_corresponding_products(){
        searchSteps.openHomePage();
        searchSteps.enter("shirt");


    }
}
