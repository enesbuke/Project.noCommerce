package Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.awt.*;
import java.time.Duration;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BaseDriverMethod {

    public static WebDriver driver;
    public static WebDriverWait wait;

    @BeforeMethod
    public void baslangicIslemleri() {
        Logger logger = Logger.getLogger("");
        logger.setLevel(Level.SEVERE);

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
        driver.get("https://demo.nopcommerce.com");
    }

    @AfterMethod
    public void bitisIslemleri() {
        Func.Wait(5);
        driver.quit();
    }



}
