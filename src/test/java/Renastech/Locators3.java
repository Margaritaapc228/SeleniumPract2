package Renastech;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators3 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.guru99.com/test/selenium-xpath.html");
        //second Xpath //tagname[.='text´]-looks for the exact text match
        WebElement TestingHeader = driver.findElement(By.xpath("//b[.='Testing']"));
        System.out.println(TestingHeader.getText());
        //Absolute Xpath
        WebElement TestingHeader2 = driver.findElement(By.xpath("html/body/div[4]/div[1]/div/h4[1]/b"));
        System.out.println(TestingHeader2.getText());
    }
}
