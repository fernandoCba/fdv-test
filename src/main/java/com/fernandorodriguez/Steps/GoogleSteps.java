package com.fernandorodriguez.Steps;

import com.fernandorodriguez.PageObjects.GooglePageObject;
import net.thucydides.core.annotations.Step;

public class GoogleSteps {
    GooglePageObject google;

    @Step
    public void googlePageIsOpen() {
        google.open();
    }

    @Step
    public void searchFor(String searchCriteria) {
        google.search(searchCriteria);
    }


    @Step
    public void clickOnTheLinkWithSubURL(String suburl) {
        google.clickOnSearchIteam(suburl);
    }
}
