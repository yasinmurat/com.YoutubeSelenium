package video3_webElements;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class WebElementBestbuy {
    public static void main(String[] args) {
        WebDriverManager.chromedriver();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https:www.bestbuy.com");

       List<WebElement> buttonListesi= driver.findElements(By.tagName("button"));
        System.out.println(buttonListesi.size());

        for (WebElement each:buttonListesi) {
            System.out.println(each.getText());

        }


        driver.close();


    }
}
