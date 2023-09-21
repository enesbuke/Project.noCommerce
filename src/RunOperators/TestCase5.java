package RunOperators;

import Elements.PrElement;
import Utility.BaseDriver;
import Utility.Func;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.Set;

public class TestCase5 extends BaseDriver {

    PrElement pr;
    String[] messages = {"İyi günlerde kullanın!",
            "Keyifli alışverişler!",
            "Sevdiklerinizle beraber kullanın!"};

    @Test(priority = 1)
    public void US_05_GiftOrder() throws AWTException {
        pr = PageFactory.initElements(driver, PrElement.class);

        Robot robot = new Robot();
        Set<String> windowHandles = driver.getWindowHandles();

        for (String handle : windowHandles) {
            driver.switchTo().window(handle);
            if (driver.getTitle().contains("Upload")) {
                break;
            }
        }

        for (int i = 0; i < 15; i++) {
            robot.keyPress(KeyEvent.VK_TAB);
            robot.keyRelease(KeyEvent.VK_TAB);
        }

        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);

        Func.Wait(1);

        int randomProducts = BaseDriver.generalRandom(0, pr.productItems.size() - 1);
        pr.productItems.get(randomProducts).click();

        inputRandomValues(pr);

    }
    public void inputRandomValues(PrElement pr) {

        String chosenGiftCard = pr.chosenGiftCard.getText();
        String randomUsername = "User" + BaseDriver.generalRandom(1000, 9999);
        String randomRecipientEmail = "recipient" + BaseDriver.generalRandom(1000, 9999) + "@test.com";
        String randomSenderName = "Sender" + BaseDriver.generalRandom(1000, 9999);
        String randomSenderEmail = "sender" + BaseDriver.generalRandom(1000, 9999) + "@test.com";
        String randomMessage = messages[BaseDriver.generalRandom(0, messages.length - 1)];

        switch (chosenGiftCard) {
            case "$25 Virtual Gift Card":
                pr.recipientName25.sendKeys(randomUsername);
                pr.recipientEmail25.sendKeys(randomRecipientEmail);
                pr.yourName25.sendKeys(randomSenderName);
                pr.yourEmail25.sendKeys(randomSenderEmail);
                pr.messageField25.sendKeys(randomMessage);
                pr.addToCart25.click();
                break;

            case "$50 Physical Gift Card":
                pr.recipientName50.sendKeys(randomUsername);
                pr.yourName50.sendKeys(randomSenderName);
                pr.messageField50.sendKeys(randomMessage);
                pr.addToCart50.click();
                break;

            case "$100 Physical Gift Card":
                pr.recipientName100.sendKeys(randomUsername);
                pr.yourName100.sendKeys(randomSenderName);
                pr.messageField100.sendKeys(randomMessage);
                pr.addToCart100.click();
                break;
        }

        String actualMessage = pr.msg.getText();
        String expectedMessage = "The product has been added to your shopping cart";
        Assert.assertEquals(actualMessage, expectedMessage, "Ürün sepete eklenemedi.");
    }

        @Test(dataProvider = "inputData", priority = 2)
        public void TestCase5NegativeMessage(String recipientName, String yourName, String message) {

            pr = PageFactory.initElements(driver, PrElement.class);

            pr.giftCardsLink.click();
            pr.addToCardsLink.click();

            pr.recipientName50.sendKeys(recipientName);
            pr.yourName50.sendKeys(yourName);
            pr.messageField50.sendKeys(message);

            pr.addToCart50.click();

            String actualWarningText = pr.warningMessage.getText();
            System.out.println("Please fill in the required fields: " + actualWarningText);
        }

        @DataProvider(name = "inputData")
        public Object[][] dataProviderMethod() {
        return new Object[][]{
                {"Team8", "", "İyi günlerde kullanın!"},
                {"", "Techno", ""}};
    }
    }

