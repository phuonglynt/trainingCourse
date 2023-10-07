package com.training.serenity.defs;

import com.training.serenity.steps.GoogleSearchSteps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class TestGoogleSearch {
    @Steps
    GoogleSearchSteps googleSearchSteps;

    @Given("^I am on the Google homepage$")
    public void i_am_on_the_google_homepage() {
        googleSearchSteps.access_google_search();
    }

    @When("^I search keyword \"([^\"]*)\"$")
    public void i_search_keyword_something(String keyword) {
        googleSearchSteps.search_for_keyword(keyword);
    }

    @Then("^I should see a number of results$")
    public void i_should_see_a_number_of_results() {
        googleSearchSteps.check_result();
    }

}
