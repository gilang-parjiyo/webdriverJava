package base;

import Pages.HomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

    private WebDriver driver;
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

        // instance chrome driver
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");

        // instance method HomePage
        homePage = new HomePage(driver);
        goHome();
    }

    @AfterClass
    public void tearDown(){
//        driver.quit();
    }

}
