package pageObjects;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class BasePage {


    static WebDriver driver = null;

    public static WebDriver getDriver() {
        if (driver == null) {
            System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "/src/main/java/drivers/geckodriver");
            FirefoxOptions firefoxOptions = new FirefoxOptions();
            firefoxOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
            driver = new FirefoxDriver(firefoxOptions);
            driver.manage().window().maximize();
            return driver;
        }
        return driver;
    }

    public static void tearDown() {
        getDriver().quit();
    }

    public static void navigateToURL(String url) {
        driver.get(url);
    }

    public static void sendKeys(WebElement webElement, String textToType) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(webElement));
        element.clear();
        element.sendKeys(textToType);
    }

    public static String generateRandomString(int length) {
        return RandomStringUtils.randomAlphabetic(length);
    }
}
