package dropDown;

import base.BaseTest;
import Pages.DropDownPage;
import org.testng.annotations.Test;

import java.util.List;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class DropDownTests extends BaseTest {

    @Test
    public void testSelectedOption(){
        String option = "Option 2";
        DropDownPage dropDownPage = homePage.clickDropDown();
        dropDownPage.selectFromDropDown(option);
        List selectedOptions = dropDownPage.getSelectedOptions();
        assertEquals(selectedOptions.size(), 1, "Incorrect number of selections");
        assertTrue(selectedOptions.contains(option), "Option not selected");
    }
}
