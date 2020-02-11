package com.example;

import cucumber.api.DataTable;
import cucumber.api.java.en.*;

public class StepDefinitions {
    public Actionwords actionwords = new Actionwords();

    @Given("^I have launched the website \"(.*)\"$")
    public void iHaveLaunchedTheWebsiteP1(String p1) {
        actionwords.iHaveLaunchedTheWebsiteP1(p1);
    }

    @When("^I add the item to the cart$")
    public void iAddTheItemToTheCart() {
        actionwords.iAddTheItemToTheCart();
    }

    @Then("^the item \"(.*)\" should be added to cart$")
    public void theItemP1ShouldBeAddedToCart(String p1) {
        actionwords.theItemP1ShouldBeAddedToCart(p1);
    }

    @Then("^price should equal \"(.*)\"$")
    public void priceShouldEqualP1(String p1) {
        actionwords.priceShouldEqualP1(p1);
    }

    @Given("^I have searched for item \"(.*)\"$")
    public void iHaveSearchedForItemP1(String p1) {
        actionwords.iHaveSearchedForItemP1(p1);
    }

    @Given("^I have navigated to the Product page$")
    public void iHaveNavigatedToTheProductPage() {
        actionwords.iHaveNavigatedToTheProductPage();
    }
}