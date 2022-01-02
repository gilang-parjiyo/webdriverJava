package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SecurePageArea {
    private WebDriver driver;
    private By statusAlert = By.cssSelector("#flash");

    public SecurePageArea(WebDriver driver){
        this.driver = driver;
    }

    public String getAlert(){
        return driver.findElement(statusAlert).getText();
    }
}
