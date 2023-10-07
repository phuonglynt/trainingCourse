package com.training.serenity.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GoogleHomePage extends PageObject {
    public static final String SEARCH_URL = "https://google.com";
    public static final String SEARCH_BOX = "//textarea[@class='gLFyf']";
    public static final String SEARCH_BUTTON = "//input[@class='gNO89b']";

    public GoogleHomePage(WebDriver driver) {
        super(driver);
    }

    public void open_the_google_search() {
        this.getDriver().manage().window().maximize();
//        this.getDriver().navigate().to(SEARCH_URL);
    }

    public void type_keyword_into_search_box(String value) {
        this.getDriver().findElement(By.xpath(SEARCH_BOX)).sendKeys(value);
    }

    public void click_search() {
        this.getDriver().findElement(By.xpath(SEARCH_BUTTON)).click();
    }

    public void findElement(){
        WebElementFacade elementFacade =findBy(SEARCH_BUTTON);
    }



}
