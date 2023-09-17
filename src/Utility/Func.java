package Utility;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Func {

    public static void Wait(int sn) {
        try {
            Thread.sleep(sn * 1000L);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    public static int createRandomNumb(int boundary){
        return (int)(Math.random()*boundary);
    }
    public void hoverFunction(WebElement element){
        Actions actions=new Actions(BaseDriverMethod.driver);
        Action action = actions.moveToElement(element).build();
        action.perform();
    }

}
