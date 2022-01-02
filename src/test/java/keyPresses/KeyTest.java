package keyPresses;

import Pages.KeyPressesPage;
import base.BaseTest;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class KeyTest extends BaseTest {

    @Test
    public void testBackspace(){
        KeyPressesPage keyPressesPage = homePage.clickKeyPresses();
        keyPressesPage.enterText("A" + Keys.BACK_SPACE);
        assertEquals(keyPressesPage.getResult(), "You entered: BACK_SPACE");
    }
    @Test
    public void testPI(){
        KeyPressesPage keyPressesPage = homePage.clickKeyPresses();
        keyPressesPage.enterPI();

    }
}
