package login;

import base.BaseTest;
import Pages.LoginPage;
import Pages.SecurePageArea;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

@Test
public class LoginTests extends BaseTest {
    public void testSuccessfulLogin(){
        LoginPage loginPage = homePage.clickFormAuthentication();
        loginPage.setUsername("tomsmith");
        loginPage.setPassword("SuperSecretPassword!");
        SecurePageArea securePageArea = loginPage.clickLoginButton();
        assertTrue(securePageArea.getAlert().contains("You logged into a secure area!"), "Alert text is incorrect");
    }
}
