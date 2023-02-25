package video3_webElements;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class WebelEmentFacebook {
    public static void main(String[] args) {
        WebDriverManager.chromedriver();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https:www.facebook.com");
       WebElement epostaKutusu=  driver.findElement(By.xpath("//input[@id='email']"));
       epostaKutusu.sendKeys("dnksjkfss");
       WebElement sifreKutusu=driver.findElement(By.xpath("//input[@id='pass']"));
       sifreKutusu.sendKeys("kjrhfkjhfşkj");
       driver.findElement(By.xpath("//button[@name='login']")).click();
       WebElement sonucYaziElementi=driver.findElement(By.xpath("//div[@class='_9ay7']"));
       String expectedSonucYazisi="Girdiğin e-posta veya cep telefonu numarası bir hesaba bağlı değil. Hesabını bul ve giriş yap.";
       System.out.println(sonucYaziElementi.getText());
        if (expectedSonucYazisi.equals(expectedSonucYazisi)){
            System.out.println("girilemedi testi pass");
        }else {
            System.out.println("grilemedi testi pass");
        }


                driver.close();

    }
}
