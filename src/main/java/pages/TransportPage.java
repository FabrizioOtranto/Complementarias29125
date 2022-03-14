package pages;

import utility.PropertiesFile;

public class TransportPage extends BasePage{
    String HomeUrl = PropertiesFile.getProperty("HomeURL");

    public TransportPage(){
        this.driver = getDriver();
    }

    public void goHomePage(){
        driver.get(HomeUrl);
    }
}

