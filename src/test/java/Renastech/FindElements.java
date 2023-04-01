package Renastech;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class FindElements {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.apple.com");
        driver.findElement(By.xpath("//*[@id=\"globalnav-list\"]/li[2]/div/div/div[4]/ul/li[1]/a/span[1]")).click();

        //tag name locator 
        List<WebElement> allLinks = driver.findElements(By.tagName("a"));

        int linkWithText = 0;
        int linkWithoutText=0;

        for (WebElement eachLink:allLinks) {
            String ElemensToText =eachLink.getText();
            System.out.println(ElemensToText);

            if (ElemensToText.isEmpty()){
                linkWithoutText++;
            } else {
                linkWithText++;
            }
        }
        System.out.println("linkWithText  = "+ linkWithText);
        System.out.println("linkWithoutText  = "+ linkWithoutText);
        System.out.println("all the link size = "+allLinks.size());

    }
}
