package com.ft.CucumberBDDFramework;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LoginStepDefinitions {
    ScenarioContext scenarioContext;

    public LoginStepDefinitions(){
        scenarioContext = new ScenarioContext();
    }

    @Given("User on login page")
    public void user_on_login_page() {
        System.out.println(" - User on login page");
    }

    @When("User enter {string} and {string}")
    public void user_enter_credentials(String userName, String password) {
        System.out.println(" - Enter :: " + userName + " and " + password);
        scenarioContext.setContext("UN", userName);
        scenarioContext.setContext("PWD", password);


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
        System.out.println(scenarioContext.getContext("UN"));
        System.out.println(scenarioContext.getContext("PWD"));
    }


    @When("User enter credentials")
    public void userEnterCredentials(DataTable dataTable) {
        List<String> test = new ArrayList<>();
        List<List<String>> tests = new ArrayList<>();
        List<Map<String, String>> map = new ArrayList<>();

       List<String> firstRow = dataTable.row(0);
        System.out.println(firstRow.get(0));
        System.out.println(firstRow.get(1));

    }

    @When("User enter credentials using below table")
    public void userEnterCredentialsUsingBelowTable(DataTable dataTable) {
        List<Map<String,String>> table = dataTable.asMaps(String.class, String.class);
        //[{"st","pwd"}, {"un","pwd"}]
        System.out.println(table.size());
        System.out.println(table.get(0));
        System.out.println(table.get(0).get("username"));
        System.out.println(table.get(0).get("password"));
        System.out.println(table.get(0).get("passcode"));
    }
}
