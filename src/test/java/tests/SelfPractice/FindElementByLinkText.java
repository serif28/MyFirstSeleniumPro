package tests.SelfPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class FindElementByLinkText {
    public static void main(String[] args) throws InterruptedException{
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("http://practice.cybertekschool.com");

        List<WebElement> allinks = driver.findElements(By.tagName("a"));
        System.out.println("Numbers of the links: "+allinks.size());


        WebElement link = driver.findElement(By.linkText("Autocomplete"));
        link.click();

        Thread.sleep(3000);

        driver.navigate().back();
        Thread.sleep(3000);

        //Find element by class partial link text
        WebElement link2 = driver.findElement(By.partialLinkText("Drag"));
        link2.click();
        Thread.sleep(3000);
        driver.quit();
    }
}
