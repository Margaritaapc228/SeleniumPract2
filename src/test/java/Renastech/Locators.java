package Renastech;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com");

        //linkText locator
        //driver.findElement(By.linkText("Gmail")).click();

        //PartiallinkText locator
        //driver.findElement(By.partialLinkText("Gma")).click();

        //class name locator
        driver.findElement(By.className("gb_q")).click();
    }
}
