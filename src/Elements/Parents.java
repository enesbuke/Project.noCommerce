package Elements;

import Utility.BaseDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Parents extends BaseDriver {


    public void hoveraction(WebElement element) {
        Actions actions = new Actions(driver);
        Action action = actions.moveToElement(element).build();//elementin üstüne gel
        action.perform();
    }

    public void clickactions(WebElement element) {
        Actions actions = new Actions(driver);
        actions.moveToElement(element).click().build().perform(); //elementin üstüne gel ve tıkla
    }

    public static int randomGenerator(int sinir) {

        return (int) (Math.random() * sinir);
    }

    }
