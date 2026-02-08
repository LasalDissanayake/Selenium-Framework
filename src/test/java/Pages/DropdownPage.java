package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class DropdownPage {

    private WebDriver driver;

    private By selectDropdown = By.xpath("//select[@class='ui-selectonemenu']");
    private By boostrapDropdown = By.xpath("//label[@id='j_idt87:country_label']");
    private By valuesinBoostrapDD = By.xpath("//ul[@id='j_idt87:country_items']//li");


    public DropdownPage(WebDriver driver) {
        this.driver = driver;
    }

    public void waysOfSelect(){
        WebElement dropDown = driver.findElement(selectDropdown);
        Select select = new Select(dropDown);
        select.selectByIndex(0);
    }

    public void getValues(){
        WebElement dropDown = driver.findElement(selectDropdown);
        Select select = new Select(dropDown);
        List<WebElement> options = select.getOptions();
        for (WebElement opt: options){
            String text = opt.getText();
            System.out.println(text);
        }
    }

    public void selectCountry(){
       WebElement dropdown =  driver.findElement(boostrapDropdown);
       dropdown.click();
        List<WebElement> elements = driver.findElements(valuesinBoostrapDD);
        for (WebElement countries : elements){
            String countryName = countries.getText();
            System.out.println(countryName);
        }
    }

}
