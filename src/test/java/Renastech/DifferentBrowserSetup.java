package Renastech;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class DifferentBrowserSetup {
    public static void main(String[] args) {
       /* WebDriverManager.chromedriver().setup();
        WebDriver drive = new ChromeDriver();
        drive.get("https://www.google.com");*/

        WebDriverManager.edgedriver().setup();
        WebDriver driver = new EdgeDriver();

    }
}
