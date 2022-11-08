package tests;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.ContactUs_Page;
import utilities.ConfigReader;
import utilities.Drivers;

public class ContactUs_Test extends ContactUs_Page {
    @Given("navigate to WebSite")
    public void navigate_to_web_site() {
        Drivers.getDriver().get(ConfigReader.getProperty("url"));
    }

    @And("click ContactUs element")
    public void click_contact_us_element() {
        clickContactUs();
    }
    @And("choose subject heading")
    public void choose_subject_heading() {
        enterYourName();
    }
    @And("enter your email")
    public void enter_your_email() {
        enterYourMail();
        enterYourPhone();
    }
    @And("type a message")
    public void type_a_message() {
        writeMessage();
    }
    @When("click send button")
    public void click_send_button() {
        clickButton();
    }
    @Then("verify your message has been sent")
    public void verify_your_message_has_been_sent() {
        assertionContactUs();
    }



}
