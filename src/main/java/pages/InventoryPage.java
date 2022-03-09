package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InventoryPage {
    @FindBy(xpath = "//div[contains(text(),'Sauce Labs Backpack')]")
    WebElement sauceLabsLink;
    WebDriver driver;

    public InventoryPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void ClickSauceLabsBackPack(){
        sauceLabsLink.click();
    }


}
