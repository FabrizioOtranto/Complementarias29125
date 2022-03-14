import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import pages.LoginPage;
import pages.ProductDetail;
import pages.TransportPage;
import utility.DriverFactory;
import pages.InventoryPage;
import utility.PropertiesFile;

public class SauceDemoTest {
    String url = PropertiesFile.getProperty("url");

    @Test
    public void LoginTestValidCredentials(){
        LoginPage loginPage = new LoginPage();
        InventoryPage inventoryPage = new InventoryPage();
        ProductDetail productDetail = new ProductDetail();
        TransportPage transportPage = new TransportPage();

        transportPage.goHomePage();

        loginPage.Login("standard_user","secret_sauce");

        inventoryPage.ClickSauceLabsBackPack();

        Assert.assertEquals("", productDetail.getTitle());
    }
}
