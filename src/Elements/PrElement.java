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
}