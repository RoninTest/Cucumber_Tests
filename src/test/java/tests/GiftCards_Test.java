package tests;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import pages.GiftsCards_Page;
import utilities.ConfigReader;
import utilities.Drivers;

public class GiftCards_Test extends GiftsCards_Page {
    @Given("Navigate to Website")
    public void navigate_to_website() {
        Drivers.getDriver().get(ConfigReader.getProperty("amazonUrl"));
    }
    @And("click gift cards")
    public void click_gift_cards() {
        clickGiftCard();
    }
}
