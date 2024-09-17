package com.rd.dataManager;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadDataFromExcel {

    public static void main(String[] args) throws IOException {
        File file = new File(System.getProperty("user.dir") + "/testData/AutomationToolComparision.xlsx");

        FileInputStream fileInputStream = new FileInputStream(file);
        XSSFWorkbook workbook = new XSSFWorkbook(fileInputStream);
        XSSFSheet sheet = workbook.getSheet("tools");

       /* Cell cell1 = sheet.getRow(0).getCell(0);
        Cell cell2 = sheet.getRow(0).getCell(1);
        System.out.println("cell :: " + cell1);
        String cellValue = cell1.getStringCellValue();
        System.out.println(cellValue);*/

        int rowNumber = 0, colNumber = 0;

        for (Row row : sheet) {
            Cell cell = row.getCell(0);

            if (cell.getStringCellValue().equals("Framework Setup")) {
                rowNumber = row.getRowNum();
                System.out.println("rowNumber :: " + rowNumber);
            }
        }

        Row headerRow = sheet.getRow(0);

        for (Cell cell : headerRow) {

            if (cell.getStringCellValue().equals("Selenium")) {
                colNumber = cell.getColumnIndex();
                System.out.println("colNumber :: " + colNumber);
            }
        }

        Cell actualCellValue = sheet.getRow(rowNumber).getCell(colNumber);
        System.out.println("actualCellValue :: " + actualCellValue);
    }
}
