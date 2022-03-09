import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import pages.LoginPage;
import pages.ProductDetail;
import utility.DriverFactory;
import pages.InventoryPage;
import utility.PropertiesFile;

public class SauceDemoTest {
    String url = PropertiesFile.getProperty("url");

    @Test
    public void LoginTestValidCredentials(){
        WebDriver driver = DriverFactory.getDriver();
        LoginPage loginPage = new LoginPage(driver);
        InventoryPage inventoryPage = new InventoryPage(driver);
        ProductDetail productDetail = new ProductDetail(driver);
        driver.get(url);

        loginPage.Login("standard_user","secret_sauce");

        inventoryPage.ClickSauceLabsBackPack();

        Assert.assertEquals("", productDetail.getTitle());
    }
}
