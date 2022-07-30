package com.facebook.utility;

import java.io.IOException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.facebook.constants.constants;

public class excelFile {
	
	public excelFile(String excelPath, String SheetName) throws IOException {
		constants.workbook= new XSSFWorkbook(excelPath);
		constants.sheet= constants.workbook.getSheet(SheetName);	
	}
	public static String getCellData(int row, int col) throws IOException {
		
		DataFormatter formatter= new DataFormatter();
	String	value= formatter.formatCellValue(constants.sheet.getRow(row).getCell(col));
	return value;
	}
}
