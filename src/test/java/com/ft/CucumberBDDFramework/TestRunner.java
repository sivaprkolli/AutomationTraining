package com.ft.CucumberBDDFramework;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "com/ft/CucumberBDDFramework",
        plugin = "pretty",
        tags = "@LT3"
        //dryRun = true
       // monochrome = true
)
public class TestRunner {
}
