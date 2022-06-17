package StepDefinitions;

import Helper.Misc;
import Pages.Hotels.MyDriver;
import Pages.Hotels.LandingPage;
import Pages.Hotels.VerifyErrorMsg;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

import static Helper.Misc.pause;

public class VerifyErrorMsgSD {

    VerifyErrorMsg lpage = new VerifyErrorMsg();

    @Given("I launch Hotels website")
    public void launchHotels() {
        MyDriver.launchUrlOnNewWindow("https://www.hotels.com");
    }

    @When("I click Sign in link")
    public void clickSignInLink() {
        lpage.clickSignIn();
        pause(2);
    }

    @And("I click Sign up link")
    public void clickSignUpLink() {
        lpage.clickSignUp();
        pause(2);
    }

    @And("I enter my email address")
    public void enterEmailAddress() {
        lpage.enterEmailAddress("skjubvsj@gmsdvlk");
        pause(2);
    }

    @And("I enter my first name")
    public void enterFirstName() {
        lpage.enterFirstName("!!#$@");
        pause(2);
    }

    @And("I enter my last name")
    public void enterLastName() {
        lpage.enterLastName("!!!!");
        pause(2);
    }

    @And("I enter invalid password")
    public void typeInvalidPassword () {
        lpage.typePassword("2583utfwisv");
    }

    @Then("I verify email error is displayed")
    public void verifyInvalidEmailError() {
        Assert.assertTrue(lpage.isInvalidEmailErrorDisplayed(), "Test Failed - Error is not displayed");
    }

    @Then("I verify first name error is displayed")
    public void verifyInvalidFirstNameError() {
        Assert.assertTrue(lpage.isInvalidFirstNameErrorDisplayed(), "Test Failed - Error is not displayed");
    }

    @Then("I verify last name error is displayed")
    public void verifyInvalidLastNameError() {
        Assert.assertTrue(lpage.isInvalidLastNameErrorDisplayed(), "Test Failed - Error is not displayed");
    }

    @Then("I verify keep me signed in checkbox is displayed")
    public void verifyKeepMeSignedInBoxDisplayed () {
        Assert.assertTrue(lpage.verifyKeepSignInBoxDisplayed(),"Keep me signed in check box is not displayed");
    }

    @Then("I verify 'keep me signed in' checkbox is enabled")
    public void verifyKeepMeSignedInIsEnabled () {
        Assert.assertTrue(lpage.verifyKeepSignInBoxEnabled(),"Keep me signed in box is not enabled");
    }

    @Then("I verify 'continue' button is displayed")
    public void verifyContinueButtonIsDisplayed () {
        Assert.assertTrue(lpage.verifyContinueButtonDisplayed(), "Continue button is not displayed");
    }

    @Then("I verify 'continue' button is not enabled")
    public void verifycontinueButtonIsNotEnabled () {
        Assert.assertTrue(!lpage.verifyContinueButtonNotEnabled(), "Continue button is enabled");
    }
    }