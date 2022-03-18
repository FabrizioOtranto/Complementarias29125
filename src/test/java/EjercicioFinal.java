import Pages.HomePage;
import Pages.ProductsPage;
import Utility.DriverFactory;
import Utility.PropertiesFile;
import org.openqa.selenium.WebDriver;

public class EjercicioFinal {
    private String url = PropertiesFile.getProperty("url");
    private WebDriver driver = DriverFactory.getDriver();


    @org.junit.Test
    public void categoriesLaptops() throws InterruptedException {
        driver.manage().window().maximize();
        driver.navigate().to(url);

        HomePage homePage;
        homePage = new HomePage(driver);
        Thread.sleep(1000);
        homePage.ClickLaptop();
        ProductsPage productsPage = new ProductsPage(driver);
        productsPage.ClickProductInPriceRange(1000,1200);
    }
}