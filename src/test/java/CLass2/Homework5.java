package Class2;

import Class1.MyDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Set;

public class Homework5 {

    /**
     * darksky.net
     * Verify the current date is highlighted in Time Machine's calendar
     */

    @Test
    public void verifyCurrentDateIsHighlighted() {
        MyDriver.launchUrlOnNewWindow("https://www.darksky.net/");
        Helper.Misc.pause(2);
        JavascriptExecutor js = (JavascriptExecutor) MyDriver.getDriver();
        js.executeScript("scrollBy(0,600");
        Helper.Misc.pause(2);
        MyDriver.getDriver().findElement(By.xpath("//a[text()='Time Machine' or text()='TIME MACHINE']")).click();

        Date today = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("MMMM:dd:yyyy");
        String TodaysDate = sdf.format(today);

        By CurrentDateLocator = By.xpath("//div[@class='date']");
        String CurrentDate = String.valueOf(MyDriver.getDriver().findElement(CurrentDateLocator));
        Assert.assertEquals(CurrentDate, TodaysDate, "Test Failed - Incorrect Date is displayed");
        MyDriver.quitWindows();
    }

    /**
     * darksky.net
     * Verify same values are displayed in the Today's data
     */
    @Test
    public void verifySameValuesDisplayed() {
        MyDriver.launchUrlOnNewWindow("https://www.darksky.net/");
        LandingPage lpage = new LandingPage();
        lpage.clickTodayToggle();
        Helper.Misc.pause(2);
        // Compare displayed temp vs expanded details temp
        Assert.assertEquals(lpage.getTodayTemp(), lpage.getTodayExtraTemp(), "Test Failed - Displayed temp and expanded details don't match");
        MyDriver.quitWindows();
    }

    /**
     * facebook.com/
     * Launch facebook.com
     * Click on Facebook Pay, Oculus, Instagram, Portal and Bulletin
     * Close ALL windows except Instagram
     * Verify number of window-Handles is 1
     * Verify Page Title is Instagram
     * Verify Log in button on Instagram is disabled by default
     */

    @Test
    public void verifyFacebookFunctions() {
        MyDriver.launchUrlOnNewWindow("https://www.facebook.com/");

        MyDriver.getDriver().findElement(By.linkText("Facebook Pay")).click();
        MyDriver.getDriver().findElement(By.linkText("Oculus")).click();
        MyDriver.getDriver().findElement(By.linkText("Instagram")).click();
        MyDriver.getDriver().findElement(By.linkText("Portal")).click();
        MyDriver.getDriver().findElement(By.linkText("Bulletin")).click();

        Set<String> allHandles = MyDriver.getDriver().getWindowHandles();

        for (String handle : allHandles) {
            MyDriver.getDriver().switchTo().window(handle);
            String title = MyDriver.getDriver().getTitle();
            if (!title.equalsIgnoreCase("Instagram")) {
                MyDriver.getDriver().close();

            }

        }
        Helper.Misc.pause(2);
        Set<String> allHandlesNew = MyDriver.getDriver().getWindowHandles();
        int numberOfWindows = allHandlesNew.size();
        Assert.assertEquals(numberOfWindows, 1, "Error: not all windows have been closed");
        Helper.Misc.pause(2);
        WebElement igLoginButton = MyDriver.getDriver().findElement(By.xpath("//button/div[text()  = 'Log In']"));
        boolean isLogInEnabledIG = igLoginButton.isEnabled();
        Assert.assertTrue(isLogInEnabledIG, "Log In button is not disabled by default");
    }
}
