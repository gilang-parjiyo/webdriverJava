package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EmailSentPage {
    private WebDriver driver;
    private By header = By.xpath("//h1");

    public EmailSentPage(WebDriver driver){
        this.driver = driver;
    }

    public String getMessage(){
        return driver.findElement(header).getText();
    }
}
