package com.zohocrm.generic;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FileLib
{
	public String getPropertyData(String key) throws IOException
	{
		FileInputStream fis=new FileInputStream("./src/test/resources/commondata.property");
		Properties p=new Properties();
		p.load(fis);
		String data = p.getProperty(key);
		return data;
	}
	
	public String getExcelData(String sheet, int row, int cell) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis=new FileInputStream("./src/test/resources/testscript.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Cell data = wb.getSheet(sheet).getRow(row).getCell(cell);
		
		DataFormatter formatter = new DataFormatter();
		String text = formatter.formatCellValue(data);
		
		return text;
	}
}
