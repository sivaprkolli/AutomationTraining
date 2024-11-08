package com.ft.testNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest {

    @DataProvider(name = "loginUsers")
    public Object[][] sauceUsers(){
        return new Object[][]  {
                {"standard_user", "secret_sauce"},
                {"locked_out_user", "secret_sauce"},
                {"problem_user", "secret_sauce"},
                {"performance_glitch_user", "secret_sauce"},
                {"error_user", "secret_sauce"}
        };
    }



    @DataProvider(name = "registrationData")
    public Object[][] registrationUsers(){
        return new Object[][]  {
                {"Yash", 123138718, "yash@yopmail"},
                {"BhagyaLaxmi", 738423687, "bhagya@yopmail"},
                {"Keerthi", 123138718, "keerthi@yopmail"},
                {"Mouli", 987367342, "mouli@yopmail"},
                {"Suresh", 564564564, "suresh@yopmail"},
        };
    }

    @Test(dataProvider = "loginUsers")
    public void login(String un, String pwd){
        System.out.println("Username :: " + un + " Password :: " + pwd);
    }


    @Test(dataProvider = "registrationData")
    public void register(String name, int phone, String email){
        System.out.println(name + " :: " + phone + " :: " + email);
    }
}
