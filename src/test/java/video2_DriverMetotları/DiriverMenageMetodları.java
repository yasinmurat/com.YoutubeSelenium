package video2_DriverMetotları;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class DiriverMenageMetodları {
    public static void main(String[] args) {
        WebDriverManager.chromedriver();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        System.out.println( driver.manage().window().getSize());
        System.out.println(driver.manage().window().getPosition());
        driver.manage().window().setPosition(new Point(15,15));
        driver.manage().window().setSize(new Dimension(900,600));

        System.out.println("yeni pencere ölçüleri :"+driver.manage().window().getSize());
        System.out.println("yeni pencere ölçüleri :"+driver.manage().window().getPosition());

        driver.manage().window().maximize();
        System.out.println("maximises konum :" + driver.manage().window().getPosition());
        System.out.println("maximises konum :" + driver.manage().window().getSize());

        driver.manage().window().fullscreen();
        System.out.println("fullscreen konum :" + driver.manage().window().getPosition());
        System.out.println("fullscreen konum :" + driver.manage().window().getSize());

        driver.manage().window().minimize();

    }
}
