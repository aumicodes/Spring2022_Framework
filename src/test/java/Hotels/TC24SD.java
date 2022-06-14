package Hotels;

import Class1.MyDriver;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.By;
import org.testng.Assert;

public class TC24SD {

    LandingPage lPage = new LandingPage();

    @Given("I am on hotels landing page")
    public void OpenHotels() {
        MyDriver.launchUrlOnNewWindow("https://www.hotels.com/");
    }

    @And("I Select “Website feedback” from Help dropdown")
    public void WebsiteFeedback() {
        MyDriver.getDriver().findElement(By.xpath("//nav//button[text()='Sign in']")).click();
        MyDriver.getDriver().findElement(By.xpath("//div[@class='header-guest-heading']/following-sibling::div//a/div[text()='Feedback']")).click();
    }
    @And("I Click on Submit button")
    public void ClickSubmit() {
        MyDriver.getDriver().findElement(By.xpath("//*[@id='submit-button']")).click();
    }

    @Then("I verify error message is displayed")
    public void VerifyErrorMessageDisplayed(){
    String VerifyErrorMessage = MyDriver.getDriver().findElement(By.xpath("//*[@id='submit-button']")).getText();
        Assert.assertEquals(VerifyErrorMessage,"Please fill in the required information highlighted below.");
    }

    @Then("I verify star boxes section is in a red dotted box.")
    public boolean VerifyDottedStarBox(){
        return lPage.isElementDisplayed(By.xpath("//*[contains(@style,'2px dotted rgb')]"));
    }
}