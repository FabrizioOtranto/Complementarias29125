package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;


public class ProductsPage {
    By pricesElementsLocator = By.xpath("//h5[contains(text(), '$')]");
    WebDriver driver;

    public ProductsPage(WebDriver driver){
        this.driver = driver;
    }


    public void ClickProductInPriceRange(int minPrice, int maxPrice){
        //Toma el webElement que devolvio la funcion getPriceInRange y desde ese punto busca el hermano que esta por encima en el arbol de la pagina.
        getPriceInPriceRange(minPrice, maxPrice).findElement(By.xpath(".//preceding-sibling::h4")).click();
    }

    public WebElement getPriceInPriceRange( int minPrice, int MaxPrice){
        int price;
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("MacBook Pro")));
        //Crea un array con todos los precios de la pagina
        List<WebElement> pricesElements = driver.findElements(pricesElementsLocator);
        //Es un Foreach que recorre todos los elementos del array pricesElements
        for (WebElement priceElement: pricesElements) {
            //Convierte el resultado de getText() que es un string en un Int y remueve el signo $
            price = Integer.parseInt(priceElement.getText().replace("$", ""));
            System.out.println(price);
            // Compara si el precio esta entre los limites minimos y mxaimos. Si esta, devuelve el WebElement.
            if (minPrice <= price && price <= MaxPrice ) {
                //
                return priceElement;
            }
        }
        System.out.println("Ningun producto estan en el rango");
        return null;
    }

}
