package pages.opcion2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductDetailPage {
    @FindBy(xpath = "//div[@class='inventory_details_name large_size']")
    WebElement title;

    @FindBy(xpath = "//div[@class='inventory_details_price']")
    WebElement price;

    @FindBy(id = "add-to-cart-sauce-labs-backpack")
    WebElement addToCarButton;

    WebDriver driver;

    public ProductDetailPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public String clickOnAddToCarAndGetPriceAndTitle() {
        String priceAndTitle = "Price: " + price.getText() + " Title: " + title.getText();
        addToCarButton.click();
        return priceAndTitle;

    }
}
