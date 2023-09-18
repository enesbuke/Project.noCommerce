package RunOperators;

import Elements.PrElement;
import Utility.BaseDriverMethod;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestCase7 extends BaseDriverMethod {
    @Test
    @Parameters("msg")
    public void US_07_Search(String text){

        PrElement pr=new PrElement();
        pr.searchStore.sendKeys(text);
        pr.searchButton.click();
        pr.product.click();

        Assert.assertTrue(pr.productName.getText().contains("Adobe Photoshop CS4"));






    }
}
