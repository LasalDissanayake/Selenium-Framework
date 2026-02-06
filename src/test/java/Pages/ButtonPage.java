package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class ButtonPage {

    private WebDriver driver;

    public ButtonPage(WebDriver driver) {
        this.driver = driver;
    }

    private By clickButton = By.xpath("//span[normalize-space()='Click']");


    public void ClickAndConfirmTitle(){
        WebElement button = driver.findElement(clickButton);
        button.click();
    }
}
