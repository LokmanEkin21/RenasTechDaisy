package students.yasemin;


import code.utilities.WebDriverUtil;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;
public class Lab04 {
    WebDriver driver;
    @BeforeClass
    public void beforeClass(){
        System.out.println("BeforeClass is running");
    }
    @AfterClass
    public void afterClass(){
        System.out.println("AfterClass is running");
    }
    @BeforeMethod
    public void setUp(){
        WebDriver driver = WebDriverUtil.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://demo.guru99.com/test/newtours/register.php");
    }
    @Test
    public void TC1_verifyCountryFromDropDown() throws InterruptedException {
        System.out.println("Test1 is running");
        WebElement countryDropdownBox = driver.findElement(By.xpath("//select[@name='country']"));
        Select dropdown = new Select(countryDropdownBox);
        dropdown.selectByVisibleText("BARBADOS");
        Thread.sleep(5000);
    }
    @AfterMethod
    public void closing(){
        driver.quit();
    }
}



