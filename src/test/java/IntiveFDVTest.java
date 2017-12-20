import com.fernandorodriguez.Steps.GoogleSteps;
import com.fernandorodriguez.Steps.SeleniumHQSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class IntiveFDVTest {
    @Steps
    GoogleSteps googleSteps;

    @Steps
    SeleniumHQSteps seleniumhqSteps;

    @Managed(driver="chrome")
    WebDriver driver;

    @Test
    public void navigateToSeleniumhqViaGoogle() {
        // GIVEN
        googleSteps.googlePageIsOpen();
        // When
        googleSteps.searchFor("seleniumhq");
        //And
        googleSteps.clickOnTheLinkWithSubURL("www.seleniumhq.org");
        // Then
        seleniumhqSteps.seleniumHQHomePageIsDisplayed();

    }
}
