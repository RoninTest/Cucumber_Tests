package tests;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.ThankYou_Page;

public class ThankYou_Test extends ThankYou_Page {

    @And("click thankYouOption")
    public void click_thankYouOption(){
        thankYouItem();
    }
    @Then("verify thankYouOption")
    public void verify_thankYouOption(){
        thankYouPage();

    }
}
