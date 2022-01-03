package popUp;

import Pages.ContextMenuPage;
import base.BaseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class ContextMenuTest extends BaseTest {

    @Test
    public void testContextMenu() {
        ContextMenuPage contextMenuPage = homePage.clickContextMenu();

        contextMenuPage.rightClickHotSpot();
        String textAlert = contextMenuPage.alert_getText();
        contextMenuPage.alert_clickOk();

        assertEquals(textAlert, "You selected a context menu", "Text alert is incorrect");
    }

}
