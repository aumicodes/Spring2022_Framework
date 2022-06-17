package StepDefinitions;

import Pages.Hotels.LandingPage;
import Pages.Hotels.MyDriver;
import Pages.Hotels.VerifyDeals;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class VerifyDealsSD {

    VerifyDeals dpage = new VerifyDeals();

    @Given("I launch Hotels/deals page")
    public void launchHotels() {
        MyDriver.launchUrlOnNewWindow("https://www.hotels.com/hotel-deals");
    }

    @Then("I verify 'manage your booking anytime, anywhere' is displayed and enabled")
    public void manageBookingIsDisplayedAndEnabled() {
        Assert.assertTrue(dpage.manageTripIsDisplayed(), "not displayed");
        Assert.assertTrue(dpage.manageTripIsEnabled(), "not enabled");
    }

    @Then("I verify 'stay flexible with free cancellation' is displayed and enabled")
    public void freeCancellationIsDisplayedAndEnabled() {
        Assert.assertTrue(dpage.freeCancellationIsDisplayed(), "not displayed");
        Assert.assertTrue(dpage.freeCancellationIsEnabled(), "not enabled");
    }

    @Then("I verify 'save on your next trip to the great outdoors' is displayed and enabled")
    public void saveNextTripIsDisplayedAndEnabled() {
        Assert.assertTrue(dpage.saveNextTripIsDisplayed(), "not displayed");
        Assert.assertTrue(dpage.saveNextTripIsEnabled(), "not enabled");
    }

    @And("I click on 'manage your booking anytime, anywhere'")
    public void clickManageTrip() {
        dpage.clickManageTrip();
    }

    @Then("I verify 'search, book and save on the go!' is displayed")
    public void isHeaderSearchDisplayed() {
        Assert.assertTrue(dpage.isHeaderDisplayed(), "not displayed");
    dpage.goBack();
    }

    @And("I click on 'stay flexible with free cancellation'")
    public void clickFreeCancellation() {
        dpage.clickSaveTrip();
    }

    @Then("I verify 'amazing deals with free cancellation' OR 'stay flexible with free cancellation' is displayed and enabled")
    public void isHeaderDisplayed() {
        Assert.assertTrue(dpage.isSaveTripHeaderDisplayed(), "not displayed");
    }

    @When("I go back")
    public void goBack2() {
        dpage.goBack();
    }

    @And("I click on 'save on your next trip to the great outdoors'")
    public void clickSaveNextTrip() {
        dpage.clickSaveOnNextTrip();
    }

    @Then("I verify 'save on your next trip to the great outdoors' is displayed")
        public void isSearchHeaderDisplayed () {
            Assert.assertTrue(dpage.isSaveOnNextTripHeaderDisplayed(),"not displayed");
        }
    }