package com.training.serenity.steps;

import com.training.serenity.pages.GoogleHomePage;
import com.training.serenity.pages.GoogleResultPage;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;

public class GoogleSearchSteps {
    GoogleHomePage googleSearchPage;
    GoogleResultPage googleResultPage;

    @Step
    public void access_google_search() {
        googleSearchPage.open();
        googleSearchPage.open_the_google_search();
    }

    @Step
    public void search_for_keyword(String keyword) {
        googleSearchPage.type_keyword_into_search_box(keyword);
        googleSearchPage.click_search();
    }

    @Step
    public void check_result() {
        int nbOfResults = googleResultPage.get_number_of_results();
        Assert.assertTrue("Results found", nbOfResults > 0);
    }


}
