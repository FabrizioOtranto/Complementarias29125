import Pages.HomePage;
import Pages.ProductsPage;
import Utility.DriverFactory;
import Utility.PropertiesFile;
import org.openqa.selenium.WebDriver;

public class Test {
    private String url = PropertiesFile.getProperty("url");
    private WebDriver driver = DriverFactory.getDriver();


    @org.junit.Test
    public void categoriesLaptops() {
        driver.manage().window().maximize();
        driver.navigate().to(url);

        HomePage homePage;
        homePage = new HomePage(driver);
        homePage.ClickLaptop();

        ProductsPage productsPage = new ProductsPage(driver);
        productsPage.ClickProductInPriceRange(1000,2000);
    }
}