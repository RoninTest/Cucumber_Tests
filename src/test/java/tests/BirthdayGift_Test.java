package tests;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.BirthdayGift_Page;
import utilities.Drivers;

public class BirthdayGift_Test extends BirthdayGift_Page {
    @And("click birthdayOption")
    public void click_birthdayOption(){
        clickBirthdayItem();
    }
    @Then("verify BirthdayGiftPage")
    public void verify_BirthdayGiftPage(){
        assertBirthDayPage();
    }
    @And("close driver")
    public void close_driver(){
        Drivers.closeDriver();
    }
}
