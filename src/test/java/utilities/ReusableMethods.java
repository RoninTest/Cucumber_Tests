package utilities;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public abstract class ReusableMethods {

    WebDriverWait wait=new WebDriverWait(Drivers.getDriver(), Duration.ofSeconds(20));

    public void openWebDriver(String url){
        Drivers.getDriver().get(ConfigReader.getProperty(url));
    }

    public void click(WebElement clickableElement){

        wait.until(ExpectedConditions.elementToBeClickable(clickableElement));
        clickableElement.click();

    }

    public void sendKeys(WebElement sendKeysItem,String value){
        wait.until(ExpectedConditions.visibilityOf(sendKeysItem));
        sendKeysItem.sendKeys(value);
    }

    public void selectDropDown(WebElement dropdown,String element){
        Select slc=new Select(dropdown);
        slc.selectByVisibleText(element);
    }


    public void getText(WebElement textElement){
        textElement.getText();
    }

    public void assertion(WebElement actual, String expected){

        wait.until(ExpectedConditions.visibilityOf(actual));
        Assert.assertEquals(actual.getText(),expected);

        System.out.println(actual.getText());

    }

    public void isThereItem(WebElement item){
        Assert.assertTrue(item.isDisplayed());
    }
}
