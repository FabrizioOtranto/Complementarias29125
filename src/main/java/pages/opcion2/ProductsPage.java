package pages.opcion2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductsPage {

    @FindBy(linkText = "Apple MacBook Pro 13-inch")
    WebElement AppleMacBookPro123InchProduct;

    WebDriver driver;

    public ProductsPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickAppleMacBookPro13Inch(){
        AppleMacBookPro123InchProduct.click();
    }

}

