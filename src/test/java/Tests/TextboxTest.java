package Tests;

import Base.BaseTest;
import Pages.LandingPage;
import Pages.TextBoxPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TextboxTest extends BaseTest {

    // 1) Type your name
    @Test
    public void typeName(){
        LandingPage landingPage = new LandingPage(driver);
        TextBoxPage textBoxPage = new TextBoxPage(driver);
        landingPage.clickOnElementsDropdownButton();
        landingPage.clickOnTheTextBoxElement();
        textBoxPage.typename();
    }

    // 2)Append Country to this City.
    @Test
    public void appendCountry(){
        TextBoxPage textBoxPage = new TextBoxPage(driver);
        textBoxPage.openTextBoxPage();
        textBoxPage.appendCountry();
    }
    // 3)Verify if text box is disabled
    @Test
    public void textboxstatus(){
        TextBoxPage textBoxPage = new TextBoxPage(driver);
        textBoxPage.openTextBoxPage();
        textBoxPage.isdissable();
    }

    @Test
    public void isTextBoxDissable(){
        TextBoxPage textBoxPage = new TextBoxPage(driver);
        textBoxPage.openTextBoxPage();
        boolean status = textBoxPage.istextboxdissable();
        Assert.assertFalse(status,"Text box is enable But it should be disable");
    }

    // 4)Clear the typed text.
    @Test
    public void clearText(){
        TextBoxPage textBoxPage = new TextBoxPage(driver);
        textBoxPage.openTextBoxPage();
        textBoxPage.clearText();
    }

    // 5)Retrieve the typed text.
    @Test
    public void retrivedText(){
        TextBoxPage textBoxPage = new TextBoxPage(driver);
        textBoxPage.openTextBoxPage();
        textBoxPage.retrieveText();
    }

    // 6)Type email and Tab. Confirm control moved to next element.
    @Test
    public void emailAndTab(){
        TextBoxPage textBoxPage = new TextBoxPage(driver);
        textBoxPage.openTextBoxPage();
        String actualText = textBoxPage.emailTypeAndTab();
        String expectedText = "Confirm in the next text box";
        Assert.assertEquals(actualText,expectedText, "Failed");
    }

}
