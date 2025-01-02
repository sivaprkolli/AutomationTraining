package com.ft.seleniumExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HandleTablesData extends BaseSelenium{
    String columnHeading = "Due";

    @Test
    public void verifyDataInTheTable(){
        driver.get("https://the-internet.herokuapp.com/tables");

        List<WebElement> headerRow = driver.findElements(By.xpath("//table[@id='table1']/thead/tr/th"));
        List<String> headerRowData = new ArrayList<>();

        for (int i=0; i<headerRow.size(); i++){
            headerRowData.add(headerRow.get(i).getText());
        }

        System.out.println("headerRowData :: " + headerRowData);
        int index = headerRowData.indexOf(columnHeading) + 1;
        System.out.println("index :: " + index);

        WebElement data = driver.findElement(By.xpath(
                "//span[text()='"+columnHeading+"']/ancestor::table[@id='table1']//tbody/tr[1]/td["+index+"]"
        ));

        System.out.println(data.getText());

        List<WebElement> firstRow = driver.findElements(By.xpath("//table[@id='table1']/tbody/tr[1]/td[not(a)]"));
        List<String> firstROwData = new ArrayList<>();
        List<String> expectedData = Arrays.asList("Smith", "John", "jsmith@gmail.com", "$50.00", "http://www.jsmith.com");

        for(int i=0; i<firstRow.size(); i++){
            firstROwData.add(firstRow.get(i).getText().trim());
        }

        System.out.println("firstROwData :: " + firstROwData );
        Assert.assertEquals(firstROwData, expectedData);

    }

    @Test
    public void getDataInTheTable() {
        driver.get("https://the-internet.herokuapp.com/tables");

        List<WebElement> rowElements = driver.findElements(By.xpath("//table[@id=\"table1\"]/tbody/tr[1]/td"));
        List<String> rowElementsData = new ArrayList<>();

        for (int i=0; i< rowElements.size(); i++){
            rowElementsData.add(getRowData("Smith").get(i).getText());
        }

        System.out.println("rowElementsData :: "  +rowElementsData);
    }

    public List<WebElement> getRowData(String user){
        return driver.findElements(By.xpath("//table[@id=\"table1\"]/tbody/tr/td[text()='"+user+"']/../td"));
    }
}
