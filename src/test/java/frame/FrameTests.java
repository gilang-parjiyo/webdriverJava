package frame;

import Pages.NestedFramePage;
import base.BaseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class FrameTests extends BaseTest {

    @Test
    public void testFrame (){
        NestedFramePage nestedFramePage = homePage.clickFrame().clickNestedFrame();

        assertEquals(nestedFramePage.getBottomFrameText(), "BOTTOM", "Text bottom frame incorrect");
        assertEquals(nestedFramePage.getLeftFrameText(), "LEFT", "Text bottom frame incorrect");
    }
}
