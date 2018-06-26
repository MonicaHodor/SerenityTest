package com.fast.steps.serenity;

import com.fast.pages.AddToCartPage;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Step;
import org.junit.Test;
import org.openqa.selenium.By;

public class AddToCartSteps {

    AddToCartPage addToCartPage;

    @Step
    public void openHomePage() {
        addToCartPage.open();
    }

    @Step
    public void clickOnColor(String color) {
        addToCartPage.requierdColor(color);





    }
    @Step
    public void clickOnSize(String name){
        addToCartPage.requierdSize(name);
    }






    @Step
    public void addToCart() {
        addToCartPage.clickOnAddToCart();
    }
}
