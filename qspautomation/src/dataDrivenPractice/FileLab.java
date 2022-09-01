package dataDrivenPractice;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FileLab {
	public void readExcelData() throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream("./Data/TestData.xlsx");
		 Workbook wb= WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet("citytour");
		Row row = sh.getRow(0);
		Cell cell = row.getCell(0);
		int cell_count=row.getLastCellNum();
		System.out.println(cell_count);
	}	
	
		//String data = cell.getStringCellValue();
		//System.out.println(data);
		
		
//	}
//	public int getRowCount(String excelPath,String sheetName) throws EncryptedDocumentException, IOException
//	{
//		FileInputStream fis = new FileInputStream(excelPath);
//		Workbook wb = WorkbookFactory.create(fis);
//		Sheet sh = wb.getSheet(sheetName);
//		int rc = sh.getLastRowNum();
//		
//		return rc;
//	}
//		public int getCellCount(String excelPath,String sheetName) throws EncryptedDocumentException, IOException
//		{
//			FileInputStream fis = new FileInputStream(excelPath);
//			Workbook wb = WorkbookFactory.create(fis);
//			
//			Sheet sh = wb.getSheet(sheetName);
//			sh.getRow(arg0)
//			int rc = sh.getL
//			return rc;
		
//	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileLab file = new FileLab();
		//int rc = file.getRowCount("./Data/TestData.xlsx","citytour");
		file.readExcelData();
	}
// 
}
