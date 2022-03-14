package pages.opcion1;

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

    public ProductDetailPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public String getTitle(){
        return title.getText();
    }

    public String getPrice(){
        return price.getText();
    }

    public void ClickAddToCarButton(){
        addToCarButton.click();
    }



}


