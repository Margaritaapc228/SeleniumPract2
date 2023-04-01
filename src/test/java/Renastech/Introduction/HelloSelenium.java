package Renastech.Introduction;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HelloSelenium {
    public static void main(String[] args) {

        //create conection between selenium and browser
        WebDriverManager.chromedriver().setup();
        //create an instance or object of chromerdriver to be able to test
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
        System.out.println("URL is : "+ driver.getCurrentUrl());
    }
}
