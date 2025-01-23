package com.ft.CucumberBDDFramework;

import io.cucumber.java.en.*;

public class LoginStepDefinitions {
    @Given("User on login page")
    public void user_on_login_page() {
        System.out.println(" - User on login page");
    }

    @When("User enter {string} and {string}")
    public void user_enter_credentials(String userName, String password) {
        System.out.println(" - Enter :: " + userName + " and " + password);
    }
    @When("User click on submit")
    public void user_click_on_submit() {
        System.out.println(" - User click on submit");
    }
    @Then("User verify products page")
    public void user_verify_products_page() {
        System.out.println("- User verify products page");
    }

    @And("User verify single product")
    public void userVerifySingleProduct() {
        System.out.println("User verify single product");
    }
}
