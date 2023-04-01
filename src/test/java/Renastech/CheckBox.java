package Renastech;

import Utilities.WebDriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class CheckBox {

    public static void main(String[] args) {
        WebDriver driver = WebDriverUtil.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://demo.guru99.com/test/radio.html");
        WebElement checkBox = driver.findElement(By.id("vfb-6-0"));
        if (!checkBox.isSelected()){
            System.out.println("CheckBox1 verification has passed");
        }else {
            System.out.println("CheckBox1 selected therefore verification has failed");
        }

        WebElement checkBox2 = driver.findElement(By.id("vfb-6-1"));
        checkBox2.click();

        if (checkBox2.isSelected()){
            System.out.println("CheckBox2 Verification has passed");
        }else System.out.println("CheckBox2 Verification has failed");

        driver.quit();


    }

}
