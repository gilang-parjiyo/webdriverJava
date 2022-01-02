package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.stream.Collectors;

public class DropDownPage {
    // instance field
    private WebDriver driver;
    private By dropdown = By.id("dropdown");

    // constructor
    public DropDownPage(WebDriver driver) {
        this.driver = driver;
    }

    public void selectFromDropDown(String option) {
        Select dropDownElement = new Select(driver.findElement(dropdown));
        dropDownElement.selectByVisibleText(option);
    }

    public List<String> getSelectedOptions() {
        List<WebElement> selectedElements = findDropDownElement().getAllSelectedOptions();
        return selectedElements.stream().map(elem -> elem.getText()).collect(Collectors.toList());
    }

    private Select findDropDownElement() {
        return new Select(driver.findElement(dropdown));
    }
}
