package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Drivers;
import utilities.ReusableMethods;

public class ContactUs_Page extends ReusableMethods {
    public ContactUs_Page() {
        PageFactory.initElements(Drivers.getDriver(),this);
    }

    @FindBy(id = "contact-link")
    private WebElement contactlink;

    public void clickContactUsButton(){
        click(contactlink);
    }

    @FindBy (xpath = "//a[contains(text(),'Contact Us')]")
    private WebElement contactUs;

    public void clickContactUs(){
        click(contactUs);
    }

    @FindBy (id = "name")
    private WebElement name;

    public void enterYourName(){
        sendKeys(name, "Ronin roni");
    }

    @FindBy (id="email")
    private WebElement email;

    public void enterYourMail(){
        sendKeys(email,"aaaa1@gmail.com");
    }

    @FindBy(id="phone")
    private WebElement phone;

    public void enterYourPhone(){
        sendKeys(phone,"0556743432423");
    }

    @FindBy (id = "message")
    private WebElement message;

    public void writeMessage(){
        sendKeys(message,"Hello , I am Ronin. I want to close my account.");
    }

    @FindBy (xpath = "//input[@value='Log In']")
    private WebElement button;

    public void clickButton(){
        click(button);
    }
    @FindBy (xpath = "//p[contains(text(),'Please enter a username and password.')]")
    private WebElement lastWriting;


    public void assertionContactUs(){
        assertion(lastWriting,"Please enter a username and password.");
    }




}
