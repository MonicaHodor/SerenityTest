package com.fast.features.productgrid;

import com.fast.steps.serenity.ProductGridSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class ProductGridTest {

    @Managed(uniqueSession = true)
    public WebDriver webdriver;

    @Steps
    ProductGridSteps productGridSteps;

    @Test
    public void searchForA(){
        productGridSteps.openHomePage();
        productGridSteps.clickOnSearchPanel();
        productGridSteps.enterKeywordA("a");
        productGridSteps.clickOnPages();
    }



}
