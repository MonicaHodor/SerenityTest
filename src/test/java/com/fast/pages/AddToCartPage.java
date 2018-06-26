package com.fast.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

import java.util.List;

@DefaultUrl("https://fasttrackit.org/selenium-test/women/tops-blouses/nolita-cami-493.html")
public class AddToCartPage extends PageObject {


    @FindBy(css = "div[class=\"add-to-cart-buttons\"]  span")
    private WebElementFacade addToCart;


    public void requierdColor(String color) {
        getDriver().findElement(By.cssSelector("img[alt = " + color + "]")).click();
    }

    public void requierdSize(String name) {
        getDriver().findElement(By.name(name)).click();
    }

    public void clickOnAddToCart() {
        addToCart.click();

    }
}









