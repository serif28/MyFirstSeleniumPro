package tests.SelfPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class DropDownPractice {
    static WebDriver driver = BrowserFactory.getDriver("chrome");

    public static void main(String[] args) throws Exception {
        setup();

//        selectByTextTest();
//
//        selectByValueTest();
//
//        selectByIndex();
//
//        multiSelectedDropdown();

        nonSelectDropdownTest();

        driver.close();
    }

    public static void setup(){
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("http://practice.cybertekschool.com/dropdown");

    }

    public static void selectByTextTest() throws Exception{
       // setup();
        Thread.sleep(2000);
        Select select = new Select(driver.findElement(By.id("dropdown")));
        select.selectByVisibleText("Option 2");
        Thread.sleep(2000);
    //    driver.close();
    }

    public static void selectByValueTest() throws Exception{
      //  setup();
        Thread.sleep(2000);
        Select select = new Select(driver.findElement(By.id("state")));
        select.selectByValue("AR");
        Thread.sleep(2000);

        String expected = "AZ";
        String actual = select.getFirstSelectedOption().getAttribute("value");
        System.out.println("Expected: " +expected);
        System.out.println("Actual: " +actual);
     //   driver.close();

    }

    public static void selectByIndex() throws Exception{
      //  setup();
        Thread.sleep(2000);
        Select select = new Select(driver.findElement(By.id("state")));
        select.selectByIndex(3);

        String expectedByIndex = "Arizona";
        String actualByIndex= select.getFirstSelectedOption().getText();

        System.out.println("Expected Value by Index: " +expectedByIndex);
        System.out.println("Actual Value by Index:: " +actualByIndex);

        Thread.sleep(2000);
    //    driver.close();
    }

    public static void multiSelectedDropdown() throws Exception{
      //  setup();
        Thread.sleep(2000);
        Select select = new Select(driver.findElement(By.name("Languages")));

        List<WebElement> options = select.getOptions();
        for (WebElement option: options){
            Thread.sleep(1000);
            select.selectByVisibleText(option.getText());
        }
        Thread.sleep(1000);

        List<WebElement> selectedOption = select.getAllSelectedOptions();
        for (WebElement option:selectedOption) {
            System.out.println(option.getText());
        }
        Thread.sleep(1000);
        select.deselectAll();
        Thread.sleep(1000);

      //  driver.close();
    }

    public static void nonSelectDropdownTest() throws Exception{
        WebElement dropDown = driver.findElement(By.id("dropdownMenuLink"));
        WebElement option = driver.findElement(By.xpath("//a[text()='Etsy']"));
        Thread.sleep(2000);

        dropDown.click();
        Thread.sleep(2000);
        option.click();
        Thread.sleep(2000);



    }


}
