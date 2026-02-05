package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class LinkPage {

    private WebDriver driver;


    private By goToDashboardLink = By.linkText("Go to Dashboard");
    private By destinationWithoutclick = By.xpath("//a[normalize-space()='Find the URL without clicking me.']");
    private By brokenLink = By.linkText("Broken?");
    private By links = By.tagName("a");
    private By layout = By.xpath("//div[@class='layout-main-content']");

    public LinkPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickGoToDashboardLink(){
        WebElement link = driver.findElement(goToDashboardLink);
        link.click();
        LandingPage landingPage = new LandingPage(driver);
        landingPage.isconfirmLandingPage();

    }

    public void navigateToLinkpage(){
        LandingPage landingPage = new LandingPage(driver);
        landingPage.clickOnElementsDropdownButton();
        landingPage.clickOnTheLinkElement();
    }

    public void findMyDestination(){
        WebElement link = driver.findElement(destinationWithoutclick);
        String destination = link.getAttribute("href");
        System.out.println("Destination of the Link is "+destination);
    }

    public void amIBroken(){
        WebElement link = driver.findElement(brokenLink);
        link.click();
        String title = driver.getTitle();
        if (title.contains("404")){
            System.out.println("This is a Broken Link");
        }else {
            System.out.println("This is not a broken Link");
        }
    }

    public void findLinks(){
        List<WebElement> allLinks =  driver.findElements(links);
        int count = allLinks.size();
        System.out.println("Link count in the page is "+count);
    }

    public void layoutLinks(){
        WebElement selectedlayout = driver.findElement(layout);
        List<WebElement> linksInTheLayout = selectedlayout.findElements(links);
        int count = linksInTheLayout.size();
        System.out.println("Links in the Layout count is: "+count);
    }


}
