package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private  WebDriver driver;

    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    // method click link
    public void clickLink(String linkText){
        driver.findElement(By.linkText(linkText)).click();
    }

    // method click form authentication page
    public LoginPage clickFormAuthentication(){
        clickLink("Form Authentication");
        return new LoginPage(driver);
    }

    // method click dropdown page
    public DropDownPage clickDropDown(){
        clickLink("Dropdown");
        return new DropDownPage(driver);
    }

    // method click forgot password page
    public ForgotPasswordPage clickForgotPassword(){
        clickLink("Forgot Password");
        return new ForgotPasswordPage(driver);
    }

    // method click hover page
    public HoversPage clickHovers(){
        clickLink("Hovers");
        return new HoversPage(driver);
    }

    // method click keyPresses
    public KeyPressesPage clickKeyPresses(){
        clickLink("Key Presses");
        return new KeyPressesPage(driver);
    }

    // method click
    public HorizontalSliderPage clickHorizontalSlider(){
        clickLink("Horizontal Slider");
        return new HorizontalSliderPage(driver);
    }



}
