package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static pages.waits.EsperarMascaraDeCarga;

public class LoginPage extends BasePage {

    By usernameInput = By.cssSelector("#user-name");
    By passwordInput = By.xpath("//input[@id='password']");
    By loginButton = By.id("login-button");


    public LoginPage(){
        this.driver = getDriver();
    }

    public void Login(String username, String password){
        //EsperarMascaraDeCarga(usernameInput); Esta linea esta comentada porque era a modo explicativo y no funciona en este aso!
        SendKeys(usernameInput, username);
        SendKeys(passwordInput, password);
        Click(loginButton);
    }
}
