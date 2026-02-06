package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LandingPage {

    private WebDriver driver;

    private By elementsDropdownButton = By.cssSelector("body > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > form:nth-child(2) > ul:nth-child(2) > li:nth-child(3) > a:nth-child(1)");
    private By dropdown = By.cssSelector("a[href='/select.xhtml']");
    private By link = By.cssSelector("body > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > form:nth-child(2) > ul:nth-child(2) > li:nth-child(3) > ul:nth-child(3) > li:nth-child(6) > a:nth-child(1) > span:nth-child(2)");
    private By linkPageConfirm = By.xpath("//h5[normalize-space()='Take me to dashboard']");
    private By dropdownPageConfirm = By.cssSelector("div[class='grid ui-fluid'] div:nth-child(1) div:nth-child(1) h5:nth-child(1)");
    private By videoViews = By.cssSelector("div[class='overview-box monthly-views'] div[class='overview-title']");
    private By textboxElement = By.xpath("//span[normalize-space()='Text Box']");
    private By confirmTextboxPage = By.xpath("//h5[normalize-space()='Type your name']");
    private By buttonElement = By.xpath("//a[@class='rotated-icon']");
    private By confirmButtonPage = By.xpath("//h5[normalize-space()='Click and Confirm title.']");




    public LandingPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickOnElementsDropdownButton(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement dropdown = wait.until(ExpectedConditions.elementToBeClickable(elementsDropdownButton));
        dropdown.click();
    }

    public void clickOnTheDropdownElement(){
        driver.findElement(dropdown).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement confirm = wait.until(ExpectedConditions.visibilityOfElementLocated(dropdownPageConfirm));
        confirm.click();
    }

    public void clickOnTheLinkElement(){
        driver.findElement(link).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement confirm = wait.until(ExpectedConditions.visibilityOfElementLocated(linkPageConfirm));
        confirm.click();
    }

    public boolean isconfirmLandingPage(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        try {
           return wait.until(ExpectedConditions.visibilityOfElementLocated(videoViews)).isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }

    public void clickOnTheTextBoxElement(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.findElement(textboxElement).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(confirmTextboxPage));
    }
    public void clickOnButtonElement(){
        WebElement button = driver.findElement(buttonElement);
        button.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(confirmButtonPage));
    }



}
