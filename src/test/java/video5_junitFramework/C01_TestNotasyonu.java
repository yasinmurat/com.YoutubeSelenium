package video5_junitFramework;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_TestNotasyonu {
    @Test
    public void test01() {
        WebDriverManager.chromedriver();
        WebDriver diriver = new ChromeDriver();
        diriver.manage().window().maximize();
        diriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        diriver.get("https:www.amozon.com");
        diriver.close();
    }
    @Test
    public void test02() {
        WebDriverManager.chromedriver();
        WebDriver diriver = new ChromeDriver();
        diriver.manage().window().maximize();
        diriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        diriver.get("https:www.facebook.com");
        diriver.close();
    }
    @Test
    public void test03() {
        WebDriverManager.chromedriver();
        WebDriver diriver = new ChromeDriver();
        diriver.manage().window().maximize();
        diriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        diriver.get("https:www.bestbuy.com");
        diriver.close();
}
}