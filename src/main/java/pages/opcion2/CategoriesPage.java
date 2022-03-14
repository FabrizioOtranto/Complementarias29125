package pages.opcion2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CategoriesPage {

    @FindBy(xpath = "//li[@class='inactive']/a[contains(text(),'Notebooks')]")
    WebElement desktopCategory;




    WebDriver driver;

    public CategoriesPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickNotebookCategory(){
        desktopCategory.click();
    }

}
