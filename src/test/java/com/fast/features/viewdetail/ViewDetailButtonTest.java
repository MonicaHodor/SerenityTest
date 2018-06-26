package com.fast.features.viewdetail;

import com.fast.steps.serenity.ProductEssentialSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class ViewDetailButtonTest {

    @Managed(uniqueSession = true)
    public WebDriver webdriver;

    @Steps
    ProductEssentialSteps productEssentialSteps;

    @Test
    public void click_on_view_detail_button() {
        productEssentialSteps.openProductsPage();
        productEssentialSteps.clickOnViewDetail();
        productEssentialSteps.clickOnSwatchLabel();

    }


    @Test
    public void clickLinkForSelectedColor() {
        productEssentialSteps.openProductsPage();
        productEssentialSteps.clickLinkForSelectedProduct("NOLITA CAMI");
        productEssentialSteps.clickOnColorLabel();
    }


    @Test
    public void clickOnDetailedImages() {
        productEssentialSteps.openProductsPage();
        productEssentialSteps.clickOnViewDetail();
        productEssentialSteps.clickOnDetailedImages();
    }

    @Test
    public void mouseOverImage() {
        productEssentialSteps.openProductsPage();
        productEssentialSteps.clickOnViewDetail();
        productEssentialSteps.mouseOverImage();
    }

    @Test
    public void clickOnshareImages() {
        productEssentialSteps.openProductsPage();
        productEssentialSteps.clickOnViewDetail();
        productEssentialSteps.shareImages();
    }

    @Test
    public void clickOndescriptionPanel() {
        productEssentialSteps.openProductsPage();
        productEssentialSteps.clickOnViewDetail();
        productEssentialSteps.descriptionPanel();
    }

}



