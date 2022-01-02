package horizontalSlider;

import Pages.HorizontalSliderPage;
import base.BaseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class HorizontalSliderTest extends BaseTest {

    @Test
    public void testSlideToWholeNumber(){
        String value = "4";
        HorizontalSliderPage sliderPage = homePage.clickHorizontalSlider();
        sliderPage.setSliderValue(value);
        assertEquals(sliderPage.getSliderValue(), value, "Slider value is incorrect");
    }

}
