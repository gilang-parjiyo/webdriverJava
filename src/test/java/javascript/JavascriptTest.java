package javascript;

import base.BaseTest;
import org.testng.annotations.Test;

import java.util.List;

import static org.testng.Assert.*;

public class JavascriptTest extends BaseTest {

    @Test
    public void testScrollToTable() {
        homePage.clickLargeAndDeepDom().scrollToTable();
    }

    @Test
    public void testScrollToFifthParagraph() {
        homePage.clickInfiniteScroll().scrollToParagraph(5);
    }

    @Test
    public void testAddMultipleAttributeToDropDown() {

        var dropDownPage = homePage.clickDropDown();
        dropDownPage.addMultipleAttribute();

        var optionToSelect = List.of("Option 1", "Option 2");
        optionToSelect.forEach(dropDownPage::selectFromDropDown);

        var selectedOptions = dropDownPage.getSelectedOptions();
        assertTrue(selectedOptions.containsAll(optionToSelect), "All options were not selected");
        assertEquals(selectedOptions.size(), optionToSelect.size(), "Number of selected items");

    }
}
