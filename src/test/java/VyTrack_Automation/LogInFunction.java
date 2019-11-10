package VyTrack_Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.BrowserFactory;
import utils.BrowserUtils;

public class LogInFunction {

    public static void main(String[] args) {
        WebDriver driver = BrowserFactory.getDriver("chrome");
        driver.get("https://qa2.vytrack.com/user/login");
        WebElement inputBox = driver.findElement((By.name("_username")));
        inputBox.sendKeys("user163");
        WebElement inputBox2 = driver.findElement((By.name("_password")));
        inputBox2.sendKeys("UserUser123");
        WebElement loginButton = driver.findElement((By.name("_submit")));
        loginButton.click();
        BrowserUtils.wait(2);

        String expectedURL = "https://qa2.vytrack.com/";
        String actualURL = driver.getCurrentUrl();
        //System.out.println(actualURL);

        if(expectedURL.equals(actualURL)){
            System.out.println("Test passed");
        }else{
            System.out.println("Test Failed");
            System.out.println("Expected URL "+expectedURL);
            System.out.println("Actual URL: "+actualURL);
        }
        //wait for 1 seconds
        BrowserUtils.wait(1);
        driver.close();
    }
}
