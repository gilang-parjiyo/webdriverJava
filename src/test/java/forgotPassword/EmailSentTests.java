package forgotPassword;

import base.BaseTest;
import Pages.EmailSentPage;
import Pages.ForgotPasswordPage;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

@Test
public class EmailSentTests extends BaseTest {
    public void testRetrievePassword() {
        ForgotPasswordPage forgotPasswordPage = homePage.clickForgotPassword();
        forgotPasswordPage.setEmail("geelangtester@gmail.com");
        EmailSentPage emailSentPage = forgotPasswordPage.clickRetrievePasswordButton();
        assertTrue(emailSentPage.getMessage().contains("Internal Server Error"), "Message Text is incorrect");
    }
}
