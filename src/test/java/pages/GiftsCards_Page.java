package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Drivers;
import utilities.ReusableMethods;

public class GiftsCards_Page extends ReusableMethods {
    public GiftsCards_Page() {
        PageFactory.initElements(Drivers.getDriver(),this);
    }
    @FindBy (xpath = "//a[contains(text(),'Gift Cards')]")
    private WebElement giftCards;

    @FindBy(xpath = "//input[@data-action-type='DISMISS']")
    private WebElement dismiss;

    public void clickGiftCard(){
        click(dismiss);
        click(giftCards);
    }
}
