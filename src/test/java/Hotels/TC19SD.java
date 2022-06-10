package Hotels;

import Class1.MyDriver;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import org.openqa.selenium.By;

public class TC19SD {

    LandingPage lpage = new LandingPage();

    @Given("I am on hotels landing page")
    public void OpenHotels() {
        MyDriver.launchUrlOnNewWindow("https://www.hotels.com/");
    }

    @And("I Enter 'bora' in destination")
    public void EnterBora() {
        MyDriver.getDriver().findElement(By.xpath("//button[@aria-label='Going to']")).click();
        MyDriver.getDriver().findElement(By.xpath("//button[@aria-label='Going to']")).sendKeys("bora");
        Helper.Misc.pause(2);

        //The next steps I would take are:
        /*From dropdown menu I would click on the specified location.
        Find locator for "check in" box, click on element and find locator for August 1 date and click.
        Find locator for "check out" box, click on element and find locator for August 10 date and click.
        Find locator for "apply" button and click.
        Find locator for "search" button and click.
        Find locator for required text, gettext of element and assert equals both texts.
         */
    }
}