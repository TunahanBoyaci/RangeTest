package Day09;

import Utilities.BaseDriver;
import Utilities.MyMethods;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ActionClass2 extends BaseDriver {

    @Test
    public void test1(){
        driver.get("https://talkerscode.com/webtricks/demo/demo_price-range-slider-using-jquery-css-and-php.php");

        WebElement leftScroll = driver.findElement(By.cssSelector("span[style='left: 20%;']"));

        Actions actions = new Actions(driver);

        MyMethods.myWait(3);
        Action action = actions.dragAndDropBy(leftScroll, -200, 0).build();
        action.perform();

        waitAndQuit();


    }
}
