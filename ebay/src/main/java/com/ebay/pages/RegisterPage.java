package com.ebay.pages;

import com.base.TestBase;
import com.report.ExtentTestManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class RegisterPage {

    @FindBy(xpath = "(//div[text()='Create an account'])[2]")
    private WebElement createAccontHeading;

    @FindBy(id = "firstname")
    private WebElement firstName;

    @FindBy(id = "lastname")
    private WebElement lastName;

    @FindBy(id = "Email")
    private WebElement email;


    public void validateCreateAccountDisplayed() {
        Assert.assertTrue(createAccontHeading.isDisplayed());

        ExtentTestManager.log("Create Account is being displayed");
        //boolean flag = createAccontHeading.isDisplayed();
        //Assert.assertTrue(flag);

        //Assert.assertEquals(createAccontHeading.isDisplayed(),true);
    }

    public void validateURL() {
        String actualURL = TestBase.driver.getCurrentUrl();
        String expectedURL = "https://signup.ebay.com/";

        Assert.assertTrue(actualURL.contains(expectedURL));
        ExtentTestManager.log("URL has been validated : " + actualURL);

    }

    public void validateFields() {
        Assert.assertTrue(firstName.isDisplayed());
        ExtentTestManager.log("first name is displayed");

        Assert.assertTrue(lastName.isDisplayed());
        ExtentTestManager.log("last name is displayed");

        Assert.assertTrue(email.isDisplayed());
        ExtentTestManager.log("email is displayed");
    }


    public void validateFieldsUsingSoftAssert() {

        SoftAssert softAssert = new SoftAssert();

        softAssert.assertTrue(firstName.isDisplayed());
        ExtentTestManager.log("first name is displayed");


        String actualData = lastName.getAttribute("label");
        String expectedData = "Last Name";
        softAssert.assertEquals(actualData, expectedData);
        ExtentTestManager.log("last name is displayed");

        softAssert.assertTrue(email.isDisplayed());
        ExtentTestManager.log("email is displayed");

        softAssert.assertAll();
    }
}
