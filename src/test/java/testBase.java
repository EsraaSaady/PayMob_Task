import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;

import java.time.Duration;

public class testBase {
   public static WebDriver driver;
   @BeforeClass
    public void test()
   {
       driver = new ChromeDriver();
       driver.manage().window().maximize();
       driver.get("https://magento.softwaretestingboard.com/");

   }
   @AfterClass
    public void quit()
   {
       driver.quit();
   }

}
