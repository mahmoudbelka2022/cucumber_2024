package com.cydeo.step_definitions;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.streaming.*;

import java.io.*;

public class ApachiPoiTest {

    public static void main(String[] args) throws IOException {
        String path = "/Users/adammahmoud/Downloads/SDET_Cucumber_24/src/test/resources/test.xlsx";

        FileInputStream file = new FileInputStream(path);
        Workbook workbook = WorkbookFactory.create(file);
        Sheet worksheet = workbook.getSheet("test");

        String userName = worksheet.getRow(1).getCell(0).toString(); // Test
        String password = worksheet.getRow(1).getCell(1).toString(); // Tester

        System.out.println("userName = " + userName);
        System.out.println("password = " + password);

    }



}
