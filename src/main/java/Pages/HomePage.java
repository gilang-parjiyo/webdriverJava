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

    // method click Alerts
    public HorizontalSliderPage clickHorizontalSlider(){
        clickLink("Horizontal Slider");
        return new HorizontalSliderPage(driver);
    }

    // method click Alerts Page
    public AlertsPage clickAlerts(){
        clickLink("JavaScript Alerts");
        return new AlertsPage(driver);
    }

    // method click FileUploadPage
    public FileUploadPages clickFileUpload(){
        clickLink("File Upload");
        return new FileUploadPages(driver);
    }

    // method click EntryAd
    public EntryAdPage clickEntryAd(){
        clickLink("Entry Ad");
        return new EntryAdPage(driver);
    }

    // method click context Menu
    public ContextMenuPage clickContextMenu(){
        clickLink("Context Menu");
        return new ContextMenuPage(driver);
    }

    // method click WysiwygEditor
    public WysiwygEditorPage clickWysiwygEditor(){
        clickLink("WYSIWYG Editor");
        return new WysiwygEditorPage(driver);
    }



}
