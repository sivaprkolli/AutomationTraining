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

    @Test(dataProvider = "loginUsers")
    public void login(String un, String pwd){
        System.out.println("Username :: " + un + " Password :: " + pwd);
    }
}
