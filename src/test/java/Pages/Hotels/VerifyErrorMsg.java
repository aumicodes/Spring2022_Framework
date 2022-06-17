package Pages.Hotels;

import Helper.Misc;
import Pages.Commands;
import org.openqa.selenium.By;

public class VerifyErrorMsg extends Commands {


    By hotelSigninLocator = By.xpath("//button[@tabindex='0']");
    By hotelsSignupLocator = By.xpath("//a[@data-stid='link-header-account-signup']");
    By signUpEmailLocator = By.xpath("//input[@id='signupFormEmailInput']");
    By emailErrorLocator = By.xpath("//div[@id='signupFormEmailInput-error']");
    By firstNameLocator = By.xpath("//input[@id='signupFormFirstNameInput']");
    By firstNameErrorLocator = By.xpath("//div[@id='signupFormFirstNameInput-error']");
    By lastNameLocator = By.xpath("//input[@id='signupFormLastNameInput']");
    By lastNameErrorTextLocator = By.xpath("//div[@id='signupFormLastNameInput-error']");
    By passwordLocator = By.xpath("//input[@id='signupFormPasswordInput']");
    By SignInCheckBoxLocator = By.xpath("//input[@id='signUpFormRememberMeCheck']/following-sibling::span");
    By continueButtonLocator = By.xpath("//button[@id='signupFormSubmitButton']");

    public void clickSignIn() {
        clickIt(hotelSigninLocator);
    }
    public void clickSignUp() {
        clickIt(hotelsSignupLocator);
    }

    public void enterEmailAddress(String value) {
        MyDriver.getDriver().findElement(signUpEmailLocator).sendKeys(value);
    }

    public void enterFirstName(String value) {
        MyDriver.getDriver().findElement(firstNameLocator).sendKeys(value);
    }

    public void enterLastName(String value) {
        MyDriver.getDriver().findElement(lastNameLocator).sendKeys(value);
    }

    public boolean isInvalidEmailErrorDisplayed() {
        return isElementDisplayed(emailErrorLocator);
    }

    public boolean isInvalidFirstNameErrorDisplayed() {
        return isElementDisplayed(firstNameErrorLocator);
    }

    public boolean isInvalidLastNameErrorDisplayed() {
        return isElementDisplayed(lastNameErrorTextLocator);
    }

    public void typePassword (String value) {
        MyDriver.getDriver().findElement(passwordLocator).sendKeys(value);
        Misc.pause(2);
    }

        public static void pause ( int seconds){
            try {
                Thread.sleep(seconds * 1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    public boolean verifyKeepSignInBoxDisplayed () {
        scrollToBottom();
        return isElementDisplayed(SignInCheckBoxLocator);
    }
    public boolean verifyKeepSignInBoxEnabled () {
        return isElementEnabled(SignInCheckBoxLocator);
    }
    public boolean verifyContinueButtonDisplayed () {
        scrollToBottom();
        return isElementDisplayed(continueButtonLocator);
    }
    public boolean verifyContinueButtonNotEnabled () {
        return isElementEnabled(continueButtonLocator);
    }

}