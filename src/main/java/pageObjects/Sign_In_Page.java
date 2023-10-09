package pageObjects;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static pageObjects.BasePage.getDriver;

public class Sign_In_Page {

    private final By emailLocator = By.xpath("//form[@id='login-form']//input[@type='email']");
    private final By passwordLocator = By.xpath("//form[@id='login-form']//input[@type='password']");
    private final By signInButtonLocator = By.id("submit-login");
    private final By menuSignInButtonLocator = By.xpath("//a[@title='Log in to your customer account']");
    private final By menuSignOutButtonLocator = By.xpath("//div[@id='_desktop_user_info']//a");
    private final By mainPageTitleLocator = By.xpath("//section[@id='main']//h1");
    private final By authenticationErrorMessageLocator = By.xpath("//section[@class='login-form']//li");

    public WebElement getEmailField() {
        return getDriver().findElement(emailLocator);
    }
    public WebElement getPasswordField() {
        return getDriver().findElement(passwordLocator);
    }
    public WebElement getSignInButton() {
        return getDriver().findElement(signInButtonLocator);
    }
    public WebElement getMenuSignInButton() {
        return getDriver().findElement(menuSignInButtonLocator);
    }
    public WebElement getMenuSignOutButton() {
        return getDriver().findElement(menuSignOutButtonLocator);
    }
    public WebElement getMainPageTitle() {
        return getDriver().findElement(mainPageTitleLocator);
    }
    public WebElement getAuthenticationErrorMessage() {
        return getDriver().findElement(authenticationErrorMessageLocator);
    }
}
