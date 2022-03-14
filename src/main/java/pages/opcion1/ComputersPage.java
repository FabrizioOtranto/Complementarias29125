package pages.opcion1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ComputersPage {

    @FindBy(xpath = "//li[@class='inactive']/a[contains(text(),'Notebooks')]")
    WebElement desktopCategory;

    @FindBy(linkText = "Apple MacBook Pro 13-inch")
    WebElement AppleMacBookPro123InchProduct;


    WebDriver driver;

    public ComputersPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickNotebookCategory(){
        desktopCategory.click();
    }
    public void clickAppleMacBookPro13Inch(){
        AppleMacBookPro123InchProduct.click();
    }
}
