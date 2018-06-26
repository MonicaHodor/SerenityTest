package com.fast.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

@DefaultUrl("https://fasttrackit.org/selenium-test/women/tops-blouses.html")
public class ProductEssentialPage extends PageObject {

    @FindBy(css = "a[title=\"View Details\"]")
    private WebElementFacade viewdetailbutton;


    @FindBy(css = "#configurable_swatch_size")
    private WebElementFacade sizeLink;

    @FindBy(css = "ul[class=\"product-image-thumbs\"] ")
    private WebElementFacade productImages;

    @FindBy(css = "div[class=\"zoomContainer\"]")
    private WebElementFacade zoomImage;

    @FindBy(css = "ul[class=\"sharing-links\"]")
    private  WebElementFacade shareImages;

    @FindBy(css ="li[class=\"current\"]")
    private WebElementFacade descriptionProduct;


    public void clickViewDetailButton() {
        viewdetailbutton.click();

    }

    public void clickOnSizeLabel() {
        sizeLink.click();

    }

    public void clickOnProductColor() {
        getDriver().findElement(By.cssSelector("ul[id=\"configurable_swatch_color\"]")).click();
    }

    public void clickLinkForSelectedProduct(String linktext) {
        getDriver().findElement(By.linkText(linktext)).click();
    }

    public void clickOnDetailedImages() {
        productImages.click();

    }

    public void mouseOverImage() {
        withAction().moveToElement(zoomImage);


    }
    public void shareOnSocialMedia(){
        shareImages.click();

    }

    public void descriptionPanel(){
        descriptionProduct.click();
    }
}

