package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.awt.event.KeyEvent;

public class TextBoxPage {

    private WebDriver driver;

    public TextBoxPage(WebDriver driver) {
        this.driver = driver;
    }

    private By nameTypingTextBox = By.id("j_idt88:name");
    private By appendCountryTextBox = By.cssSelector("input[id='j_idt88:j_idt91']");
    private By dissableTextBox = By.xpath("//form[@id='j_idt88']//div[3]//div[1]//input");
    private By clearTextBox = By.cssSelector("input[id='j_idt88:j_idt95']");
    private By retrieveTypedText = By.id("j_idt88:j_idt97");
    private By emailTextBox = By.id("j_idt88:j_idt99");
    private By nextBox = By.id("j_idt88:j_idt101");


    public void typename(){
       WebElement name = driver.findElement(nameTypingTextBox);
       name.sendKeys("Lasal");
    }
    public void appendCountry(){
        WebElement country = driver.findElement(appendCountryTextBox);
        country.sendKeys(" India");
    }
    public void isdissable(){
        WebElement dissable = driver.findElement(dissableTextBox);
        boolean result = dissable.isEnabled();
        System.out.println("Text box is "+ result);
    }

    public boolean istextboxdissable(){
        WebElement textBox = driver.findElement(dissableTextBox);
        boolean result = textBox.isEnabled();
        return result;
    }

    public void clearText(){
        WebElement text = driver.findElement(clearTextBox);
        text.clear();
    }

    public void retrieveText(){
        WebElement text = driver.findElement(retrieveTypedText);
        String value = text.getAttribute("value");
        System.out.println("Retrieved text is "+ value);
    }

    public String emailTypeAndTab(){
        WebElement email = driver.findElement(emailTextBox);
        email.sendKeys("l@gmail.com");
        email.sendKeys(Keys.TAB + "Confirm in the next text box");
        WebElement confNextBox = driver.findElement(nextBox);
        String conftext = confNextBox.getAttribute("value");
        return  conftext;
    }

    public void openTextBoxPage(){
        LandingPage landingPage = new LandingPage(driver);
        landingPage.clickOnElementsDropdownButton();
        landingPage.clickOnTheTextBoxElement();
    }
}
