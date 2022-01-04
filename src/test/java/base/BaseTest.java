package base;

import Pages.HomePage;
import Utils.EventReporter;
import Utils.WindowManager;
import com.google.common.io.Files;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.events.EventFiringDecorator;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import javax.imageio.IIOException;
import java.io.File;
import java.io.IOException;

public class BaseTest {

//  private WebDriver driver;
    private EventFiringWebDriver driver;
    protected HomePage homePage;

    @BeforeMethod // to run before each method called
    public void goHome(){
        driver.get("https://the-internet.herokuapp.com/");
        homePage = new HomePage(driver);
    }

    @BeforeClass // to run before each class called
    public void setUp(){
        // property to find executable file
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new EventFiringWebDriver(new ChromeDriver(getChromeOptions()));
        driver.register(new EventReporter());


        // instance chrome driver
        // driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");

        // instance method HomePage
        homePage = new HomePage(driver);
        goHome();
        setCookie();
    }

    public WindowManager getWindowManager(){
        return new WindowManager(driver);
    }

    @AfterMethod
    public void captureFailure(ITestResult result){
        var camera = (TakesScreenshot)driver;
        File screenshot = camera.getScreenshotAs(OutputType.FILE);

        if(ITestResult.FAILURE == result.getStatus()){
            try {
            Files.move(screenshot, new File("resources/screenshots/" + result.getName() + ".png"));
        } catch (IOException e){
            e.printStackTrace();
        }
        }
    }

    @AfterClass
    public void tearDown(){
//        driver.quit();
    }

    private ChromeOptions getChromeOptions(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("disable-infobars");
//        options.setHeadless(true);
        return options;
    }

    private void setCookie(){
        Cookie cookie = new Cookie.Builder("tau", "123")
                .domain("the-internet.herokuapp.com")
                .build();
        driver.manage().addCookie(cookie);
    }

}
