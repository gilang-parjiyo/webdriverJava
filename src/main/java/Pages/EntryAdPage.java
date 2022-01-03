package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class EntryAdPage {
    private WebDriver driver;
    private By closePopUpButton = By.xpath("//p[.='Close']");

    public EntryAdPage(WebDriver driver){
        this.driver = driver;
    }

    public void clickClosePopUp(){
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(closePopUpButton));

        driver.findElement(closePopUpButton).click();
    }

}
