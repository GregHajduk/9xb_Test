package stepsDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pageObjects.Sign_In_Page;

import static pageObjects.BasePage.*;

public class Sign_In_Steps {
    Sign_In_Page page = new Sign_In_Page();

    @Given("the user accesses the myStore main page")
    public void theUserAccessesTheMyStoreMainPage() {
        navigateToURL(baseUrl);
    }

    @When("the user clicks on main menu sign in button")
    public void theUserClicksOnMainMenuSignInButton() {
        page.getMenuSignInButton().click();
    }

    @When("enters email {}")
    public void entersEmail(String email) {
        sendKeys(page.getEmailField(), email);
    }

    @And("enters password {}")
    public void entersPassword(String password) {
        sendKeys(page.getPasswordField(), password);
    }

    @And("clicks on the sign in button")
    public void clicksOnTheSignInButton() {
        page.getSignInButton().click();
    }

    @Then("user should be presented with page with a title {string}")
    public void userShouldBePresentedWithPageWithATitle(String pageTitle) {
        String CurrentPageTitle = page.getMainPageTitle().getText().trim();
        Assert.assertEquals(CurrentPageTitle, pageTitle);
    }

    @Then("user should be presented with the unsuccessful login message {string}")
    public void userShouldBePresentedWithTheUnsuccessfulLoginMessage(String validationMessage) {
        String currentAuthenticationErrorMessage = page.getAuthenticationErrorMessage().getText();
        Assert.assertEquals(currentAuthenticationErrorMessage, validationMessage);
    }

    @And("clicks on the sign out button")
    public void clicksOnTheSignOutButton() {
        page.getMenuSignOutButton().click();
    }

}
