package com.fast.steps.serenity;

import com.fast.pages.ProductEssentialPage;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

public class ProductEssentialSteps {

    ProductEssentialPage productEssentialPage;

    @Step
    public void clickOnViewDetail() {
        productEssentialPage.clickViewDetailButton();
    }

    @Step
    public void clickOnSwatchLabel() {
        productEssentialPage.clickOnSizeLabel();

    }

    @Step
    public void clickOnColorLabel() {
        productEssentialPage.clickOnProductColor();
    }

    @Step
    public void clickLinkForSelectedProduct(String linktext) {
        productEssentialPage.clickLinkForSelectedProduct(linktext);


    }

    @Step
    public void clickOnDetailedImages() {
        productEssentialPage.clickOnDetailedImages();

    }

    @Step
    public void mouseOverImage() {
        productEssentialPage.mouseOverImage();
    }

    @Step
    public void shareImages() {
        productEssentialPage.shareOnSocialMedia();
    }
    @Step
    public  void descriptionPanel(){
        productEssentialPage.descriptionPanel();
    }

    public void openProductsPage() {
        productEssentialPage.open();
    }
}

