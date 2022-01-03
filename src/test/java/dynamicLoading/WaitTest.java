package dynamicLoading;

import Pages.DynamicLoadingExample1Page;
import Pages.DynamicLoadingExample2Page;
import base.BaseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class WaitTest extends BaseTest {

    @Test
    public void testWaitExample1(){
        DynamicLoadingExample1Page loadingPage = homePage.clickDynamicLoading().clickExample1();
        loadingPage.clickStartButton();

        assertEquals(loadingPage.getLoadedText(), "Hello World!", "Loaded text incorrect");
    }

    @Test
    public void testWaitExample2(){
        DynamicLoadingExample2Page loadingPage = homePage.clickDynamicLoading().clickExample2();
        loadingPage.clickStartButton();

        assertEquals(loadingPage.getLoadedText(), "Hello World!", "Loaded text incorrect");

    }
}
