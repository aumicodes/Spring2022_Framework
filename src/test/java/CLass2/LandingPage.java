package Class2;

import Pages.Commands;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LandingPage extends Commands {

    // Locators of Landing Page elements
    By timeMachineLocator = By.xpath("//a[text()='Time Machine' or text()='TIME MACHINE']");


    // Method to interact with Landing Page elements
    // method to scroll and find if Time Machine button is enabled



    // method to scroll to Time Machine button
    public WebElement scrollToTimeMachineButton() {
        return scrollToElement(timeMachineLocator);
    }

    // method to check if Time Machine button is enabled
    public boolean isTimeMachineButtonEnabled() {
        return scrollToTimeMachineButton().isEnabled();
    }

    public void clickTimeMachineBtn2() {
    }

    public byte[] timeMachineDate() {
        return new byte[0];
    }

    public byte[] localDate() {
        return new byte[0];
    }

    public void clickTodayToggle() {
    }

    public byte[] getTodayTemp() {
        return new byte[0];
    }

    public byte[] getTodayExtraTemp() {
        return new byte[0];
    }


    // method to check if Time Machine button is displayed


    // method to click Time Machine button




}
