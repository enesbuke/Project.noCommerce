package Elements;

import java.util.Random;

public class Parents {
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

    public void elementfindersText(WebElement element) {
        hoveraction(element);
        for (WebElement e : subtabs) {
            System.out.println(e.getText());
        }
    }

    //Rasgele bir sayi uretmek icin
    public static int generalRandom(int min, int max) {
        Random rnd = new Random();
        return rnd.nextInt((max - min) + 1) + min;

    }
}
