package com.ebaytest;

import com.base.TestBase;
import com.ebay.HomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class HomePageValidations extends TestBase {
    @Test(enabled = false)
    public void validateUserBeingAbleToTypeOnSearchBar() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.typeOnSearchBar();
    }

    @Test(enabled = false)
    public void validateUserBeingAbleToSearchForAnItem() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.typeOnSearchBar();
        homePage.clickOnSearchButton();
    }

    @Test(enabled = false)
    public void validateUserBeingAbleToClickOnSignInButton() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.clickOnSignInButton();
    }

    @Test(enabled = false)
    public static void validateDropDownButton() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.clickOnDropDown();
    }

    @Test//(enabled = false)
    public static void validateDropDownButtonAndChooseBook() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.clickOnDropDownAndChooseBook();
    }







}
