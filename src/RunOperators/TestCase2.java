package RunOperators;

import Elements.PrElement;
import Utility.BaseDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase2 extends BaseDriver {

    @Test
    public void US_02_Login(){

        PrElement pr=new PrElement();

        pr.loginButton.click();
        pr.loginEmail.sendKeys("Test.can@gmail.com");
        pr.loginPassword.sendKeys("123456");
        pr.log_inButton.click();
        wait.until(ExpectedConditions.visibilityOf(pr.myAccButton));
        pr.hoveraction(pr.myAccButton);
        Assert.assertTrue(pr.myAccButton.isEnabled());

    }
}
