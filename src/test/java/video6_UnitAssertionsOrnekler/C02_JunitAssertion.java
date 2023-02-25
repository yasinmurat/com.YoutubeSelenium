package video6_UnitAssertionsOrnekler;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C02_JunitAssertion {

    WebDriver driver;
    {
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }

    @Test
    public void test1(){
        //1-Navigate to url 'http://automationexercise.com'
        String url="http://automationexercise.com";
        driver.get(url);

        //2-Verify that home page is visible succesfully
        By logo=By.xpath("//img[@src='/static/images/home/logo.png']");
        boolean logoGoruntu=driver.findElement(logo).isDisplayed();
        Assert.assertTrue(logoGoruntu);

        //3-Click on 'Products' button
        By button=By.xpath("//i[@class='material-icons card_travel']");
        driver.findElement(button).click();

        //4-Veryfy user is navigated to All Products Page successfuly
        driver.findElement(logo).click();
        String expectedUrl="https://automationexercise.com/products";
        String actualUrl= driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl,actualUrl);

        //5- Enter product name in search input and click search button
       /* By searchbutton=By.xpath("//input[@id='search_product']");
        By buttonsearch=By.className("fa fa-search");
        driver.findElement(searchbutton).sendKeys("polo");
        driver.findElement(button).click();

        //6-Verify 'search Products' is visible
        By products=By.xpath("//img[@src='/get_product_picture/30']");
        boolean productgorunuyor=driver.findElement(products).isDisplayed();
        Assert.assertTrue(productgorunuyor);*/

        //7-Close Driver

        driver.quit();



    }
}
