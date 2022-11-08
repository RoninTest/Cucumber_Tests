package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Drivers;
import utilities.ReusableMethods;

public class BirthdayGift_Page extends ReusableMethods {
    public BirthdayGift_Page() {
        PageFactory.initElements(Drivers.getDriver(),this);
    }
    @FindBy (xpath = "//img[@alt='Birthday gift cards']")
    private WebElement birthdayGiftItem;

    public void clickBirthdayItem(){
        click(birthdayGiftItem);
    }

    @FindBy (xpath = "//img[@alt='Birthday Gift Cards Header']")
    private WebElement birthDayPage;

    public void assertBirthDayPage(){
    isThereItem(birthDayPage);
    }
}
