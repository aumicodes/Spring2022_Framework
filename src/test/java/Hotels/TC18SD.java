package Hotels;

import Class1.MyDriver;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import org.openqa.selenium.By;

public class TC18SD {
    LandingPage lpage = new LandingPage();

    @Given("I am on hotels landing page")
    public void OpenHotels() {
        MyDriver.launchUrlOnNewWindow("https://www.hotels.com/");
    }

    @And("I click Sign-in link")
    public void SignIn() {
        MyDriver.getDriver().findElement(By.xpath("//nav//button[text()='Sign in']")).click();
    }

    @And("I click on Travelers")
    public void clickTravelersBox() {
        lpage.ClickTravelersBox();
    }

    @And("I select 6 adults")
    public void Select6Adults() {
        for (int i = 1; i < 5; i++) {
            lpage.clickAddAdults;
        }

        @And("I select 2 children")
        public void Select2children () {
            for (int i = 1; i < 5; i++) {
                lpage.clickAddChildren;
            }
            @And("I select first child's age is 4")

        //The next steps I would take are:
        /*
        -find locator of "Child 1 age" box,
        -click that particular web element and click 4
        -find locator of "Child 2 age" box
        -click that particular web element and click under 1
        -find locator of "done" button, click
        -locate adult and children ages on the page using
        xpath and store them in int.
        -assert true that total number of both ints == 6.
         */
        }
    }
}