package com.fleetgru.pages;

import com.fleetgru.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class CarPage extends BasePage{
public CarPage() {PageFactory.initElements(Driver.get(), this);}

    @FindBy(xpath = "//tbody/tr[td='213,213']")
    public WebElement car1;

    @FindBy(xpath = "//table//tr[4]")
    public WebElement car4;

    @FindBy(xpath = "//table//tr[6]")
    public WebElement car6;

    @FindBy(xpath = "//table//tr[19]")
    public WebElement car19;

    @FindBy (xpath= "//a[.='Activity']")
    public  WebElement activity;

    @FindBy (css = "div.oro-dropdown-toggle")
    public WebElement dateRange;

    @FindBy (css = ".filter-select-oro")
    public WebElement betweenDropDown;

    @FindBy(xpath = "//i[@class='date']")
    public WebElement dataRangeAttribute;

    @FindBy (css = "div.filter-start-date [placeholder='Choose a date']")
    public WebElement chooseDateStart;

    @FindBy (css = "div.filter-start-date [placeholder='time']")
    public WebElement timeStart;

    @FindBy (css = "div.filter-end-date [placeholder='Choose a date']")
    public WebElement chooseDateEnd;

    @FindBy (css = "div.filter-end-date [placeholder='time']")
    public WebElement timeEnd;

    @FindBy(css =".btn-primary")
    public WebElement updateButton;

    @FindBy(xpath ="//div[@class='column-manager-search empty']/input[1]")
    public WebElement quickSearch;

    @FindBy(css =".filter-select")
    public WebElement activityType;

    @FindBy(xpath ="//input[@value]")
    public List <WebElement> activityDropDown;

    @FindBy (css = "div.items > div:nth-of-type(1) .accordion-heading")
    public  WebElement activityInside;

    @FindBy (xpath = "//i[@class='fa-refresh hide-text']")
    public  WebElement refresh;

    @FindBy (css = "div.oro-dropdown-toggle .fa-close")
    public WebElement resetButton;

    @FindBy (css = "a[data-action-name='goto_next']")
    public WebElement olderButton;

    @FindBy (css = "a[data-action-name='goto_previous']")
    public WebElement newerButton;



}




