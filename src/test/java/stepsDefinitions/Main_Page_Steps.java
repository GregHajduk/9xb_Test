package stepsDefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pageObjects.Main_Page;

import static pageObjects.BasePage.generateRandomString;
import static pageObjects.BasePage.sendKeys;

public class Main_Page_Steps {
    Main_Page mainPage = new Main_Page();
    private String uniqueEmail;

    @When("the user enters his email for the fist time into the subscribe filed")
    public void theUserEntersHisEmailForTheFirstTimeIntoTheSubscribeFiled() throws InterruptedException {
        uniqueEmail = generateRandomString(10) + "@gmail.com";
        sendKeys(mainPage.getEmailField(), uniqueEmail);
    }

    @When("the user enters already registered email into the subscribe filed")
    public void theUserEntersAlreadyRegisteredEmailIntoTheSubscribeFiled() throws InterruptedException {
        sendKeys(mainPage.getEmailField(), uniqueEmail);
    }

    @And("click on the subscribe button")
    public void clickOnTheSubscribeButton() {
        mainPage.getSubscribeButton().click();
    }

    @Then("the subscribe button should be disabled")
    public void theSubscribeButtonShouldBeDisabled() {
        Assert.assertFalse(mainPage.getSubscribeButton().isEnabled());
    }

    @And("accepts the T&C by checking the checkbox")
    public void acceptsTheTCByCheckingTheCheckbox() {
        mainPage.getTCcheckbox().click();
    }

    @Then("the user should be presented with a message {string}")
    public void theUserShouldBePresentedWithAMessage(String subscriptionMessage) {
        String currentSuccessfulSubscriptionMessage = mainPage.getSubscriptionSuccessMessage().getText();
        Assert.assertEquals(currentSuccessfulSubscriptionMessage, subscriptionMessage);
    }
}
