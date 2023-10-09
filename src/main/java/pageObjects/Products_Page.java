package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static pageObjects.BasePage.getDriver;

public class Products_Page {
    private final By allProductsLinkLocator = By.xpath("//a[contains(@class, 'all-product-link')]");
    private final By accessoriesCheckboxLocator = By.xpath("//input[@data-search-url='http://teststore.automationtesting.co.uk/2-home?q=Categories-Accessories']");
    private final By polyesterCheckboxLocator = By.xpath("//input[@data-search-url='http://teststore.automationtesting.co.uk/2-home?q=Categories-Accessories/Composition-Polyester']");
    private final By studioDesignCheckboxLocator = By.xpath("//input[@data-search-url='http://teststore.automationtesting.co.uk/2-home?q=Categories-Accessories/Brand-Studio+Design']");
    private final By artCheckboxLocator = By.xpath("//input[@data-search-url='http://teststore.automationtesting.co.uk/2-home?q=Categories-Art']");
    private final By graphicCornerCheckboxLocator = By.xpath("//input[@data-search-url='http://teststore.automationtesting.co.uk/2-home?q=Categories-Art/Brand-Graphic+Corner']");
    private final By allProductsAmountLocator = By.xpath("//div[@id='js-product-list-top']//p");
    public WebElement getAllProductsLink() {
        return getDriver().findElement(allProductsLinkLocator);
    }
    public WebElement getAccessoriesCheckbox() {
        return getDriver().findElement(accessoriesCheckboxLocator);
    }
    public WebElement getPolyesterCheckbox() {
        return getDriver().findElement(polyesterCheckboxLocator);
    }
    public WebElement getStudioDesignCheckbox() {
        return getDriver().findElement(studioDesignCheckboxLocator);
    }
    public WebElement getArtCheckbox() {
        return getDriver().findElement(artCheckboxLocator);
    }
    public WebElement getGraphicCornerCheckbox() {
        return getDriver().findElement(graphicCornerCheckboxLocator);
    }
    public WebElement getAllProductsAmount() {
        return getDriver().findElement(allProductsAmountLocator);
    }
}
