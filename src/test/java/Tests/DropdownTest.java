package Tests;

import Base.BaseTest;
import Pages.DropdownPage;
import Pages.LandingPage;
import org.testng.annotations.Test;

public class DropdownTest extends BaseTest {

    @Test
    public void selectFromDropdown(){
        DropdownPage dropdownPage = new DropdownPage(driver);
        LandingPage landingPage = new LandingPage(driver);
        landingPage.clickOnTheDropdownElement();
        dropdownPage.waysOfSelect();
    }
    @Test
    public void getFromDropdown(){
        DropdownPage dropdownPage = new DropdownPage(driver);
        LandingPage landingPage = new LandingPage(driver);
        landingPage.clickOnTheDropdownElement();
        dropdownPage.getValues();
    }

    @Test
    public void getFromBoostrapDropdown(){
        DropdownPage dropdownPage = new DropdownPage(driver);
        LandingPage landingPage = new LandingPage(driver);
        landingPage.clickOnTheDropdownElement();
        dropdownPage.selectCountry();
    }

}
