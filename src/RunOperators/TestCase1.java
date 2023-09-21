package RunOperators;

import Elements.PrElement;
import Utility.BaseDriver;
import Utility.Func;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class TestCase1 extends BaseDriver {

    @Test
    public void US_01_Reg(){
            PrElement pr=new PrElement();

            pr.register.click();
            Func.Wait(2);
            pr.cinsiyet.click();
            Func.Wait(2);
            pr.firstname.sendKeys("can");
            Func.Wait(2);
            pr.lastname.sendKeys("can");
            Func.Wait(2);
            WebElement day = driver.findElement(By.cssSelector("select[name='DateOfBirthDay']"));
            WebElement month = driver.findElement(By.xpath("//select[@name='DateOfBirthMonth']"));
            WebElement year = driver.findElement(By.cssSelector("select[name='DateOfBirthYear']"));
            Select gun = new Select(day);
            Func.Wait(2);
            Select ay = new Select(month);
            Func.Wait(2);
            Select yil = new Select(year);
            Func.Wait(2);
            gun.selectByValue("21");
            ay.selectByValue("4");
            yil.selectByValue("1997");
            pr.email.sendKeys("Test.can@gmail.com");
            Func.Wait(2);
            pr.company.sendKeys("Techno study");
            Func.Wait(2);
            new Actions(driver).scrollByAmount(0, 1000).build().perform();
            pr.password.sendKeys("123456");
            Func.Wait(2);
            pr.confirmPassword.sendKeys("123456");
            Func.Wait(2);
            pr.Button.click();
            Func.Wait(2);
            pr.contine.click();



        }
    }






