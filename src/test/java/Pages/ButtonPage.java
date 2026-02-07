package Pages;

import org.openqa.selenium.*;
import org.testng.Assert;

public class ButtonPage {

    private WebDriver driver;

    public ButtonPage(WebDriver driver) {
        this.driver = driver;
    }

    private By clickButton = By.xpath("//span[normalize-space()='Click']");
    private By positionButton = By.xpath("//button[@id='j_idt88:j_idt94']//span[@class='ui-button-text ui-c'][normalize-space()='Submit']");
    private By colorButton = By.xpath("//button[@id='j_idt88:j_idt96']");
    private By widthHight = By.xpath("//button[@id='j_idt88:j_idt98']//span[@class='ui-button-text ui-c'][normalize-space()='Submit']");


    public void ClickAndConfirmTitle(){
        WebElement button = driver.findElement(clickButton);
        button.click();
    }
    public void getPosition(){
        WebElement button = driver.findElement(positionButton);
        Point location = button.getLocation(); //Location eka ganna .getLocation();
        int x = location.getX();
        int y =location.getY();
        System.out.println("X position is: "+ x);
        System.out.println("Y position is: "+ y);
    }

    public void getBackgroundColor(){
        WebElement button = driver.findElement(colorButton);
        String color =  button.getCssValue("background-color");  //Css Properties ganna .getCssValue();
        System.out.println("Background color is the element is: "+ color);
    }

    public void getWithAndHight(){
        WebElement button = driver.findElement(widthHight);
        Dimension sizes = button.getSize();
        int height = sizes.getHeight();
        int width = sizes.getWidth();
        System.out.println("Button's height is: "+height+" width is:"+width);
    }
}
