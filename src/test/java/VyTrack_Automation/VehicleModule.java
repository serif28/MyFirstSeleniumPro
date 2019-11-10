package VyTrack_Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.BrowserFactory;
import utils.BrowserUtils;

public class VehicleModule {

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

        WebElement fleetDropdown = driver.findElement(By.xpath("//span[@class=\'title title-level-1\']"));
        //WebElement fleetDropdown = driver.findElement(By.xpath("html/body/div[2]/div[2]/header/div[2]/ul/li/a"));

        fleetDropdown.click();

        WebElement vehicleDropdown = driver.findElement(By.xpath("//span[@class=\'title title-level-2\']"));
        vehicleDropdown.click();
        //System.out.println(vehicleElement);

        actualURL = driver.getCurrentUrl();
        expectedURL = "https://qa2.vytrack.com/entity/Extend_Entity_Carreservation";

        if(expectedURL.equals(actualURL)){

            System.out.println("TEST PASSED");
            BrowserUtils.wait(2);

        }else{
            System.out.println("Test Failed");
            System.out.println("Expected URL "+expectedURL);
            System.out.println("Actual title: "+actualURL);
        }
        //wait for 2 seconds
        BrowserUtils.wait(3);
        driver.quit();
    }

}
