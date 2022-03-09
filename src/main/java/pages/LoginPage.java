package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    By usernameInput = By.cssSelector("#user-name");
    By passwordInput = By.xpath("//input[@id='password']");
    By loginButton = By.id("login-button");
    WebDriver driver;

    public LoginPage(WebDriver driver){
        this.driver = driver;
    }

    public void Login(String username, String password){
        driver.findElement(usernameInput).sendKeys(username);
        driver.findElement(passwordInput).sendKeys(password);
        driver.findElement(loginButton).click();
    }
}
