package Pages.Hotels;

import Helper.Misc;
import Pages.Commands;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class VerifyFeedback extends Commands {

    By commentInputFieldLocator = By.xpath("//*[@id='verbatim']");
    By returnQuestionsDropdownLocator = By.xpath("//*[@id='will-you-return']");
    By emailInputLocator = By.xpath("//*[@id='email_address']");
    By priorBookingBtnLocator = By.xpath("//label[contains(@for,'booked-here-before')]");
    By wereYouSuccessfulBtnLocator = By.xpath("//label[contains(@for,'were-you-successful')]");
    By submitBtnLocator = By.xpath("//*[@id='submit-button']");
    By confirmationMessageLocator = By.xpath("//*[@id='thank-you']");

    public void clickFormSubmitBtn() {
        scrollToElementIntoView(submitBtnLocator);
        clickIt(submitBtnLocator);
    }
    public void selectWereYouSuccessfulAnswer(String answer) {
        List<WebElement> buttons = findWebElements(wereYouSuccessfulBtnLocator);
        for (WebElement btn : buttons) {
            if (btn.getAttribute("for").contains(answer.toLowerCase())) {
                btn.click();
                break;
            }
        }
    }

    public void clickStar(int starNumber) {
        clickIt(By.xpath("//input[@id='page-rating-" + starNumber + "']/parent::div"));
    }
    public void enterTextInComments(String inputText) {
        type(commentInputFieldLocator, inputText);
    }

    public void selectDropdownQuestion(String dropdownOption) {
        selectInDropdown(returnQuestionsDropdownLocator, dropdownOption);
    }
    public void selectPriorBookingAnswer(String answer) {
        List<WebElement> buttons = findWebElements(priorBookingBtnLocator);
        for (WebElement btn : buttons) {
            if (btn.getAttribute("for").contains(answer.toLowerCase())) {
                btn.click();
                break;
            }
        }
    }
    public void enterUserEmail(String email) {
        type(emailInputLocator, email);
    }
    public boolean isConfirmationMessageDisplayed() {
        Misc.pause(3);
        return isElementDisplayed(confirmationMessageLocator);
    }
}
