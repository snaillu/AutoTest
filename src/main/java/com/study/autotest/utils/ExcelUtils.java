package com.study.autotest.utils;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * Created by snail on 11/21/15.
 */
public class ExcelUtils {
    private static String path = "/home/snail/test/result.xls";

    public static void main(String[] args){
        readExcel();
    }

    private static void readExcel(){
        InputStream stream = null;
        try{
            stream = new FileInputStream(path);
            HSSFWorkbook workbook = new HSSFWorkbook(stream);
            HSSFSheet sheet = workbook.getSheetAt(0);
            System.out.println(sheet.getLastRowNum());
        }catch (Exception e){
            System.out.print("ERROR");
        }
    }

    private static void writeExcel(){
        InputStream stream = null;

        try{
            stream = new FileInputStream(path);
            HSSFWorkbook workbook = new HSSFWorkbook(stream);
            HSSFSheet sheet = workbook.getSheetAt(0);

            HSSFRow row = sheet.createRow(sheet.getLastRowNum()+1);
            HSSFCell cell = row.createCell(0);
            OutputStream out = new FileOutputStream(path);
            cell.setCellValue("This is snail.");
            workbook.write(out);
            out.close();
        }catch (Exception e){

        }
    }

    private static void replaceExcel(){
        InputStream stream = null;

        try{
            stream = new FileInputStream(path);
            HSSFWorkbook workbook = new HSSFWorkbook(stream);
            HSSFSheet sheet = workbook.getSheetAt(0);

            HSSFRow row = sheet.getRow(0);
            HSSFCell cell = row.getCell(0);
            OutputStream out = new FileOutputStream(path);
            System.out.print("value="+cell.getNumericCellValue());
            cell.setCellValue("0000000000");
            workbook.write(out);
            out.close();
        }catch (Exception e){

        }
    }
}
