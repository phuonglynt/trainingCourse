package com.training.serenity.steps;

import com.training.serenity.pages.GoogleHomePagev1;
import com.training.serenity.pages.GoogleResultPagev1;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;

public class GoogleSearchStepsv1 {
    GoogleHomePagev1 gSearchPagev1;
    GoogleResultPagev1 gResultPagev1;

    @Step
    public void access_google_search() {
        gSearchPagev1.open_the_google_search();
    }

    @Step
    public void search_for_keyword(String keyword) {
        gSearchPagev1.type_keyword_into_search_box(keyword);
        gSearchPagev1.click_search();
    }

    @Step
    public void type_keyword(String keyword){
        gSearchPagev1.type_keyword_into_search_box(keyword);
    }

    @Step
    public void click_search_btn(){
        gSearchPagev1.click_search();
    }

    @Step
    public void check_result() {
        int nbOfResults = gResultPagev1.get_number_of_results();
        Assert.assertTrue("Results not found", nbOfResults > 0);
    }


}
