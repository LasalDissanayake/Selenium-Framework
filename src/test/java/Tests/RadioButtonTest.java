package Tests;

import Base.BaseTest;
import Pages.LandingPage;
import Pages.RadioButtonPage;
import org.testng.annotations.Test;

public class RadioButtonTest extends BaseTest {

    @Test
    public void defaultselect(){
        LandingPage landingPage = new LandingPage(driver);
        RadioButtonPage radioButtonPage = new RadioButtonPage(driver);
        landingPage.clickOnRadioButtonElement();
        radioButtonPage.findDefaultSelect();
    }

    @Test
    public void selectIfNot(){
        LandingPage landingPage = new LandingPage(driver);
        RadioButtonPage radioButtonPage = new RadioButtonPage(driver);
        landingPage.clickOnRadioButtonElement();
        radioButtonPage.selectIfNotSelected();
    }

}
