package Renastech;

import Utilities.WebDriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class ImplicitWait {
    public static void main(String[] args) {
        WebDriver driver = WebDriverUtil.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://www.vinexponewyork.com/");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(By.cssSelector("body > div.elementor.elementor-585 > div > div > section.elementor-section.elementor-top-section.elementor-element.elementor-element-6d0de3f.elementor-section-height-min-height.elementor-section-items-top.elementor-section-content-top.elementor-section-boxed.elementor-section-height-default > div.elementor-container.elementor-column-gap-default > div > div > div > div > div.elementor-element.elementor-element-a8fbc01.elementor-widget__width-auto.elementor-widget.elementor-widget-button.animated.zoomIn > div > div > a")).click();}
}
