package Elements;

import Utility.BaseDriverMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class PrElement extends BaseDriverMethod {

    public PrElement() {
        PageFactory.initElements(BaseDriverMethod.driver, this);

    }

    //Case3-
    @FindBy(xpath = "//a[@class='ico-login']")//ENS anasayfa login button
    public WebElement loginButton;

    @FindBy(xpath = "//a[@class='ico-register']")//ENS anasayfa register button
    public WebElement regButton;

    @FindBy(css = "[id='Email']")//ENS login sayfası email label'ı
    public WebElement loginEmail;

    @FindBy(css="[id='Password']")//ENS login sayfası password label'ı
    public WebElement loginPassword;

    @FindBy(xpath = "//button[@class='button-1 login-button']")//ENS login sayfası login button'u
    public WebElement log_inButton;

    @FindBy(xpath = "//div[@class='message-error validation-summary-errors']") //login sayfası hatalı giriş mesajı
    public WebElement loginErrorMsg;
    //Case3-*

    //Case5-
    @FindBy(css = ".product-item")  //S
    public List<WebElement> productItems;

    @FindBy(css = ".product-name > h1") //S
    public WebElement chosenGiftCard;

    @FindBy(css = "#giftcard_43_RecipientName") //S
    public WebElement recipientName25;

    @FindBy(css = "#giftcard_43_SenderName")    //S
    public WebElement yourName25;

    @FindBy(css = "#giftcard_43_Message")   //S
    public WebElement messageField25;

    @FindBy(css = "#giftcard_43_RecipientEmail")    //S
    public WebElement recipientEmail25;

    @FindBy(css = "#giftcard_43_SenderEmail")   //S
    public WebElement yourEmail25;

    @FindBy(css = "#giftcard_44_RecipientName") //S
    public WebElement recipientName50;

    @FindBy(css = "#giftcard_44_SenderName")    //S
    public WebElement yourName50;

    @FindBy(css = "#giftcard_44_Message")   //S
    public WebElement messageField50;

    @FindBy(css = "#giftcard_45_RecipientName") //S
    public WebElement recipientName100;

    @FindBy(css = "#giftcard_45_SenderName")    //S
    public WebElement yourName100;

    @FindBy(css = "#giftcard_45_Message")   //S
    public WebElement messageField100;

    @FindBy(id = "add-to-cart-button-43")   //S
    public WebElement addToCart25;

    @FindBy(id = "add-to-cart-button-44")   //S
    public WebElement addToCart50;

    @FindBy(id = "add-to-cart-button-45")   //S
    public WebElement addToCart100;

    @FindBy(css = ".content")   //S
    public WebElement msg;

    @FindBy(css = "a[href='/gift-cards']") //S
    public WebElement giftCardsLink;

    @FindBy(xpath = "(//button[@class='button-2 product-box-add-to-cart-button'])[2]") //S
    public WebElement addToCardsLink;

    @FindBy(css = "p.content") //S
    public WebElement warningMessage;

    //Case5-*

    //Case6-
    @FindBy(xpath = "(//ul[@class='top-menu notmobile']/li/a)[1]")
    public WebElement computerS;

    @FindBy(xpath = "(//ul[@class='sublist first-level']/li/a)[1]")
    public WebElement desktopS;

    @FindBy(xpath = "(//h2[@class='product-title']/a)[1]")
    public WebElement buildOwnComp;

    @FindBy(xpath = "//select[@id='product_attribute_2']")
    public WebElement ramSelect;

    @FindBy(xpath = "//select[@id='product_attribute_2']/option[@data-attr-value]")
    public WebElement ramSelectContents;

    @FindBy(xpath = "//input[@name='product_attribute_3']")
    public WebElement hddButtons;

    @FindBy(xpath = "//button[@id='add-to-cart-button-1']")
    public WebElement BYOC_addToCardButton;

    @FindBy(xpath = "//p[@class='content']")
    public WebElement chckShopCard;

    //Case6-*

}