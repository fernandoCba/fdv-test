package com.fernandorodriguez.PageObjects;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebDriver;

@DefaultUrl("http://www.google.com")
public class GooglePageObject extends PageObject {

    @FindBy(name = "q")
    WebElementFacade search;

    public GooglePageObject(WebDriver driver) {
        super(driver);
    }

    public void search(String searchCriteria) {
        search.typeAndEnter(searchCriteria);
        waitForPresenceOf("#search div[data-async-context]");
    }

    public void clickOnSearchIteam(String suburl) {
        $("//a[contains(@href, '" + suburl + "')]").click();

    }
}
