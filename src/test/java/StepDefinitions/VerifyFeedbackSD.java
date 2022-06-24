package StepDefinitions;

import Pages.Commands;
import Pages.Hotels.LandingPage;
import Pages.Hotels.MyDriver;
import Pages.Hotels.VerifyErrorMsg;
import Pages.Hotels.VerifyFeedback;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

import static Pages.Hotels.VerifyErrorMsg.pause;

public class VerifyFeedbackSD{

    LandingPage lPage = new LandingPage();
    VerifyFeedback fpage = new VerifyFeedback();

    @And("I click on feedback link")
    public void clickFeedbackLink() {
        lPage.clickSignIn();
        pause(2);
        lPage.clickFeedbackPage();
        pause(5);
    }

    @And("I click on one star")
    public void clickOneStar(){
        fpage.clickStar(1);
        pause(2);
    }

    @And("I enter something in comments field")
    public void enterTextInCommentsField (String userInput){
        fpage.enterTextInComments("I love to travel");
        pause(2);
    }

    @And("^I select (.+) as answer in dropdown question$")
    public void chooseDropdownAnswer(String response) {
        fpage.selectDropdownQuestion(response);
        pause(2);
    }

    @And("^I select (.+) as answer in prior booking question$")
    public void selectPriorBookingAnswerBtn(String response) {
        fpage.selectPriorBookingAnswer(response);
        pause(2);
    }

    @And("^I select (.+) as answer in accomplishment question$")
    public void selectDidYouAccomplishBtn(String response) {
        fpage.selectWereYouSuccessfulAnswer(response);
        pause(2);
    }

    @And("^I enter (.+) in email input field$")
    public void enterEmail(String userEmail) {
        fpage.enterUserEmail(userEmail);
        pause(2);
    }
    @And("I click on feedback submit button")
    public void clickSubmit() {
        fpage.clickFormSubmitBtn();
        pause(2);
    }

    @Then("I verify form is submitted")
    public void verifyFormSubmissionMessage() {
        Assert.assertTrue(fpage.isConfirmationMessageDisplayed());
        pause(2);
    }

}
