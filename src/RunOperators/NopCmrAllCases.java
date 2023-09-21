package RunOperators;

import Elements.Parents;
import Elements.PrElement;
import Utility.BaseDriver;
import Utility.Func;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class NopCmrAllCases extends BaseDriver {

    @Test
    public void US_01_Reg() {
        PrElement pr = new PrElement();

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

    @Test
    public void US_02_Login() {
        PrElement pr=new PrElement();

        pr.loginButton.click();
        pr.loginEmail.sendKeys("Test.can@gmail.com");
        pr.loginPassword.sendKeys("123456");
        pr.log_inButton.click();
        wait.until(ExpectedConditions.visibilityOf(pr.myAccButton));
        pr.hoveraction(pr.myAccButton);

        Assert.assertTrue(pr.myAccButton.isEnabled());

    }

    @Test(dataProvider = "loginData")
    public void US_03_LoginNegative(String username, String password) {
        PrElement pr=new PrElement();

        pr.loginButton.click();
        pr.loginEmail.sendKeys(username);
        pr.loginPassword.sendKeys(password);
        pr.log_inButton.click();

        if (username.contains("can")){
            wait.until(ExpectedConditions.visibilityOf(pr.myAccButton));
            pr.hoveraction(pr.myAccButton);
            Assert.assertTrue(pr.myAccButton.isEnabled());
        }
        else {
            Assert.assertTrue(pr.loginErrorMsg.getText().toLowerCase().contains("login was unsuccessful"));
        }
    }

    @DataProvider
    public Object[][] loginData() {
        Object[][] data = {
                {"firstTry@gmail.com", "FirstTry"},
                {"secondTry@gmail.com", "secTry"},
                {"thirdTry@hotmail.com", "thirdtry"},
                {"fourthTry@tyr.com", "fourthTry"},
                {"fifthtry@email.com", "fifthtry"},
                {"sixthtry@xmail.com", "sixthTry"},
                {"Test.can@gmail.com", "123456"}
        };
        return data;
    }

    @Test
    public void US_04_TabMenu1() {
        PrElement pr = new PrElement();
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

    @Test
    @Parameters("elements")
    public void US_04_TabMenu2(String elements) {
        PrElement pr = new PrElement();

        for (int i = 0; i < pr.listheader.size(); i++) {
            WebElement tabMenu = pr.listheader.get(i);
            System.out.println(tabMenu.getText());

        }
        pr.elementfindersText(pr.computers);
        pr.elementfindersText(pr.electronics);
        pr.elementfindersText(pr.apparel);


        pr.search.sendKeys(elements, Keys.ENTER);

        // random bir ürün seçildi .

        int randomSelect = PrElement.randomGenerator(pr.productTitle.size());
        wait.until(ExpectedConditions.urlContains(elements));

        List<String> stringList = new ArrayList<>();
        for (WebElement element : pr.productTitle) {
            stringList.add(element.getText());
        }
        new Actions(driver).scrollByAmount(200, 0);
        pr.productTitle.get(randomSelect).click();

        Assert.assertTrue(stringList.contains(pr.productName.getText()), "Bulunamadı");
    }

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


    @Test
    public void US_06_Order() {

        PrElement pr = new PrElement();

        pr.hoveraction(pr.computerS);
        pr.desktopS.click();
        wait.until(ExpectedConditions.visibilityOf(pr.buildOwnComp));
        pr.buildOwnComp.click();

        int chooseRandom = Parents.randomGenerator(pr.ramSelectContents.size());
        pr.ramSelectContents.get(chooseRandom).click();
        chooseRandom = Parents.randomGenerator(pr.hddButtonS.size());
        pr.hddButtonS.get(chooseRandom).click();

        new Actions(driver).scrollToElement(pr.BYOC_addToCardButton);
        Func.Wait(1);
        pr.BYOC_addToCardButton.click();
        wait.until(ExpectedConditions.visibilityOf(pr.chckShopCard));
        Assert.assertTrue(pr.chckShopCard.getText().toLowerCase().contains("the product has been added"));
    }


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
