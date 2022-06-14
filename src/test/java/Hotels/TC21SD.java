package Hotels;

import Class1.MyDriver;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.By;
import org.testng.Assert;

public class TC21SD {

    LandingPage lpage = new LandingPage();

    @Given("I am on hotels landing page")
    public void OpenHotels() {
        MyDriver.launchUrlOnNewWindow("https://www.hotels.com/");
    }

    @And("I click on Sign-in Link")
    public void SignIn() {
        MyDriver.getDriver().findElement(By.xpath("//nav//button[text()='Sign in']")).click();
        MyDriver.getDriver().findElement(By.xpath("//div[@class='actions']//a[@data-stid='link-header-account-signin']")).click();
    }

    @And("I enter invalid email address")
    public void EnterInvalidEmail() {
        MyDriver.getDriver().findElement(By.xpath("//*[@id='loginFormEmailInput']")).sendKeys("zxcvbnhfvs@gmail.com");
    }

    @And("I enter invalid password")
    public void EnterInvalidPassword() {
        MyDriver.getDriver().findElement(By.xpath("//*[@id='loginFormPasswordInput']")).sendKeys("hmmmm");
    }

    public static void pause(int seconds) {
        try {
            Thread.sleep(seconds*3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    @And("I click on Sign-in button")
    public void ClickSignIn(){
        MyDriver.getDriver().findElement(By.xpath("//*[@id='loginFormSubmitButton']")).click();
    }

    @Then("I verify that the verification message is displayed")
    public void VerificationMessage(){
        MyDriver.getDriver().findElement(By.xpath("//h3[text()='Email and password don't match. Try again.']")).getText();
        String VerifyVerificationMessage = MyDriver.getDriver().findElement(By.xpath("//h1[text()='Terms and Conditions']")).getText();
        Assert.assertEquals(VerifyVerificationMessage,"Email and password don't match. Try again.");
    }

}