package Class1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FirstPush {

    @Test
    public void useSeleniumLib(){
    System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://amazon.com/");
    }

}
