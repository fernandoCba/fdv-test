package com.fernandorodriguez.PageObjects;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.At;
import net.thucydides.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getPages;

@At("http://www.seleniumhq.org")
public class SeleniumhqHomePage extends PageObject {

    @FindBy(css = "#header h1 a")
    WebElementFacade logo;

    @FindBy(css="body.homepage")
    WebElementFacade homePageIdentifier;

    public SeleniumhqHomePage(WebDriver driver){
        super(driver);
    }


    public void seleniumHqHomepageIsDisplayed() {
        logo.shouldBeVisible();
        homePageIdentifier.shouldBeVisible();
    }
}
