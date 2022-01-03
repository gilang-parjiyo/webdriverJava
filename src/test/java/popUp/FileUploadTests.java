package popUp;

import Pages.FileUploadPages;
import base.BaseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class FileUploadTests extends BaseTest {

    @Test
    public void testFileUpload(){

        FileUploadPages fileUploadPages = homePage.clickFileUpload();
        fileUploadPages.uploadFile("C:\\Users\\Gilang_R831\\IdeaProjects\\webdriverJava\\resources\\chromedriver.exe");

        assertEquals(fileUploadPages.getUploadFiles(), "chromedriver.exe", "Uploaded files incorrect");
    }
}
