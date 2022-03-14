import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import utility.DriverFactory;
import utility.PropertiesFile;

import java.time.Duration;

public class EntregaIntermedia {
    String url = PropertiesFile.getProperty("urlEntrega");

    @Test
    public void LoginTestValidCredentials(){
        WebDriver driver = DriverFactory.getDriver();
        driver.get(url);

        FluentWait wait = new FluentWait(driver);
        wait.withTimeout(Duration.ofSeconds(45));
        wait.pollingEvery(Duration.ofSeconds(5));
        WebElement SignUpButton = driver.findElement(By.id("signin2"));
        wait.until(ExpectedConditions.elementToBeClickable(SignUpButton));
        SignUpButton.click();
    }
}
