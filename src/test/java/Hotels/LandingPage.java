package Hotels;

import Class1.MyDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class LandingPage extends Commands {

    //
    By checkInDateBoxLocator = By.id("d1-btn");
    By checkInDisabledDatesLocator = By.xpath("//table[@class='uitk-date-picker-weeks']//button[@disabled]");


    By june2022DatesLocator = By.xpath("//h2[text()='June 2022']/following-sibling::table//button[@data-day]");
    /*

        monthYear = August 2022
        "//h2[text()='" + monthYear + "']/following-sibling::table//button[@data-day]"
        monthDates_1 + monthYear + monthDates_2
     */
    String monthDates_1 = "//h2[text()='";
    String monthDates_2 = "']/following-sibling::table//button[@data-day]";

    By calendarHeading = By.xpath("(//div[@data-stid='date-picker-month'])[1]//h2");
    By nextMonthArrow = By.xpath("(//button[@data-stid='date-picker-paging'])[2]");


    By destinationInputBoxLocator = By.xpath("//button[@aria-label='Going to']");
    By destinationInputLocator = By.id("location-field-destination");
    By destinationSuggestions = By.xpath("//div[@class='uitk-typeahead-results']//div[contains(@class,'truncat') and not(contains(@class,'uitk'))]");


    public void clickCheckInBox() {
        clickIt(checkInDateBoxLocator);
    }

    public List<WebElement> getAllDisabledDates() {
        return findWebElements(checkInDisabledDatesLocator);
    }

    public void selectDateInJune2022(String dateToSelect) {
        selectDateInCalendar(june2022DatesLocator, dateToSelect);
    }

    public void enterDestination(String destination) {
        clickIt(destinationInputBoxLocator);
        type(destinationInputLocator, destination);
    }

    public void selectFromDestinationSuggestion(String userChoice) {
        selectFromSuggestions(destinationSuggestions, userChoice);
    }

    public void goToMonth(String monthYear) {
        for (int i = 0; i < 12; i++) {
            if (getTextOfWebElement(calendarHeading).equalsIgnoreCase(monthYear)) {
                break;
            }
            clickIt(nextMonthArrow);
        }
    }

    public void selectDateFromAnyMonth(String monthYear, String dateValue) {
        goToMonth(monthYear);
        By allDatesLocator = By.xpath(monthDates_1 + monthYear + monthDates_2);
        selectDateInCalendar(allDatesLocator, dateValue);
    }


    public void selectDateFromAnyMonth(String dateMonthYear) {
        String[] dateValues = dateMonthYear.split(" ");
        goToMonth(dateValues[1] + " " + dateValues[2]);
        By allDatesLocator = By.xpath(monthDates_1 + dateValues[1] + " " + dateValues[2] + monthDates_2);
        selectDateInCalendar(allDatesLocator, dateValues[0]);
    }

    public void autoSuggestion() {
        // #1
        MyDriver.launchUrlOnNewWindow("https://www.hotels.com/");

        MyDriver.getDriver().findElement(By.xpath("//button[@aria-label='Going to']")).click();
        MyDriver.getDriver().findElement(By.id("location-field-destination")).sendKeys("new");

        Helper.Misc.pause(2);

        List<WebElement> allSuggestions = MyDriver.getDriver().findElements(By.xpath("//div[@class='uitk-typeahead-results']//div[contains(@class,'truncat') and not(contains(@class,'uitk'))]"));

        for (WebElement suggestion : allSuggestions) {
            if (suggestion.getText().equalsIgnoreCase("NEWPORT")) {
                suggestion.click();
                break;
            }
        }
    }

public void ClickTravelersBox(){
        clickIt(travelersBox);
}
public String getTextOfTravelerBox(){
       return getTextOfWebElement(travelersBox);

    public void clickAddAdults () {
        clickIt(increaseAdults);

   public void clickAddChildren () {
        clickIt(increaseChildren);

    By travelersBox =  By.xpath("//button[@data-testid='travelers-field-trigger' and @type='button']");
    By increaseAdults = By.xpath("(//span[@class='uitk-step-input-button'])[2]");
    By increaseChildren = By.xpath("(//span[@class='uitk-step-input-button'])[4]");

    By primarySignInButton = By.xpath("//nav//button[text()='Sign in']");
    By secondarySignInButton = By.xpath("//div[@class='actions']//a[@data-stid='link-header-account-signin']");
    By signUpButton = By.xpath("//div[@class='actions']//a[@data-stid='link-header-account-signup']");
    By inputEmail = By.xpath("//*[@id='loginFormEmailInput']");
    By inputPassword = By.xpath("//*[@id='loginFormPasswordInput']");
    By finalSignInButton = By.xpath("//*[@id='loginFormSubmitButton']");
    By signInErrorMessage = By.xpath("//*[@id='loginFormErrorBanner']");

    By privacyPageLink = By.xpath("//a[text()='Privacy Statement']");
    By privacyPageHeading = By.xpath("//h2[text()='Privacy Statement']");
    By termsConditionsPageLink = By.xpath("//a[text()='Terms and Conditions']");
    By termsConditionsHeading = By.xpath("//h1[text()='Terms and Conditions']");
    By verificationMessage = By.xpath("//h3[text()='Email and password don't match. Try again.'']");

}