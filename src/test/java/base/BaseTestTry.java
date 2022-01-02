package base;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;

public class BaseTestTry {
    private WebDriver driver;

    // create setup method
    public void setUp() {
        // set executable file directory
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");

        // instantiate driver
        driver = new ChromeDriver();

        // open url using method get
        driver.get("https://the-internet.herokuapp.com/");

        //1 - maximize the window
        driver.manage().window().maximize();

        //2 - Fullscreen mode
        driver.manage().window().fullscreen();

        //3 - Specific width
        Dimension size = new Dimension(375, 812);
        driver.manage().window().setSize(size);

        // Get multiple element
        List<WebElement> links = driver.findElements(By.tagName("a"));
        System.out.println(links.size());

        // Select element
        WebElement inputsLink = driver.findElement(By.linkText("Inputs"));
        inputsLink.click();
        driver.navigate().back();
        WebElement shiftingContent = driver.findElement(By.linkText("Shifting Content"));
        shiftingContent.click();
        WebElement menuElement = driver.findElement(By.linkText("Example 1: Menu Element"));
        menuElement.click();
        // Select multiple element with css selector.
        List<WebElement> menu = driver.findElements(By.cssSelector("ul > li"));
        System.out.println(menu.size());

        // print title
        System.out.println(driver.getTitle());
        // quit browser
        driver.close();
    }

    public static void main(String[] args) {
        // instance test of class base test
        BaseTestTry test = new BaseTestTry();
        // call method setup
        test.setUp();
    }
}
