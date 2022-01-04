package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FramePage {
    private WebDriver driver;
    private By nestedFrameLinkText = By.linkText("Nested Frames");

    public FramePage(WebDriver driver){
        this.driver = driver;
    }

    public NestedFramePage clickNestedFrame(){
        driver.findElement(nestedFrameLinkText).click();
        return new NestedFramePage(driver);
    }

}
