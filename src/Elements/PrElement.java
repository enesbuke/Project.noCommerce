package Elements;

import Utility.BaseDriverMethod;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class PrElement extends Parents {

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

    @FindBy(css = "[id='Password']")//ENS login sayfası password label'ı
    public WebElement loginPassword;

    @FindBy(xpath = "//button[@class='button-1 login-button']")//ENS login sayfası login button'u
    public WebElement log_inButton;

    @FindBy(xpath = "//div[@class='message-error validation-summary-errors']") //login sayfası hatalı giriş mesajı
    public WebElement loginErrorMsg;
    //Case3-*
    //Case4.1 - 4.2-

    @FindBy(xpath = "//div[@class='header-menu']")  // başlangıç menü
    public List<WebElement> listheader;
    @FindBy(xpath = "//ul[@class='sublist first-level']") // alt menü
    public List<WebElement> subtabs;
    @FindBy(xpath = "//div[@class='header-menu']")
    public WebElement headerMenu;
    @FindBy(xpath = "//*[text()='Computers ']")     // Copmuter sekmesi
    public WebElement computers;                   //
    @FindBy(xpath = "//a[text()='Desktops ']")      // Computer sekmesinin altındaki desktops
    public WebElement desktop;                     //
    @FindBy(xpath = " //a[text()='Notebooks ']")    // Computer sekmesinin altındaki Notebooks
    public WebElement notebooks;                   //
    @FindBy(xpath = " //a[text()='Software ']")     // Computer sekmesinin altındaki Software
    public WebElement software;                    //

    @FindBy(linkText = "Electronics")                  // Electronics sekmesi
    public WebElement electronics;                    //
    @FindBy(xpath = " //a[text()='Camera & photo ']")  // Electronics sekmesinin altındaki Camera & photo
    public WebElement cameraAndPhoto;                 //
    @FindBy(xpath = " //a[text()='Cell phones ']")    // Electronics sekmesinin altındaki Cell phones
    public WebElement cellPhone;                     //
    @FindBy(xpath = " //a[text()='Others ']")       // Electronics sekmesinin altındaki Others
    public WebElement others;


    @FindBy(xpath = "//*[text()='Apparel ']")        // Apparel sekmesi
    public WebElement apparel;                      //
    @FindBy(xpath = " //a[text()='Shoes ']")         //Apparel sekmesinin altındaki Shoes
    public WebElement shoes;                        //
    @FindBy(xpath = " //a[text()='Clothing ']")      //Apparel sekmesinin altındaki Clothing
    public WebElement clothing;                     //
    @FindBy(xpath = " //a[text()='Accessories ']")  //Apparel sekmesinin altındaki Accessories
    public WebElement accessories;                 //


    @FindBy(xpath = "//*[text()='Digital downloads ']")  //Digital downloads sekmesi
    public WebElement digitalDownloads;                 //
    @FindBy(xpath = "//*[text()='Books ']")              //Books sekmesi
    public WebElement books;                            //
    @FindBy(xpath = "//*[text()='Jewelry ']")            //Jewelry sekmesi
    public WebElement jewelry;                          //
    @FindBy(xpath = "//*[text()='Gift Cards ']")         //Gift Cards sekmesi
    public WebElement giftCards;                        //

    @FindBy(id = "small-searchterms")         //Gift Cards sekmesi
    public WebElement search;                //


    @FindBy(xpath = "//div[@class='details']")   // Ürün detayları
    public List<WebElement> details;            //

    @FindBy(xpath = "//h2[@class='product-title']/a")      //Ürün ismileri
    public List<WebElement> productTitle;              //

    @FindBy(xpath = "//div[@class='product-name']")
    public WebElement productName;

    //Case4.1- 4.2-*
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

    @FindBy(xpath = "//select[@id='product_attribute_2']/option[@data-attr-value]")
    public List<WebElement> ramSelectContents;

    @FindBy(xpath = "//input[@name='product_attribute_3']")
    public List<WebElement> hddButtonS;

    @FindBy(xpath = "//button[@id='add-to-cart-button-1']")
    public WebElement BYOC_addToCardButton;

    @FindBy(xpath = "//p[@class='content']")
    public WebElement chckShopCard;

    //Case6-*

    //Case7-

    @FindBy(name = "q")
    public WebElement searchStore;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement searchButton;

    @FindBy(xpath = "//a[text()='Adobe Photoshop CS4']")
    public WebElement product;

    public void elementfindersText(WebElement element) {
        hoveraction(element);
        for (WebElement e : subtabs) {
            System.out.println(e.getText());
        }

    }
    @FindBy(linkText = "Register")
    public WebElement  register ;
    @FindBy(css = "input[id='gender-male']")
    public WebElement cinsiyet;
    @FindBy(css = "input[id='FirstName']")
    public WebElement firstname;
    @FindBy(css = "input[id='LastName']")
    public WebElement  lastname;
    @FindBy(css = "input[id='Email']")
    public WebElement email  ;
    @FindBy(css = "input[id='Company']")
    public WebElement  company  ;
    @FindBy(css = "input[id='Password']")
    public WebElement password ;
    @FindBy(css = "input[id='ConfirmPassword']")
    public WebElement confirmPassword ;
    @FindBy(css = "button[id='register-button']")
    public WebElement Button ;
    @FindBy(linkText = "Devam etmek")
    public WebElement contine ;

}