package Validations;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CurrentUrl {
    public static WebDriver driver;

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://openweathermap.org");

        System.out.println("Title is : "+ driver.getTitle());
        System.out.println("URL is : "+ driver.getCurrentUrl());
    }
}
