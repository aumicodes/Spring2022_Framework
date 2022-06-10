package Hotels;

import Class1.MyDriver;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import org.openqa.selenium.By;

public class TC17SD {

    LandingPage lpage = new LandingPage();

    @Given("I am on hotels landing page")
    public void OpenHotels() {
        MyDriver.launchUrlOnNewWindow("https://www.hotels.com/");
    }

    @And("I click on Check-in Calendar")
    public void clickCheckInBox() {
        lpage.clickIt(By.id("d1-btn"));
    }
}

//The next steps I would take are:
    /*Verify past grayed out dates' elements are disabled. if yes, asserttrue
    Do the same for back button on the current month
    Click checkOutBox using locator for checkOutCalendar
    Verify past grayed out dates' elements are disabled, if yes, assertrue
    Do the same for back button on the current month.
     */
