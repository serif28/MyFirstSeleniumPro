package tests.SelfPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsPractice {
    public static void main(String[] args) throws Exception {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://google.com");
        WebElement btn1 = driver.findElement(By.id("gbqfbb"));
        String actualText = btn1.getAttribute("value");
        String expectedText = "I'm FeelingLucky";

        if (actualText.contains(expectedText)){
            System.out.println("PASSED");
        } else {
            System.out.println("FAILED");
            System.out.println("Actual Text: "+actualText);
            System.out.println("Expected Text: "+expectedText);
        }
        Thread.sleep(5000);


        driver.quit();
    }


}
