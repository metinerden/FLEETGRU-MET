package com.fleetgru.step_definitions;

import com.fleetgru.pages.VehiclesPage;
import com.fleetgru.utilities.BrowserUtils;
import com.fleetgru.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.concurrent.TimeUnit;

public class VehiclesDefs {
    VehiclesPage vehicle= new VehiclesPage();

    @When("the user clicks on plus sign")
    public void the_user_clicks_on_plus_sign() {
       vehicle.sideBarPlus.click();
        Driver.get().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @Given("the user should be able to click add button for Recent emails")
    public void the_user_should_be_able_to_click_add_button_for_Recent_emails() {
       vehicle.recentEmailsAdd.click();
        BrowserUtils.waitFor(7);
    }

    @Given("the user should be able to click add button for Sticky Note")
    public void the_user_should_be_able_to_click_add_button_for_Sticky_Note() {
        vehicle.stickyNoteAdd.click();
        BrowserUtils.waitFor(7);
    }

    @Given("the user should be able to click add button for Task list")
    public void the_user_should_be_able_to_click_add_button_for_Task_list() {
        vehicle.taskListAdd.click();
        BrowserUtils.waitFor(7);
    }

    @Given("the user should be able to click on Close Button")
    public void the_user_should_be_able_to_click_on_Close_Button() {
        vehicle.closeButton.click();
        BrowserUtils.waitFor(7);
    }
    @Given("the user should be able to click on favorite Button")
    public void the_user_should_be_able_to_click_on_favorite_Button() {
        vehicle.favoriteButton.click();
        BrowserUtils.waitFor(7);
    }

    @Given("the user should be able to click on pin Button")
    public void the_user_should_be_able_to_click_on_pin_Button() {
        vehicle.pinButton.click();
        BrowserUtils.waitFor(7);
    }

    @Then("verify Recent emails button enabled")
    public void verify_Recent_emails_title_displayed() {
        Assert.assertTrue(vehicle.recentEmailsIcon.isEnabled());
        BrowserUtils.waitFor(7);
    }

    @Then("verify Added sticky button enabled")
    public void verify_Added_sticky_note_displayed() {
        Assert.assertTrue(vehicle.stickyNoteIcon.isEnabled());
        BrowserUtils.waitFor(5);
    }

    @Then("verify Added task list button enabled")
    public void verify_Added_task_list_displayed() {
        Assert.assertTrue(vehicle.taskListIcon.isEnabled());
        BrowserUtils.waitFor(5);
    }

    @Then("verify favorite button note displayed")
    public void verify_favorite_button_note() {
        vehicle.barMenuFavorite.click();
        BrowserUtils.waitFor(3);
        vehicle.barMenuFavButton.click();
        BrowserUtils.waitFor(5);
        Assert.assertTrue(vehicle.menuTitle.getText().contains("Car - Entities - System - Car - Entities - System"));

    }

    @Then("verify pin button note displayed")
    public void verify_pin_button_note() {
        BrowserUtils.waitFor(5);
        Assert.assertTrue(vehicle.pinTitle.getText().contains("Car - Entities - System"));
    }

}
