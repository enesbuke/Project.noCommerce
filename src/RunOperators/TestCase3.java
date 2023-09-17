package RunOperators;

import Elements.PrElement;
import Utility.BaseDriverMethod;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestCase3 extends BaseDriverMethod {
    @Test(dataProvider = "loginData")
    public void US_03_LoginNegative(String username,String password){

        PrElement pr=new PrElement();

        pr.loginButton.click();
        pr.loginEmail.sendKeys(username);
        pr.loginPassword.sendKeys(password);
        pr.log_inButton.click();
        Assert.assertTrue(pr.loginErrorMsg.getText().toLowerCase().contains("login was unsuccessful"));
    }

    @DataProvider
    public Object[][] loginData(){
        Object[][] data={
                {"firstTry@gmail.com","FirstTry"},
                {"secondTry@gmail.com","secTry"},
                {"thirdTry@hotmail.com","thirdtry"},
                {"fourthTry@tyr.com","fourthTry"},
                {"fifthtry@email.com","fifthtry"},
                {"sixthtry@xmail.com","sixthTry"},
        };
        return data;
    }

}
