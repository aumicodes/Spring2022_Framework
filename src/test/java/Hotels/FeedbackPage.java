package Hotels;

import org.openqa.selenium.By;

public class FeedbackPage {
    By redDottedBorder = By.xpath("//*[contains(@style,'2px dotted rgb')]");
    By blankFormSubmissionError = By.xpath("//*[@id='required']");
    By feedbackLink = By.xpath("//div[@class='header-guest-heading']/following-sibling::div//a/div[text()='Feedback']");
    By submitBtn = By.xpath("//*[@id='submit-button']");
}
