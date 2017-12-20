package com.fernandorodriguez.Steps;

import com.fernandorodriguez.PageObjects.SeleniumhqHomePage;
import net.thucydides.core.annotations.Step;

import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getPages;

public class SeleniumHQSteps {

    SeleniumhqHomePage seleniumhq;

    @Step
    public void seleniumHQHomePageIsDisplayed() {
        getPages().currentPageAt(SeleniumhqHomePage.class);
        seleniumhq.seleniumHqHomepageIsDisplayed();
    }
}
