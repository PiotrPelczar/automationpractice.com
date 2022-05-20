import net.bytebuddy.utility.RandomString;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Random;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

public class TC {


    @Test
        public void Succesfull_login (){

        System.setProperty("webdriver.chrome.driver", "c:/Chromedriver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        Random random = new Random();
        int randomNumber = random.nextInt(100000);

        driver.manage().window().fullscreen();
        driver.manage().window().maximize();
        driver.navigate().to("http://automationpractice.com/index.php");
        driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);

        driver.findElement(By.cssSelector("#header > div.nav > div > div > nav > div.header_user_info > a")).click();
        driver.findElement(By.id("email_create")).sendKeys("email" + randomNumber + "donkey" + "@example.com");
        driver.findElement(By.id("SubmitCreate")).click();
        driver.findElement(By.cssSelector("#id_gender1")).click();
        driver.findElement(By.id("customer_firstname")).sendKeys("Adam");
        driver.findElement(By.id("customer_lastname")).sendKeys("Nowak");
        driver.findElement(By.id("passwd")).sendKeys("A" + randomNumber);
            driver.findElement(By.id("days")).sendKeys("23");
            driver.findElement(By.id("months")).click();
            driver.findElement(By.cssSelector("#months > option:nth-child(6)")).click();
            driver.findElement(By.id("years")).sendKeys("1990");
            driver.findElement(By.id("address1")).sendKeys("Polna " + randomNumber);
            driver.findElement(By.id("city")).sendKeys("Bolton");
            driver.findElement(By.id("id_state")).sendKeys("ken");
            driver.findElement(By.id("postcode")).sendKeys("12345");
            driver.findElement(By.id("phone_mobile")).sendKeys("0048" + randomNumber + randomNumber);
            driver.findElement(By.id("submitAccount")).click();

            Assert.assertEquals("http://automationpractice.com/index.php?controller=my-account", driver.getCurrentUrl());




    }

    @Test
    public void Succesfull_login_and_shopping (){

        System.setProperty("webdriver.chrome.driver", "c:/Chromedriver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        Random random = new Random();
        int randomNumber = random.nextInt(100000);

        driver.manage().window().fullscreen();
        driver.manage().window().maximize();
        driver.navigate().to("http://automationpractice.com/index.php");
        driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);

        driver.findElement(By.cssSelector("#header > div.nav > div > div > nav > div.header_user_info > a")).click();
        driver.findElement(By.id("email_create")).sendKeys("email" + randomNumber + "donkey" + "@example.com");
        driver.findElement(By.id("SubmitCreate")).click();
        driver.findElement(By.cssSelector("#id_gender1")).click();
        driver.findElement(By.id("customer_firstname")).sendKeys("Adam");
        driver.findElement(By.id("customer_lastname")).sendKeys("Nowak");
        driver.findElement(By.id("passwd")).sendKeys("A" + randomNumber);
        driver.findElement(By.id("days")).sendKeys("23");
        driver.findElement(By.id("months")).click();
        driver.findElement(By.cssSelector("#months > option:nth-child(6)")).click();
        driver.findElement(By.id("years")).sendKeys("1990");
        driver.findElement(By.id("address1")).sendKeys("Polna " + randomNumber);
        driver.findElement(By.id("city")).sendKeys("Bolton");
        driver.findElement(By.id("id_state")).sendKeys("ken");
        driver.findElement(By.id("postcode")).sendKeys("12345");
        driver.findElement(By.id("phone_mobile")).sendKeys("0048" + randomNumber + randomNumber);
        driver.findElement(By.id("submitAccount")).click();

        driver.navigate().to("http://automationpractice.com/index.php?id_product=1&controller=product");

        driver.findElement(By.name("Submit")).click();
        driver.findElement(By.cssSelector("#layer_cart > div.clearfix > div.layer_cart_cart.col-xs-12.col-md-6 > div.button-container > a > span")).click();
        driver.findElement(By.cssSelector("#center_column > p.cart_navigation.clearfix > a.button.btn.btn-default.standard-checkout.button-medium")).click();
        driver.findElement(By.cssSelector("#center_column > form > p > button > span")).click();
        driver.findElement(By.id("cgv")).click();
        driver.findElement(By.cssSelector("#form > p > button > span")).click();
        driver.findElement(By.cssSelector("#HOOK_PAYMENT > div:nth-child(1) > div > p > a")).click();
        driver.findElement(By.cssSelector("#cart_navigation > button")).click();


        WebElement oc = driver.findElement(By.id("order-confirmation"));
        Assert.assertEquals(true, oc.isDisplayed());
      
    }

    @Test

    public void Test (){
        System.setProperty("webdriver.chrome.driver", "c:/Chromedriver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        Random random = new Random();
        int randomNumber = random.nextInt(100000);

        driver.manage().window().fullscreen();
        driver.manage().window().maximize();
        driver.navigate().to("http://automationpractice.com/index.php?id_product=1&controller=product");
        driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);

        driver.findElement(By.name("Submit")).click();

    }
}
