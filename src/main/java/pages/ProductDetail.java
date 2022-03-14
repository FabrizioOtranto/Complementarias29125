package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductDetail extends BasePage{

    @FindBy(xpath = "//div[@class='inventory_details_name large_size']")
    WebElement title;

    @FindBy(xpath = "//div[@class='inventory_details_price']")
    WebElement price;

    @FindBy(id = "add-to-cart-sauce-labs-backpack")
    WebElement addToCarButton;



    public ProductDetail(){
        this.driver = getDriver();
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


