package tests.SelfPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementByName {
    public static void main(String[] args) throws Exception{
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.cybertekschool.com/multiple_buttons");
        WebElement btn2 = driver.findElement(By.name("button2"));
        btn2.click();
        WebElement result = driver.findElement(By.id("result"));
        System.out.println(result.getText());
        Thread.sleep(5000);
        driver.quit();
    }
}
