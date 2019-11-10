package tests.SelfPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LocatorsPracticeXpath {
    public static void main(String[] args) throws Exception{
        WebDriver driver = BrowserFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/");
        driver.manage().window().fullscreen();
        WebElement dropDownLink = driver.findElement(By.xpath("html/body/div/div[2]/div/ul/li[11]/a"));
        System.out.println(dropDownLink.getText());
        dropDownLink.click();
        Thread.sleep(2000);
        driver.navigate().back();
        Thread.sleep(2000);
        WebElement headerText = driver.findElement(By.xpath("//span[@class='h1y']"));

        System.out.println("h1 Text is "+headerText.getText());

        //driver.navigate().back();
        WebElement contextMenu = driver.findElement(By.xpath("//a[.='Context Menu']"));
        contextMenu.click();

        driver.navigate().back();
        WebElement rgsFrom = driver.findElement(By.linkText("Registration Form"));
        rgsFrom.click();

        WebElement inputMenu = driver.findElement(By.xpath("//input[@value='male']"));
        Thread.sleep(3000);
        inputMenu.click();

        Thread.sleep(3000);

        driver.quit();

    }
}
