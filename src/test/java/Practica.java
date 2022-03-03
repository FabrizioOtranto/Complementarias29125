import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;

public class Practica {

    private WebDriver driver;
    public static String driverPath = "./src/main/resources/drivers/";

    @Test
    public void checkbox(){
        System.setProperty("webdriver.chrome.driver", driverPath + "chromedriver.exe");
        driver = new ChromeDriver();

        driver.navigate().to("https://the-internet.herokuapp.com/checkboxes");
        driver.findElement(By.cssSelector("form > input:nth-child(3)")).click();
        driver.quit();
    }

    @Test
    public void aceptarAlerta(){
        System.setProperty("webdriver.chrome.driver", driverPath + "chromedriver.exe");
        driver = new ChromeDriver();


        driver.navigate().to("https://the-internet.herokuapp.com/javascript_alerts");
        WebElement primerAlerta = driver.findElement(By.cssSelector("ul[style] > li:nth-child(1) > button"));
        primerAlerta.click();
        Alert alert = driver.switchTo().alert();
        System.out.print(alert.getText());
        driver.quit();

    }

    @Test
    public void confirmarAlerta(){
        System.setProperty("webdriver.chrome.driver", driverPath + "chromedriver.exe");
        driver = new ChromeDriver();

        driver.navigate().to("https://the-internet.herokuapp.com/javascript_alerts");
        WebElement segundaAlerta = driver.findElement(By.cssSelector("ul[style] > li:nth-child(2) > button"));
        segundaAlerta.click();
        Alert alert = driver.switchTo().alert();
        alert.accept();
        driver.quit();
    }

    @Test
    public void dismissAlerta(){
        System.setProperty("webdriver.chrome.driver", driverPath + "chromedriver.exe");
        driver = new ChromeDriver();

        driver.navigate().to("https://the-internet.herokuapp.com/javascript_alerts");
        WebElement segundaAlerta = driver.findElement(By.cssSelector("ul[style] > li:nth-child(2) > button"));
        segundaAlerta.click();
        Alert alert = driver.switchTo().alert();
        alert.dismiss();
        driver.quit();
    }
    @Test
    public void escribirAlerta(){
        System.setProperty("webdriver.chrome.driver", driverPath + "chromedriver.exe");
        driver = new ChromeDriver();

        driver.navigate().to("https://the-internet.herokuapp.com/javascript_alerts");
        WebElement tercerAlerta = driver.findElement(By.cssSelector("ul[style] > li:nth-child(3) > button"));
        tercerAlerta.click();
        Alert alert = driver.switchTo().alert();
        alert.sendKeys("Coderhouse");
        alert.accept();
        driver.quit();

    }

    @Test
    public void frame() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", driverPath + "chromedriver.exe");
        driver = new ChromeDriver();
        driver.navigate().to("https://the-internet.herokuapp.com/iframe");
        driver.switchTo().frame("mce_0_ifr");
        WebElement body = driver.findElement(By.tagName("body"));
        body.clear();
        body.sendKeys("Coderhouse");
        driver.quit();



    }
}
