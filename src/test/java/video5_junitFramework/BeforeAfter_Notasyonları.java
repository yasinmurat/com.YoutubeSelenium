package video5_junitFramework;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class BeforeAfter_Notasyonları {
   static WebDriver driver;
    @BeforeClass
    public static void setup(){
        WebDriverManager.chromedriver();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

    }
    @AfterClass
    public static void tearDown(){
        driver.close();
    }
    @Test @Ignore
    public void test01(){
        driver.get("https:www.amazon.com");
    }
    @Test
    public void test02(){
        driver.get("https:www.facebook.com");

    }
    @Test
    public void test03(){
        driver.get("https:www.bestbuy.com");
    }
}
