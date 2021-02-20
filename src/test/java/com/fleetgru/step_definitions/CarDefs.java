package com.fleetgru.step_definitions;

import com.fleetgru.pages.DashboardPage;
import com.fleetgru.pages.FleetPage;
import com.fleetgru.utilities.BrowserUtils;
import com.fleetgru.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Random;

public class CarDefs {

    @When("the user navigates to Fleet Vehicles page")
    public void the_user_navigates_to_Fleet_Vehicles_page() {
        new DashboardPage().navigateToModule("Fleet", "Vehicles");
        BrowserUtils.waitFor(30);
        Assert.assertTrue(new DashboardPage().getPageSubTitle().contains("Cars"));
    }

    @Then("the user gets any {string} information")
    public void the_user_gets_any_car_information(String car) {
        BrowserUtils.waitFor(30);
        if (car.equals("carR1")) {
            BrowserUtils element= new BrowserUtils();
            element.hover(new FleetPage().car1);
            new FleetPage().car1.click();
        }else if(car.equals("carR4")){
            BrowserUtils element= new BrowserUtils();
            element.hover(new FleetPage().car4);
            new FleetPage().car4.click();
        }else if(car.equals("carR6")){
            BrowserUtils element= new BrowserUtils();
            element.hover(new FleetPage().car6);
            new FleetPage().car6.click();
        }else if(car.equals("carR19")){
            BrowserUtils element= new BrowserUtils();
            element.hover(new FleetPage().car19);
            new FleetPage().car19.click();
            }
    }

    @And("the hompage contains {string}")
    public void the_homepage_contains (String subTitle){
        new FleetPage().waitUntilLoaderScreenDisappear();
       Assert.assertTrue(new FleetPage().getPageSubTitle().contains(subTitle));

    }


}
