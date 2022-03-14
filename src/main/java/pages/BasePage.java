package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utility.DriverFactory;

public class BasePage {

    WebDriver driver;
    static WebDriverWait wait;

    public BasePage(){
        this.driver = DriverFactory.getDriver();
        this.wait = DriverFactory.getWait();
    }

    public WebDriver getDriver(){
        return driver;
    }

    public void Click(By locator){
        wait.until(ExpectedConditions.elementToBeClickable(locator));
        driver.findElement(locator).click();
    }

    public void SendKeys(By locator, String text){
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        driver.findElement(locator).sendKeys(text);
    }

    public void ClickOnWebElement(WebElement element){
        wait.until(ExpectedConditions.elementToBeClickable(element));
        element.click();
    }

    public String getText(){
        return "hola";
    }

}
