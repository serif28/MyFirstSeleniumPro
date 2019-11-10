package VyTrack_Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.BrowserFactory;

public class LogInFunction_Negative {

    public static void main(String[] args) throws Exception{

        WebDriver driver = BrowserFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://qa2.vytrack.com/user/login");
        driver.findElement(By.name("_username")).sendKeys("Username");
        Thread.sleep(3000);

        driver.findElement(By.name("_password")).sendKeys("password");
        Thread.sleep(3000);

        driver.findElement(By.name("_submit")).click();
        Thread.sleep(3000);

        String message = driver.findElement(By.xpath("//div[contains(text(),'Invalid user name or password.')]")).getText();

        if(message.equalsIgnoreCase("Invalid user name or password.")){
            System.out.println("PASSED");
        } else {
            System.out.println("FAILED");
            System.out.println("Expected message : Invalid user name or password.");
            System.out.println("Actual message: " + message);
        }
        Thread.sleep(3000);
        driver.quit();
    }

}
