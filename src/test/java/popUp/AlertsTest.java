package popUp;

import Pages.AlertsPage;
import base.BaseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class AlertsTest extends BaseTest {

    @Test
    public void testAcceptAlert(){
        AlertsPage alertsPage = homePage.clickAlerts();
        alertsPage.triggerAlert();
        alertsPage.alert_clickToAccept();
        alertsPage.getResultText();
        assertEquals(alertsPage.getResultText(), "You successfully clicked an alert", "Results text is incorrect" );

    }

    @Test
    public void testGetTextFromAlert(){

        AlertsPage alertsPage = homePage.clickAlerts();
        alertsPage.triggerConfirm();

        String textAlert = alertsPage.alert_getText();
        alertsPage.alert_clickToDismiss();

        assertEquals(textAlert, "I am a JS Confirm", "Alert text incorrect");
        assertEquals(alertsPage.getResultText(), "You clicked: Cancel", "Result is incorrect");

    }

    @Test
    public void testSetInputInAlert(){

        AlertsPage alertsPage = homePage.clickAlerts();
        alertsPage.triggerPrompt();

        String textAlert = "TAU rocks!";
        alertsPage.alert_setInput(textAlert);
        alertsPage.alert_clickToAccept();

        assertEquals(alertsPage.getResultText(), "You entered: " + textAlert, "Result text incorrect");
    }
}
