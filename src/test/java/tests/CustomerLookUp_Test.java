package tests;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.CustomerLookUp_Page;
import utilities.Drivers;

public class CustomerLookUp_Test extends CustomerLookUp_Page {

    @And("click forgot and register link")
    public void click_forgot_and_register_link() {
        clickLink();
    }
    @And("fill firstname {string}")
    public void fill_firstname(String firstname) {
        fillFirstName(firstname);
    }
    @And("fill lastname {string}")
    public void fill_lastname(String lastname) {
        fillLastName(lastname);
    }
    @And("fill address {string}")
    public void fill_address(String address) {
        fillAddressField(address);
    }
    @And("fill city {string}")
    public void fill_city(String city) {
        fillCityField(city);
    }
    @And("fill state {string}")
    public void fill_state(String state) {
        fillStateField(state);
    }
    @And("fill zipcode {string}")
    public void fill_zipcode(String zipcode) {
        fillZipField(zipcode);
    }
    @And("fill ssn {string}")
    public void fill_ssn(String ssn) {
        fillSSNField(ssn);
    }
    @When("click findMyLoginInfo button")
    public void click_find_my_login_info_button() {
        clickButton();
    }
    @Then("verify the message")
    public void verify_the_message() {
        assertCustomerInfo();
        Drivers.closeDriver();
    }

}
