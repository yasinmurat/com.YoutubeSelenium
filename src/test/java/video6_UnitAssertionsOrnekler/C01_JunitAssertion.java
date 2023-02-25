package video6_UnitAssertionsOrnekler;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_JunitAssertion {

    @Test
    public void test01(){

        // 1- Lunch Browser

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().window().maximize();

        //2- Navigate to url "http://automationexercise.com"

        driver.get("http://automationexercise.com");

        //3-Verify That home page is visible successfuly

        WebElement logoElementi=driver.findElement(By.xpath("//img[@src='/static/images/home/logo.png']"));

        Assert.assertTrue(logoElementi.isDisplayed());

        //4-Click on ' Signup\ login button

        WebElement signUpLinki=driver.findElement(By.xpath("//a[text()=' Signup / Login']"));
        signUpLinki.click();

        //5-Verfy 'Login to your account' is visable

        WebElement loginYazıElementi=driver.findElement(By.xpath("//h2[text()='Login to your account' ]"));
        Assert.assertTrue(loginYazıElementi.isDisplayed());

        //6- Correctemail address and password

        WebElement emailAderesKutusu=driver.findElement(By.xpath("//input[@data-qa='login-email']"));
        emailAderesKutusu.sendKeys("ahmet@nehaber.com");
        WebElement passwordKutusu=driver.findElement(By.xpath("//input[@data-qa='login-password']"));
        passwordKutusu.sendKeys("12345");

        //7-Click login Button

        WebElement loginButton=driver.findElement(By.xpath("//button[@data-qa='login-button']"));
        loginButton.click();

        // 8-Verfiy that ' Logged as user name' is visible

        WebElement loggedInYazısı=driver.findElement(By.xpath(" //a[text()=' Logged in as ']"));
        System.out.println(loggedInYazısı.getText());

        // 9-Click 'Logout' button

        WebElement logoutButton=driver.findElement(By.xpath(" //a[text()=' Logout']"));
        logoutButton.click();

        //10-Verify that user is navigated to login page

        String expectedUrl="https://automationexercise.com/login";
        String actualUrl=driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl,actualUrl);

        //11 Close driver

        driver.quit();






    }
}
