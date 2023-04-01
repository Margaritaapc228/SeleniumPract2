package Validations;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.bouncycastle.util.test.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Title {
    public static WebDriver driver;

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver. manage().window().maximize();
        driver.get("https://rediff.com");

        //to get the title/url of the page
        //System.out.println("the title of rediff home page is  = " + driver.getTitle());
        String title = driver.getCurrentUrl();

        if (title.equals(driver.getCurrentUrl())){
            System.out.println("Test Case is PASS");
        }else System.out.println("Test Case FAIL");
    }
}
