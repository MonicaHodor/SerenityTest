package com.fast.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.Keys;


@DefaultUrl("https://fasttrackit.org/selenium-test")
public class SearchPage extends PageObject {




    @FindBy(id = "search")
    private WebElementFacade searchField;

    public void search(String keyword){
        searchField.typeAndEnter(keyword);


    }



    }







