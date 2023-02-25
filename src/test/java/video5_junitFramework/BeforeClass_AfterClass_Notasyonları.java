package video5_junitFramework;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class BeforeClass_AfterClass_Notasyonları {
  @Test
    public void test01() {
        WebDriverManager.chromedriver();
        WebDriver diriver = new ChromeDriver();
        diriver.manage().window().maximize();
        diriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        diriver.get("https:www.amozon.com");
        WebElement aramaKutusu = diriver.findElement(By.id("twotabsearchtextbox"));
        aramaKutusu.sendKeys("Nutella");

        aramaKutusu.submit();
        WebElement sonucYazıElementi = diriver.findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']"));
        System.out.println(sonucYazıElementi.getText());
        diriver.close();
    }
}