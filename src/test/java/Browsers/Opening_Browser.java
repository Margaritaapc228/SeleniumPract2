package Browsers;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.io.FileReader;

public class Opening_Browser {

    public static WebDriver driver;
    static String Browser = "safari";

    public static void main(String[] args) {

       if (Browser.equals("chrome")){
           WebDriverManager.chromedriver().setup();
           driver = new ChromeDriver();
           driver.manage().window().maximize();
           driver.get("https://rediff.com");
       }else if(Browser.equals("safari")){
           WebDriverManager.safaridriver().setup();
           driver = new SafariDriver();
           driver.manage().window().maximize();
           driver.get("https://rediff.com");
       }else {
           WebDriverManager.edgedriver().setup();
           driver = new EdgeDriver();
           driver.manage().window().maximize();
           driver.get("https://rediff.com");
       }
    }
}
