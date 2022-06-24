package StepDefinitions;

import Helper.Misc;
import Pages.Hotels.FilterBySortBy;
import Pages.Hotels.LandingPage;
import Pages.Hotels.MyDriver;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class FilterBySortBySD extends FilterBySortBy {

    LandingPage lpage = new LandingPage();
    FilterBySortBy fs = new FilterBySortBy();

    @When("^Enter (.+) in destination box$")
    public void enterDestination(String destination) {
        lpage.enterDestination("Man");
        Misc.pause(4);
    }

    @When("^I select (.+) NY from auto suggestion$")
    public void destination(String value) {
        lpage.selectFromDestinationSuggestion(value);
        Misc.pause(2);
    }

    @When("^I select 10-15 August 2022 in Dates Box$")
    public void selectDatesBox() {
        lpage.clickCheckInBox();
        lpage.selectDateFromAnyMonth("10 August 2022");
        lpage.selectDateFromAnyMonth("15 August 2022");
        fs.clickDoneButton();
    }
        @When("^I click on (.+) star from star-rating filter$")
        public void clickStarRating(int input) {
            fs.clickStar(1);
        }

        @When("^I select (.+) from sort-by dropdown$")
        public void selectSortByOption(String input) {
            fs.selectPrice(input);
        }

        @Then("I verify all hotels in search results are *-rated as selected in above step")
        public void verifyStarFilterDescription() {
            Assert.assertTrue(fs.verifyAppliedStarFilter(),"Test Failed");
        }

        @Then("I verify all hotels are listed in increasing order price")
        public void verifyPriceFilterValues() {
            Assert.assertTrue(fs.verifyAppliedPriceFilter(),"Test Failed");
            MyDriver.quitWindows();
        }



    }
