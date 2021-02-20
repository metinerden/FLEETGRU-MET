package com.fleetgru.pages;

import com.fleetgru.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class FleetPage extends BasePage{
public FleetPage() {PageFactory.initElements(Driver.get(), this);}

    @FindBy(xpath = "//tr[1]")
    public WebElement car1;

    @FindBy(xpath = "//tr[4]")
    public WebElement car4;

    @FindBy(xpath = "//tr[6]")
    public WebElement car6;

    @FindBy(xpath = "//tr[19]")
    public WebElement car19;





}




