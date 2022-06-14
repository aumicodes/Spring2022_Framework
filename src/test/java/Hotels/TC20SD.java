package Hotels;

import Class1.MyDriver;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.By;
import org.testng.Assert;

public class TC20SD {

    LandingPage lpage = new LandingPage();

    @Given("I am on hotels landing page")
    public void OpenHotels() {
        MyDriver.launchUrlOnNewWindow("https://www.hotels.com/");
    }

    @And("I click Sign-in link")
    public void SignIn() {
        MyDriver.getDriver().findElement(By.xpath("//nav//button[text()='Sign in']")).click();
    }

    @And("I Click Sign up link")
    public void SignUp(){
        MyDriver.getDriver().findElement(By.xpath("//div[@class='actions']//a[@data-stid='link-header-account-signup']")).click();
    }
    @And ("I Click 'Terms and Conditions' link")
    public void ClickTermsAndConditions(){
        MyDriver.getDriver().findElement(By.xpath("//a[text()='Terms and Conditions']")).click();

    }
    @Then("I verify 'Terms and Conditions' page opens in new tab")
    public void VerifyTermsAndConditions(){
        MyDriver.getDriver().findElement(By.xpath("//h1[text()='Terms and Conditions']")).getText();
        String VerifyTermsAndConditionText = MyDriver.getDriver().findElement(By.xpath("//h1[text()='Terms and Conditions']")).getText();
        Assert.assertEquals(VerifyTermsAndConditionText,"Terms and Conditions");
    }
    @And("I Click 'Privacy Statement' link")
    public void ClickPrivacyStatement() {
        MyDriver.getDriver().findElement(By.xpath("//a[text()='Privacy Statement']")).click();
    }
    @Then("I verify 'Privacy Statement' page opens in new tab")
    public void VerifyPrivacyStatement(){
        MyDriver.getDriver().findElement(By.xpath("//a[text()='Privacy Statement']")).getText();
        String VerifyPrivacyStatementText = MyDriver.getDriver().findElement(By.xpath("//h1[text()='Terms and Conditions']")).getText();
        Assert.assertEquals(VerifyPrivacyStatementText,"Privacy Statement");

    }
}
