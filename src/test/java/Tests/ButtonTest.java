package Tests;

import Base.BaseTest;
import Pages.ButtonPage;
import Pages.LandingPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ButtonTest extends BaseTest {

    @Test
    public void clickAndConfirm(){
        LandingPage landingPage = new LandingPage(driver);
        ButtonPage buttonPage = new ButtonPage(driver);
        landingPage.clickOnElementsDropdownButton();
        landingPage.clickOnButtonElement();
        buttonPage.ClickAndConfirmTitle();
        String actualTitle = driver.getTitle();
        String expectedTitle = "Dashboard";
        Assert.assertEquals(actualTitle,expectedTitle,"Failed");
    }
}
