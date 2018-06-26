package com.fast.features.addtocart;

import com.fast.steps.serenity.AddToCartSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)

public class AddToCartProductsTest {

    @Managed(uniqueSession = true)
    public WebDriver webdriver;

    @Steps
    AddToCartSteps addToCartSteps;

    @Test
    public void clickOnAddToCart() {
        addToCartSteps.openHomePage();
        addToCartSteps.clickOnColor("Black");
        addToCartSteps.clickOnSize("xs");
        addToCartSteps.addToCart();
    }


}
