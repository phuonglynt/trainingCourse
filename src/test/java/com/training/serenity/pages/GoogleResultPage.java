package com.training.serenity.pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GoogleResultPage extends PageObject {
    public static String NUMBER_OF_RESULTS = "//*[@role='listbox']/li";
    public GoogleResultPage(WebDriver driver) {
        super(driver);
    }

    public int get_number_of_results() {
        String content = this.getDriver().findElement(By.xpath(NUMBER_OF_RESULTS)).getText();
        String split[] = content.split(" ");
        return Integer.parseInt(split[1].replace(".", ""));
    }
}
