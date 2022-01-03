package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DynamicLoadingExample1Page {
    private WebDriver driver;
    private By startButton = By.xpath("//button[.='Start']");
    private By loading = By.id("loading");
    private By finish = By.id("finish");

    public DynamicLoadingExample1Page(WebDriver driver) {
        this.driver = driver;

    }

    public void clickStartButton() {
        driver.findElement(startButton).click();
//        WebDriverWait wait = new WebDriverWait(driver, 10);

        FluentWait wait = new FluentWait(driver)
                .withTimeout(Duration.ofSeconds(5))
                .pollingEvery(Duration.ofSeconds(1))
                .ignoring(NoSuchElementException.class);

        wait.until(ExpectedConditions.invisibilityOf(driver.findElement(loading)));


    }

    public String getLoadedText() {
        return driver.findElement(finish).getText();
    }


}
