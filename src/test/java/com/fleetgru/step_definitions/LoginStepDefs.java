package com.fleetgru.step_definitions;

import com.fleetgru.pages.DashboardPage;
import com.fleetgru.pages.LoginPage;
import com.fleetgru.utilities.BrowserUtils;
import com.fleetgru.utilities.ConfigurationReader;
import com.fleetgru.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginStepDefs {

    @Given("the user logged in as {string}")
    public void the_user_logged_in_as(String userType) {
        Driver.get().get(ConfigurationReader.get("url"));

        String username =null;
        String password =null;

      if(userType.equals("sales manager")){
            username = ConfigurationReader.get("sales_manager_username");
            password = ConfigurationReader.get("sales_manager_password");
        }else if(userType.equals("store manager")){
            username = ConfigurationReader.get("store_manager_username");
            password = ConfigurationReader.get("store_manager_password");
        }

        new LoginPage().login(username,password);
    }

    @And("the title contains {string}")
    public void the_title_contains(String expectedTitle) {
        BrowserUtils.waitFor(2);
        Assert.assertTrue(Driver.get().getTitle().contains(expectedTitle));

    }

    @When("the user navigates to {string} {string} page")
        public void the_user_navigates_to(String tab, String module) {
            new DashboardPage().navigateToModule(tab,module);
        }



    }


