package com.ft.seleniumExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class Assignment extends BaseSelenium{
    String match = "Live";
    String location = "Christchurch";
    @Test
    public void getTeamNames(){
        driver.get("https://www.espncricinfo.com/");

        List<WebElement> teams = driver.findElements(By.xpath("//span[text()='"+match+"']/../../../following-sibling::div/descendant::div[@title]"));
        List<WebElement> teamsWithLocation = driver.findElements(By.xpath("//span[text()='RESULT']/../following-sibling::span[text()='Gqeberha']/span/span[text()='1st Match']/../../span/../span/../../../following-sibling::div/descendant::div[@title]"));
        List<WebElement> teamLocation = driver.findElements(By.xpath("//span[text()='"+match+"']/../following-sibling::span[text()='"+location+"']/../../following-sibling::div/descendant::div[@title]"));
        List<String> actualTeamNames = new ArrayList<>();

        for (int i=0; i<teamLocation.size(); i++){
            actualTeamNames.add(teamLocation.get(i).getText());
        }
        System.out.println(match + " ::" +actualTeamNames);
    }
}
