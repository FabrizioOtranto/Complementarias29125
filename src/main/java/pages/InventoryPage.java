package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InventoryPage extends  BasePage {
    @FindBy(xpath = "//div[contains(text(),'Sauce Labs Backpack')]")
    WebElement sauceLabsLink;


    public InventoryPage(){
        this.driver = getDriver();
        PageFactory.initElements(driver, this);
    }
    public void ClickSauceLabsBackPack(){
        ClickOnWebElement(sauceLabsLink);
    }
}
