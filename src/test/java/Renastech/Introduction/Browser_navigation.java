package Renastech.Introduction;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser_navigation {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().fullscreen();
        Thread.sleep(5000);
        driver.get("https://www.apple.com");
        driver.navigate().back();
        Thread.sleep(3000);
        driver.navigate().forward();
        //it will close the tab
        //driver.close();
        driver.quit();
    }
}
