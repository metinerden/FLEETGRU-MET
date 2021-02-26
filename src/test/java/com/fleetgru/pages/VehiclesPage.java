package com.fleetgru.pages;

import com.fleetgru.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VehiclesPage extends BasePage {

    public VehiclesPage(){
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(css=".fa-star")
    public WebElement favoriteButton;

    @FindBy(css = ".fa-thumb-tack")
    public WebElement pinButton;

    @FindBy(xpath = "//button[@class='sidebar__add-widget']")
    public WebElement sideBarPlus;

    @FindBy(css=" div.widget-picker-containers > div:nth-of-type(1) .btn")
    public WebElement recentEmailsAdd;
    @FindBy(css = "div.sidebar-widget-recent-emails > .sidebar-widget__icon > .sidebar-widget-icon")
    public WebElement recentEmailsIcon;


    @FindBy(css = "div.widget-picker-containers > div:nth-of-type(2) .btn")
    public WebElement stickyNoteAdd;
    @FindBy(css = "div.sidebar-widget-sticky-note > .sidebar-widget__icon > .sidebar-widget-icon")
    public WebElement stickyNoteIcon;


    @FindBy(css = "div.widget-picker-containers > div:nth-of-type(3) .btn")
    public WebElement taskListAdd;
    @FindBy(css = "div.sidebar-widget-assigned-tasks > .sidebar-widget__icon > .sidebar-widget-icon")
    public WebElement taskListIcon;

    @FindBy(xpath = "//a[.='Close']")
    public WebElement closeButton;


    @FindBy(css = ".fa-bars")
    public WebElement barMenuFavorite;

    @FindBy(css = ".fa-star-o")
    public WebElement barMenuFavButton;

    @FindBy(xpath = "//a[.='Car - Entities - System - Car - Entities - System']")
    public WebElement menuTitle;
//Car - Entities - System - Car - Entities - System

    @FindBy(xpath = "//div[@class='list-bar']//a[.='Car - Entities - System']")
    public WebElement pinTitle;
//Car - Entities - System
}