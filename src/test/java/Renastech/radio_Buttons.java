package Renastech;

import Utilities.WebDriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class radio_Buttons {

    public static void main(String[] args) {

    WebDriver driver = WebDriverUtil.getDriver("chrome");
    driver.manage().window().maximize();
    driver.get("https://www.letskodeit.com/practice");
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    WebElement BMWRadioButton = driver.findElement(By.xpath("//input[@id= 'bmwradio']"));
    BMWRadioButton.click();

    boolean bmwRadioSelector=BMWRadioButton.isSelected();
    if (bmwRadioSelector){
        System.out.println( "BMW is selected");
    }else {
        System.out.println( "BMW is not selected");
        System.out.println( "Selected has failed");
    }
    WebElement hondaSelector = driver.findElement(By.id("hondaradio"));
    if (!hondaSelector.isSelected()){
        System.out.println("HONDA is not selected - test pased");
    }else {
        System.out.println("HONDA buttonis selected - test failed");
    }
    }
}
