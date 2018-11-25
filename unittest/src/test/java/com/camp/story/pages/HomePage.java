package com.camp.story.pages;

import com.google.common.base.Function;
import com.google.common.collect.Lists;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

// tag::header[]
@DefaultUrl("http://www.baidu.com")                      // <1>
public class HomePage extends PageObject {              // <2>
// end::header[]
// tag::searchByKeyword[]

    @FindBy(id = "su")
    WebElement searchButton;

    public void searchFor(String keywords) {
        $("#kw").sendKeys(keywords);          // <3>
        searchButton.click();                           // <4>
    }
// end::searchByKeyword[]
// tag::tail[]
}
// end::tail[]