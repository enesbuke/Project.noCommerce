package Utility;

import Elements.PrElement;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BaseDriver {

    public static WebDriver driver;
    public static WebDriverWait wait;

    @BeforeMethod
    public void startAnnotation() {
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
    public void finishAnnotation() {
        Func.Wait(3);
        driver.quit();
    }

    //Rasgele bir sayi uretmek icin
    public static int generalRandom(int min, int max) {
        Random rnd = new Random();
        return rnd.nextInt((max - min) + 1) + min;

    }
    @AfterMethod
    public void SS(ITestResult result){
        if (ITestResult.FAILURE == result.getStatus()) {
            // Test failed, take a screenshot
            TakesScreenshot ts = (TakesScreenshot) driver;
            File source = ts.getScreenshotAs(OutputType.FILE);
            String screenshotName = result.getName() + "_" + System.currentTimeMillis() + ".png";
            File destination = new File("C:/Users/Alperen Şanlı/Desktop/tester projeleri/NOopCommerceTest/src/ErrorScreeanShot" + screenshotName);
            try {
                FileHandler.copy(source, destination);
                System.out.println("Screenshot taken: " + screenshotName);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
