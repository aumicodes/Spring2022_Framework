package Pages.Hotels;

import Pages.Commands;
import org.openqa.selenium.By;

import static Pages.Hotels.MyDriver.driver;

public class VerifyDeals extends Commands {

    By manageBookingLocator = By.xpath("//div[@class='resp-module']//a[@href='https://www.hotels.com/page/app/?intlid=DH_app_pos1_360x190_en-us']");
    By freeCancellationLocator = By.xpath("//div[@class='resp-module']//a[@href='https://www.hotels.com/page/free-cancellation/?intlid=DH_freecancellation_pos2_360x190_en-us']");
    By saveNextTripLocator = By.xpath("//div[@class='resp-module']//a[@href='https://www.hotels.com/hotel-deals/nature?intlid=dh_Nature_pos3_US']");
    By searchBookHeaderLocator = By.xpath("//h1[contains(text(),'Search, book, and save on the go!')]");
    By amazingDealsHeaderLocator = By.xpath("//h1[contains(text(),'Amazing deals with free cancellation')]");
    By saveOnNextTripHeaderLocator = By.xpath("(//h1[contains(text(),'Save on your next trip to the great outdoors')])[1]");

    public void goBack(){
        driver.navigate().back();

    }
    public boolean manageTripIsDisplayed(){
        return isElementDisplayed(manageBookingLocator);
    }
    public boolean manageTripIsEnabled(){
        return isElementEnabled(manageBookingLocator);
    }
    public boolean freeCancellationIsDisplayed(){
        return isElementDisplayed(freeCancellationLocator);
    }
    public boolean freeCancellationIsEnabled(){
        return isElementEnabled(freeCancellationLocator);
    }
    public boolean saveNextTripIsDisplayed(){
        return isElementDisplayed(saveNextTripLocator);
    }
    public boolean saveNextTripIsEnabled(){
        return isElementEnabled(saveNextTripLocator);
    }
    public void clickManageTrip(){
        clickIt(manageBookingLocator);
    }
    public boolean isHeaderDisplayed(){
        return isElementDisplayed(searchBookHeaderLocator);
    }
    public void clickSaveTrip(){
        clickIt(freeCancellationLocator);
    }
    public boolean isSaveTripHeaderDisplayed(){
        return isElementDisplayed(amazingDealsHeaderLocator);
    }

    public void clickSaveOnNextTrip(){
        clickIt(saveNextTripLocator);
    }
    public boolean isSaveOnNextTripHeaderDisplayed(){
        return isElementDisplayed(saveOnNextTripHeaderLocator);
    }
}
