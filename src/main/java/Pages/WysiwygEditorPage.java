package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WysiwygEditorPage {
    private WebDriver driver;
    private String frameId = "mce_0_ifr";
    private By body = By.id("tinymce");
    private By decreaseIndentButton = By.cssSelector("button[title='Increase indent']");

    public WysiwygEditorPage(WebDriver driver) {
        this.driver = driver;
    }

    private void switchToEditArea(){
        driver.switchTo().frame(frameId);
    }

    public void clearTextArea(){
        switchToEditArea();
        driver.findElement(body).clear();
        switchToMainArea();
    }

    /**
     * If you enter into an iframe within your method call, once you're done whatever it is that you need to do, you should exit out of that iframe. You never know what your test's next action is going to be. And if it's something that's at the parent level then you have them stuck in that iframe. So, it's a good habit for your method to enter into the iframe if it needs to, do whatever it needs to do and then exit out of the iframe.
     */

    private void switchToMainArea(){
        driver.switchTo().parentFrame();
    }

    public void setTextArea(String text){
        switchToEditArea();
        driver.findElement(body).sendKeys(text);
        switchToMainArea();
    }

    public void setDecreaseIndent(){
        driver.findElement(decreaseIndentButton).click();
    }

    public String getTextFromEditor(){
        switchToEditArea();
        String text = driver.findElement(body).getText();
        switchToMainArea();
        return text;
    }


}
