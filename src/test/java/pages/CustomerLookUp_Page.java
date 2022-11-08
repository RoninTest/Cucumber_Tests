package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Drivers;
import utilities.ReusableMethods;



public class CustomerLookUp_Page extends ReusableMethods {
    public CustomerLookUp_Page() {
        PageFactory.initElements(Drivers.getDriver(),this);
    }

    @FindBy (xpath = "//a[contains(text(),'Forgot login info?')]")
    private WebElement loginInfoLink;

    public void clickLink(){
        click(loginInfoLink);
    }

    @FindBy (id = "firstName")
    private WebElement firstNameField;

    public void fillFirstName(String firstName){
        sendKeys(firstNameField,firstName);
    }

    @FindBy (id = "lastName")
    private WebElement lastNameField;

    public void fillLastName(String lastName){
        sendKeys(lastNameField,lastName);
    }

    @FindBy(id = "address.street")
    private WebElement addressField;

    public void fillAddressField(String address){
        sendKeys(addressField,address);
    }

    @FindBy(id = "address.city")
    private WebElement cityField;

    public void fillCityField(String city){
        sendKeys(cityField,city);
    }

    @FindBy(id = "address.state")
    private WebElement stateField;

    public void fillStateField(String state){
        sendKeys(stateField,state);
    }

    @FindBy(id = "address.zipCode")
    private WebElement zipField;

    public void fillZipField(String zipcode){
        sendKeys(zipField,zipcode);
    }

    @FindBy(id = "ssn")
    private WebElement ssnField;

    public void fillSSNField(String ssn){
        sendKeys(ssnField,ssn);
    }

    @FindBy(xpath = "//input[@value='Log In']")
    private WebElement button;

    public void clickButton(){
        click(button);
    }

    @FindBy(xpath = "//p[contains(text(),'Please enter a username and password.')]")
    private WebElement assertCustomerInfo;

    public void assertCustomerInfo(){
        assertion(assertCustomerInfo,"Please enter a username and password.");
            }



}
