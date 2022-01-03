package popUp;

import Pages.EntryAdPage;
import base.BaseTest;
import org.testng.annotations.Test;

import static java.lang.Thread.sleep;

public class EntryAdTest extends BaseTest {

    @Test
    public void testEntryAd() {
        EntryAdPage entryAdPage = homePage.clickEntryAd();
        entryAdPage.clickClosePopUp();
    }
}
