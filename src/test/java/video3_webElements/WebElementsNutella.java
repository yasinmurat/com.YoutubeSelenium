package video3_webElements;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class WebElementsNutella {
    public static void main(String[] args) {
        WebDriverManager.chromedriver();
        WebDriver diriver = new ChromeDriver();
        diriver.manage().window().maximize();
        diriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        diriver.get("https:www.amozon.com");
        WebElement aramaKutusu = diriver.findElement(By.id("twotabsearchtextbox"));
        aramaKutusu.sendKeys("Nutella");

        aramaKutusu.submit();
        WebElement sonucYazıElementi=diriver.findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']"));
        System.out.println(sonucYazıElementi.getText());
        diriver.close();
    }
}
