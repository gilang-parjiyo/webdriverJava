package hover;

import Pages.HomePage;
import Pages.HoversPage;
import base.BaseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class HoverTest extends BaseTest {

    @Test
    public void testHoverUser1(){

        HoversPage hoversPage = homePage.clickHovers();
        HoversPage.FigureCaption caption = hoversPage.hoverOverFigure(1);

        assertTrue(caption.isCaptionDisplayed(), "Caption is not displayed");
        assertEquals(caption.getTitle(), "name: user1", "Caption title is incorrect");
        assertEquals(caption.getLinkText(), "View profile", "Caption link text incorrect");
        assertTrue(caption.getLink().endsWith("/users/1"), "Caption link incorrect");

    }
}
