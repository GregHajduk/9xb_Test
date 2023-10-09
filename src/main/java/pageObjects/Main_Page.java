package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static pageObjects.BasePage.getDriver;

public class Main_Page {
    private final By emailFieldLocator = By.xpath("//input[@placeholder='Your email address']");
    private final By subscribeButtonLocator = By.xpath("//input[@name='submitNewsletter']");
    private final By TCcheckboxLocator = By.id("psgdpr_consent_checkbox_17");
    private final By subscriptionSuccessMessageLocator = By.xpath("//p[contains(@class, 'alert')]");

    public WebElement getEmailField() {
        return getDriver().findElement(emailFieldLocator);
    }
    public WebElement getSubscribeButton() {
        return getDriver().findElement(subscribeButtonLocator);
    }
    public WebElement getTCcheckbox() {
        return getDriver().findElement(TCcheckboxLocator);
    }
    public WebElement getSubscriptionSuccessMessage() {
        return getDriver().findElement(subscriptionSuccessMessageLocator);
    }
}
