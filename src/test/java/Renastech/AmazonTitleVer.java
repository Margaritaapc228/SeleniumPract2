package Renastech;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonTitleVer {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com/");
        Thread.sleep(2000);
        driver.navigate().back();
        Thread.sleep(1000);
        driver.navigate().forward();
        Thread.sleep(2000);
        driver.navigate().to("https://amazon.com");

        String containsTitle = "Smile";
        String actualTitle = driver.getTitle();

        if (actualTitle.contains(containsTitle)) {
            System.out.println("Amazon title verification PASSED");
        }else{ System.out.println("Amazon title verification FAILED");}
    }
}
