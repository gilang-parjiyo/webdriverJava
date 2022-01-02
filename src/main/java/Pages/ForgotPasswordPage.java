package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ForgotPasswordPage {

    // instance field
    private WebDriver driver;
    private By emailField = By.id("email");
    private By retrievePasswordButton = By.id("form_submit");

    // constructor
    public ForgotPasswordPage(WebDriver driver){
        this.driver = driver;
    }

    public void setEmail(String email){
        driver.findElement(emailField).sendKeys(email);
    }

    public EmailSentPage clickRetrievePasswordButton(){
        driver.findElement(retrievePasswordButton).click();
        return new EmailSentPage(driver);
    }


}
