package Class1.Helper;

import Class1.MyDriver;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import org.openqa.selenium.By;
import org.testng.Assert;

public class Test {


    @org.testng.annotations.Test


    public void OpenHotels() {
        MyDriver.launchUrlOnNewWindow("https://www.hotels.com/");
        MyDriver.getDriver().findElement(By.xpath("//nav//button[text()='Sign in']")).click();
        MyDriver.getDriver().findElement(By.xpath("//div[@class='header-guest-heading']/following-sibling::div//a/div[text()='Feedback']")).click();
        MyDriver.getDriver().findElement(By.xpath("//*[@id='submit-button']")).click();
        MyDriver.getDriver().findElement(By.xpath("//*[@id='required']")).getText();

    }
}
