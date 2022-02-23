import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class test {
    private String url = "https://demo.nopcommerce.com/register";
    public static String driverPath = "./src/main/resources/drivers/";

    @Test
    public void test(){
        System.setProperty("webdriver.chrome.driver", driverPath + "chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to(url);
        driver.manage().window().maximize();

        WebElement firstNameInput = driver.findElement(By.id("FirstName"));
        firstNameInput.clear();
        firstNameInput.sendKeys("Coder");

        WebElement lastNameInput = driver.findElement(By.id("LastName"));
        lastNameInput.clear();
        lastNameInput.sendKeys("house");

        WebElement dayElement = driver.findElement(By.xpath("//select[@name='DateOfBirthDay']"));
        Select dayList = new Select(dayElement);
        dayList.selectByVisibleText("1");

        WebElement monthElement = driver.findElement(By.name("DateOfBirthMonth"));
        Select monthList = new Select(monthElement);
        monthList.selectByVisibleText("October");

        WebElement yearElement = driver.findElement(By.name("DateOfBirthYear"));
        Select yearList = new Select(yearElement);
        yearList.selectByVisibleText("1985");

        WebElement emailInput = driver.findElement(By.id("Email"));
        emailInput.clear();
        emailInput.sendKeys("coderhouse@coderhouse5.com");

        WebElement passwordInput = driver.findElement(By.name("Password"));
        passwordInput.clear();
        passwordInput.sendKeys("coderhouse");

        WebElement confirmPasswordInput = driver.findElement(By.id("ConfirmPassword"));
        confirmPasswordInput.clear();
        confirmPasswordInput.sendKeys("password");
        
        driver.quit();


    }
}
