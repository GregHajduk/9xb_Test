package stepsDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pageObjects.Products_Page;


public class Products_Page_Steps {
    Products_Page productsPage = new Products_Page();

    @When("clicks on the All Products link")
    public void clicksOnTheAllProductsLink() {
        productsPage.getAllProductsLink().click();
    }

    @And("the user checks the {string} checkbox")
    public void theUserChecksTheProductTypeCheckbox(String ProductType) {
        switch (ProductType.toLowerCase()) {
            case "accessories" -> productsPage.getAccessoriesCheckbox().click();
            case "studiodesign" -> productsPage.getStudioDesignCheckbox().click();
            case "polyester" -> productsPage.getPolyesterCheckbox().click();
            case "art" -> productsPage.getArtCheckbox().click();
            case "graphiccorner" -> productsPage.getGraphicCornerCheckbox().click();
            default -> throw new IllegalArgumentException("Invalid ProductType: " + ProductType);
        }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    @Then("the user should see {string} of products available")
    public void theUserShouldSeeAmountOfProductsAvailable(String amount) {
        Assert.assertEquals(amount, productsPage.getAllProductsAmount().getText().trim());
    }
}
