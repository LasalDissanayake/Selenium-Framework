package Tests;

import Base.BaseTest;
import Pages.LandingPage;
import Pages.LinkPage;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LinkTest extends BaseTest {

    // 1) Take me to the dashboard
    @Test
    public void takeMeToTheDashboard(){

        LandingPage landingPage = new LandingPage(driver);
        landingPage.clickOnElementsDropdownButton();
        landingPage.clickOnTheLinkElement();
        landingPage.isconfirmLandingPage();
    }

    // 2) Find my destination
    @Test
    public void findMyDestination(){
        LandingPage landingPage = new LandingPage(driver);
        LinkPage linkPage = new LinkPage(driver);
        landingPage.clickOnElementsDropdownButton();
        landingPage.clickOnTheLinkElement();
        linkPage.findMyDestination();
    }
    // 3) Am I Broken Link?
    @Test
    public void amIBrokenLink(){
        LinkPage linkPage = new LinkPage(driver);
        linkPage.navigateToLinkpage();
        linkPage.amIBroken();
    }

    // 4) Duplicate Link

    // 5) Count Page Links
    @Test
    public void countPageLinks(){
        LinkPage linkPage = new LinkPage(driver);
        linkPage.findLinks();
    }

    // 6) Count layout links
    @Test
    public void countLayoutlinks(){
        LinkPage linkPage = new LinkPage(driver);
        linkPage.navigateToLinkpage();
        linkPage.layoutLinks();
    }

}
