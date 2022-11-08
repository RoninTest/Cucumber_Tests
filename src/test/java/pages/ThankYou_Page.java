package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Drivers;
import utilities.ReusableMethods;

public class ThankYou_Page extends ReusableMethods {
    public ThankYou_Page() {
        PageFactory.initElements(Drivers.getDriver(),this);
    }

    @FindBy (xpath = "//img[@alt='Thank you gift cards']")
    private WebElement thankYouGiftCards;

    public void thankYouItem(){
        click(thankYouGiftCards);
    }

    @FindBy (xpath = "//img[@alt='Thank You Gift Cards']")
    private WebElement thankYouPage;

    public void thankYouPage(){
        isThereItem(thankYouPage);
    }

}
