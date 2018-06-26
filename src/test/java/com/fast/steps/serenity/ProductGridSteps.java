package com.fast.steps.serenity;

import com.fast.pages.ProductGridPage;
import net.thucydides.core.annotations.Step;

public class ProductGridSteps {

    ProductGridPage productGridPage;

    @Step
    public void openHomePage(){
        productGridPage.open();
    }


    @Step
    public  void clickOnSearchPanel(){
        productGridPage.clickOnSearch();
    }

    @Step
    public void enterKeywordA(String keyword){
        productGridPage.enterKeyword(keyword);
    }
    @Step
    public void clickOnPages(){
        productGridPage.clickOnPages();
    }
}
