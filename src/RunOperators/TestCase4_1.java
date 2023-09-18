package RunOperators;

import Elements.PrElement;
import Utility.BaseDriverMethod;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase4_1 extends BaseDriverMethod {
    @Test
    public void US_04_TabMenu1(){
        PrElement pr=new PrElement();
        Assert.assertTrue(pr.headerMenu.isEnabled()); // menü etkinmi ?

        // Computer ve altındaki sekmelrin kontrolü
        {
            pr.hoveraction(pr.computers);
            pr.clickactions(pr.desktop);
            Assert.assertTrue(driver.getCurrentUrl().contains("/desktops"));
            pr.hoveraction(pr.computers);
            pr.clickactions(pr.notebooks);
            Assert.assertTrue(driver.getCurrentUrl().contains("/notebooks"));
            pr.hoveraction(pr.computers);
            pr.clickactions(pr.software);
            Assert.assertTrue(driver.getCurrentUrl().contains("/software"));
        }
        {
            // Electronics ve altındaki sekmelrin kontrolü
            pr.hoveraction(pr.electronics);
            pr.clickactions(pr.cameraAndPhoto);
            Assert.assertTrue(driver.getCurrentUrl().contains("/camera-photo"));
            pr.hoveraction(pr.electronics);
            pr.clickactions(pr.cellPhone);
            Assert.assertTrue(driver.getCurrentUrl().contains("/cell-phones"));
            pr.hoveraction(pr.electronics);
            pr.clickactions(pr.others);
            Assert.assertTrue(driver.getCurrentUrl().contains("/others"));
        }
        {
            // Apparel ve altındaki sekmelrin kontrolü
            pr.hoveraction(pr.apparel);
            pr.clickactions(pr.shoes);
            Assert.assertTrue(driver.getCurrentUrl().contains("/shoes"));
            pr.hoveraction(pr.apparel);
            pr.clickactions(pr.clothing);
            Assert.assertTrue(driver.getCurrentUrl().contains("/clothing"));
            pr.hoveraction(pr.apparel);
            pr.clickactions(pr.accessories);
            Assert.assertTrue(driver.getCurrentUrl().contains("/accessories"));
        }
        {
            // menüde görünen her elamana tıklar ve kontrol eder açıldımı diye .
            pr.computers.click();
            Assert.assertTrue(driver.getCurrentUrl().contains("/computers"));
            pr.electronics.click();
            Assert.assertTrue(driver.getCurrentUrl().contains("/electronics"));
            pr.apparel.click();
            Assert.assertTrue(driver.getCurrentUrl().contains("/apparel"));
            pr.digitalDownloads.click();
            Assert.assertTrue(driver.getCurrentUrl().contains("/digital-downloads"));
            pr.books.click();
            Assert.assertTrue(driver.getCurrentUrl().contains("/books"));
            pr.jewelry.click();
            Assert.assertTrue(driver.getCurrentUrl().contains("/jewelry"));
            pr.giftCards.click();
            Assert.assertTrue(driver.getCurrentUrl().contains("/gift-cards"));
        }

    }
}
