package Renastech.Introduction;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElem {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://www.google.com");
        //driver.findElement(By.className("gLFyf")).sendKeys("Orange");
        //driver.findElement(By.name("btnK")).click();
        WebElement searchBoc = driver.findElement(By.className("gLFyf"));
        searchBoc.sendKeys("Orange");
        Thread.sleep(2000);
        driver.findElement(By.name("btnK")).click();

        String expectTitle = "orange";
        String acTitle = driver.getTitle();
        if (acTitle.startsWith(expectTitle)){
            System.out.println("Title verification PASS");
        }else{ System.out.println("Title verification FAIL");
            System.out.println("Actual title is: " + acTitle);}

        Thread.sleep(2000);
        driver.navigate().back();
        Thread.sleep(2000);
        searchBoc.sendKeys("banana");
        Thread.sleep(2000);
        driver.findElement(By.name("btnK")).click();

        String expect = "banana";
        String actual = driver.getTitle();
        if (actual.contains(expect)){
            System.out.println("Tittle pass for banana");
        }else {System.out.println("Banana verification failed");
            System.out.println("Actual title is: " + actual);}

    }
}
