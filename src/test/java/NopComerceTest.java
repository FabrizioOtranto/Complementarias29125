import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import utility.DriverFactory;
import utility.PropertiesFile;

import java.time.Duration;

public class NopComerceTest {
    String url = PropertiesFile.getProperty("urlEntrega");

    @org.junit.Test
    public void LoginTestValidCredentials(){
        WebDriver driver = DriverFactory.getDriver();
        driver.get(url);

    }
}
