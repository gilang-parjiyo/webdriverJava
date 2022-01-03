package wysiwygEditor;

import Pages.WysiwygEditorPage;
import base.BaseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class WysiwygEditorTest extends BaseTest {

    @Test
    public void testWysiwygEditor() {

        WysiwygEditorPage wysiwygEditorPage = homePage.clickWysiwygEditor();
        wysiwygEditorPage.clearTextArea();

        String text1 = "hello";
        String text2 = "world";
        wysiwygEditorPage.setTextArea(text1);
        wysiwygEditorPage.setDecreaseIndent();
        wysiwygEditorPage.setTextArea(text2);

        assertEquals(wysiwygEditorPage.getTextFromEditor(), text1 + text2, "Text Editor is incorrect");
    }

}
