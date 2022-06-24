package Pages;

import Helper.Misc;
import Pages.Hotels.MyDriver;
import org.openqa.selenium.By;

public class PracticeTests {

    @org.testng.annotations.Test

    public void OpenHotels() {
        MyDriver.launchUrlOnNewWindow("https://www.hotels.com/");
        MyDriver.getDriver().findElement(By.xpath("//nav//button[text()='Sign in']")).click();
        MyDriver.getDriver().findElement(By.xpath("//div[@class='header-guest-heading']/following-sibling::div//a/div[text()='Feedback']")).click();
    }

    @org.testng.annotations.Test
    public void OpenNewWindow() {
        MyDriver.launchUrlOnNewWindow("https://www.hotels.com/");
        Misc.pause(2);
        MyDriver.quitWindows();
    }
}