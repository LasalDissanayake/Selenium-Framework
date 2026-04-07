package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RadioButtonPage {
    public RadioButtonPage(WebDriver driver) {
        this.driver = driver;
    }

    private WebDriver driver;
    private By chrome = By.xpath("//input[@id='j_idt87:console2:0']");
    private By fireFox = By.xpath("//input[@id='j_idt87:console2:1']");
    private By safari = By.xpath("//input[@id='j_idt87:console2:2']");
    private By edge = By.xpath("//input[@id='j_idt87:console2:3']");
    private By agegrp = By.xpath("//input[@id='j_idt87:age:0']");





    //Find the Default selected Radio Button
    public void findDefaultSelect(){

        //.isSelected() method eka weda karanne <input> tag eken aramba wela thiyana elements walata witharai

        Boolean isChromeSelected = driver.findElement(chrome).isSelected();
        Boolean isFirefoxSelected = driver.findElement(fireFox).isSelected();
        Boolean isSafariSelected = driver.findElement(safari).isSelected();
        Boolean isEdgeSelected = driver.findElement(edge).isSelected();
        List <Boolean> isSelected = Arrays.asList(isChromeSelected,isFirefoxSelected,isSafariSelected,isEdgeSelected);

        if (isChromeSelected){
            System.out.println("Chrome");
        }else if (isEdgeSelected){
            System.out.println("Edge");
        }else if (isFirefoxSelected){
            System.out.println("firefox");
        } else if (isSafariSelected) {
            System.out.println("safari");
        }
    }

    //Find the age group if not selected@Test
public void selectIfNotSelected(){
        WebElement Selected = driver.findElement(agegrp);
        Boolean isSelected = Selected.isSelected();
        if (!isSelected){
            Selected.click();
        }
}

}
