package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class waits extends  BasePage {

    public waits(){
        this.driver = getDriver();
    }

    public static void EsperarMascaraDeCarga(By locator){
    wait.until(ExpectedConditions.invisibilityOfElementLocated(locator));
    }
}
