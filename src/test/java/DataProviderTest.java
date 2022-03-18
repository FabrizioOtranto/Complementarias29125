import Data.DataProviderClass;
import Utility.DriverFactory;
import Utility.PropertiesFile;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest {
    private String url = PropertiesFile.getProperty("urlDataProvider");
    private WebDriver driver = DriverFactory.getDriver();


    @Test(dataProvider="usersDemo2", dataProviderClass = DataProviderClass.class)
    public void test(String firstName, String lastName, String email, String password, String confirmPassword){
        driver.manage().window().maximize();
        driver.navigate().to(url);

        WebElement firstNameInput = driver.findElement(By.id("FirstName"));
        firstNameInput.sendKeys(firstName);

        WebElement lastNameInput = driver.findElement(By.id("LastName"));
        lastNameInput.sendKeys(lastName);

        WebElement emailInput = driver.findElement(By.id("Email"));
        emailInput.sendKeys(email);

        WebElement passwordInpt = driver.findElement(By.id("Password"));
        passwordInpt.sendKeys(password);

        WebElement confirmPasswordInput = driver.findElement(By.id("ConfirmPassword"));
        confirmPasswordInput.sendKeys(confirmPassword);

        WebElement registerButton = driver.findElement(By.id("register-button"));
        registerButton.click();
    }

    @DataProvider(name="usersDemo")
    public static Object[][] getUsers(){
        return new Object[][]
        {
                {"coderhouse1","coderhouser1","coderhouse@coderhouse1.com","coderhouse", "coderhouse"},
                {"coderhouse2","coderhouser2","coderhouse@coderhouse2.com","coderhouse", "coderhouse"},
                {"coderhouse3","coderhouser3","coderhouse@coderhouse3.com","coderhouse", "coderhouses"}
        };
    }
}
