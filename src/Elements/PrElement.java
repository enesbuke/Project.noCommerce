package Elements;

import Utility.BaseDriverMethod;
import org.openqa.selenium.support.PageFactory;

public class PrElement extends BaseDriverMethod {
    public PrElement() {
        PageFactory.initElements(BaseDriverMethod.driver,this);



    }
}
