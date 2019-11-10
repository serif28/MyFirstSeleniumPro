package tests.SelfPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class LocatorsPracticeCSS {
    public static void main(String[] args) throws Exception {
        WebDriver driver = BrowserFactory.getDriver("chrome");
       // driver.manage().window().fullscreen();
        driver.get("http://practice.cybertekschool.com/registration_form");
        driver.findElement(By.cssSelector("input[name='firstname']")).sendKeys("Sheriff");
        driver.findElement(By.cssSelector("input[name='lastname']")).sendKeys("Giresunlu");
        driver.findElement(By.cssSelector("input[name='username']")).sendKeys("Username");
        driver.findElement(By.cssSelector("input[name='email']")).sendKeys("email@cybertek.com");
        driver.findElement(By.cssSelector("input[name='password']")).sendKeys("password");
        driver.findElement(By.cssSelector("input[name='phone']")).sendKeys("123-456-3232");
        driver.findElement(By.cssSelector("input[name='birthday']")).sendKeys("01/01/1990");
        driver.findElement(By.cssSelector("input[value='male']")).click();
        Select select = new Select(driver.findElement(By.cssSelector("select[name='department']")));
        select.selectByVisibleText("Mayor's Office");
        Select select2 = new Select(driver.findElement(By.cssSelector("select[name='job_title']")));
        select2.selectByVisibleText("SDET");

        driver.findElement(By.id("wooden_spoon")).click();
        Thread.sleep(2000);
        driver.quit();






    }
}
