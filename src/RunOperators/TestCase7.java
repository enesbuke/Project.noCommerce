package RunOperators;

import Elements.PrElement;
import Utility.BaseDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestCase7 extends BaseDriver {
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
