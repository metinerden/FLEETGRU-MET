package com.fleetgru.step_definitions;

import com.fleetgru.pages.DashboardPage;
import com.fleetgru.pages.CarPage;
import com.fleetgru.utilities.BrowserUtils;
import com.fleetgru.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.swing.*;
import java.net.http.WebSocket;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class CarDefs {
    WebDriverWait wait = new WebDriverWait (Driver.get(), 5);
    @When("the user navigates to Fleet Vehicles page")
    public void the_user_navigates_to_Fleet_Vehicles_page() {
        new DashboardPage().navigateToModule("Fleet", "Vehicles");
        BrowserUtils.waitFor(30);
        Assert.assertTrue(new DashboardPage().getPageSubTitle().contains("Cars"));
    }

    @When("the user gets  car1 information")
    public void car1_navigate(){
        //Driver.get().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        //wait.until(ExpectedConditions.visibilityOf(new CarPage().car1));
        BrowserUtils.waitFor(5);
        new CarPage().car1.click();
    }

    @Then("the user gets any {string} information")
    public void the_user_gets_any_car_information(String carR) {
        BrowserUtils.waitFor(10);

        String CarType=carR;
        switch (CarType){
            case"car4":
                new CarPage().car4.click();
                break;
            case"car6":
                new CarPage().car6.click();
                break;
            case"car19":
                new CarPage().car19.click();
                break;
            case"car1":
                new CarPage().car1.click();
                break;
            default:
                System.out.println("there is a problem in switch case");
                break;
        }

    }

    @And("the hompage contains {string}")
    public void the_homepage_contains (String ecpectedTitle){
        BrowserUtils.waitFor(10);
        Assert.assertTrue(Driver.get().getTitle().contains(ecpectedTitle));

    }

    @Then("the user get car information")
    public void grid_settings (){
        new CarPage().car1.click();
        BrowserUtils.waitFor(5);
        Assert.assertTrue(Driver.get().getTitle().contains("Cybertek"));

    }
    @When("the user filters by using Activity Type")
    public void the_user_filters_by_using_Activity_Type() {

       BrowserUtils.waitFor(5);
        new CarPage().activity.click();
        ArrayList<WebElement> newList = new ArrayList<>();

        for (WebElement checkbox : new CarPage().activityDropDown) {
            if (!checkbox.isSelected()){
                checkbox.click();
                BrowserUtils.waitFor(3);
                newList.add(checkbox);
            }
        }

        for (int i = 0; i < newList.size(); i++)
            if (newList.get(0) == newList.get(i)) {
                BrowserUtils.waitFor(3);
                WebElement checkbox = Driver.get().findElement(By.id("ui-multiselect-1-1-option-["+i+"]"));
                Assert.assertFalse(checkbox.isSelected());
            }else{
                BrowserUtils.waitFor(3);
                WebElement checkbox = Driver.get().findElement(By.id("ui-multiselect-1-1-option-["+i+"]"));
                Assert.assertTrue(checkbox.isSelected());
            }
        BrowserUtils.waitFor(3);
        String expectedtxt=new CarPage().activityInside.getText();
        Assert.assertTrue(expectedtxt.contains("Calendar"));
    }


    @When("the user filters by using Date Range")
    public void the_user_filters_by_using_Date_Range() {
        BrowserUtils.waitFor(7);
        new CarPage().dateRange.click();
        new CarPage().chooseDateStart.sendKeys("Dec 23, 2020");
        BrowserUtils.waitFor(4);
        //new CarPage().timeStart.sendKeys("12:00 AM");
        new CarPage().chooseDateEnd.sendKeys("Dec 26, 2020");
        BrowserUtils.waitFor(4);
        //new CarPage().timeEnd.sendKeys("12:00 AM");
        new CarPage().updateButton.click();
        BrowserUtils.waitFor(7);
        Assert.assertTrue(new CarPage().dataRangeAttribute.getText().contains("Dec 24, 2020"));
    }

    @When("the user refreshies by using Refresh button")
    public void the_user_refreshies_by_using_Refresh_button() {
       new CarPage().refresh.click();
        System.out.println("refres button works");
    }

    @Then("the user reach older page bt using Older button")
    public void the_user_reach_older_page_bt_using_Older_button() {
       new CarPage().resetButton.click();
       new CarPage().olderButton.click();
       Assert.assertTrue(new CarPage().newerButton.isDisplayed());
    }

    @Then("the user reach newer page bt using Newer button")
    public void the_user_reach_newer_page_bt_using_Newer_button() {
        new CarPage().newerButton.click();
        Assert.assertTrue(new CarPage().olderButton.isDisplayed());

    }
}
