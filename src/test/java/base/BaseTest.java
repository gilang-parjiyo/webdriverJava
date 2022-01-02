package base;

import Pages.HomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest {

    private WebDriver driver;
    protected HomePage homePage;

    @BeforeClass
    public void setUp(){
        // property to find executable file
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");

        // instance chrome driver
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");

        // instance method HomePage
        homePage = new HomePage(driver);
    }

    @AfterClass
    public void tearDown(){
//        driver.quit();
    }

}
