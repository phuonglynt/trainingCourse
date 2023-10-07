package com.training.serenity.pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleResultPagev1 extends PageObject {
    public static String NUMBER_OF_RESULTS = "//*[@id='result-stats']";
    public GoogleResultPagev1(WebDriver driver) {
        super(driver);
    }

    public int get_number_of_results() {
        WebElement statResult = this.getDriver().findElement(By.xpath(NUMBER_OF_RESULTS));
        if (statResult == null){
            return 0;
        }
        String split[] = statResult.getText().split(" ");
        return Integer.parseInt(split[1].replace(".", ""));
    }
}
