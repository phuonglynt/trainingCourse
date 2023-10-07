package com.training.serenity.pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GoogleHomePagev1 extends PageObject {
    public static final String SEARCH_URL = "https://google.com";
    public static final String SEARCH_BOX = "//input[contains(@title, 'Tìm kiếm')]";
    public static final String SEARCH_BUTTON = "//input[contains(@value, 'Tìm với Google')]";

    public GoogleHomePagev1(WebDriver driver) {
        super(driver);
    }

    public void open_the_google_search() {
        this.getDriver().manage().window().maximize();
        this.getDriver().navigate().to(SEARCH_URL);
    }

    public void type_keyword_into_search_box(String value) {
        this.getDriver().findElement(By.xpath(SEARCH_BOX)).sendKeys(value);
    }

    public void click_search() {
        this.getDriver().findElement(By.xpath(SEARCH_BUTTON)).click();
    }

}
