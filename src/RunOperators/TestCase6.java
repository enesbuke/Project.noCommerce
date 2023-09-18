package RunOperators;

import Elements.Parents;
import Elements.PrElement;
import Utility.BaseDriverMethod;
import Utility.Func;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase6 extends BaseDriverMethod {
    @Test
    public void US_06_Order(){

        PrElement pr=new PrElement();

        pr.hoveraction(pr.computerS);
        pr.desktopS.click();
        wait.until(ExpectedConditions.visibilityOf(pr.buildOwnComp));
        pr.buildOwnComp.click();

        int chooseRandom=Parents.randomGenerator(pr.ramSelectContents.size());
        pr.ramSelectContents.get(chooseRandom).click();
        chooseRandom=Parents.randomGenerator(pr.hddButtonS.size());
        pr.hddButtonS.get(chooseRandom).click();

        new Actions(driver).scrollToElement(pr.BYOC_addToCardButton);
        Func.Wait(1);
        pr.BYOC_addToCardButton.click();
        wait.until(ExpectedConditions.visibilityOf(pr.chckShopCard));
        Assert.assertTrue(pr.chckShopCard.getText().toLowerCase().contains("the product has been added"));





    }
}
