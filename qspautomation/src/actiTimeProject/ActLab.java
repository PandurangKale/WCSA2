package actiTimeProject;
import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ActLab {
	//readDAtaexcelFile
	public String readDataExcel(String excelPath,String sheetname,int rownum,int cellnum)
			throws EncryptedDocumentException, IOException
	{
		 FileInputStream fis = new FileInputStream(excelPath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(sheetname);
		Row row = sh.getRow(rownum);
		Cell cell = row.getCell(cellnum);
		String data = cell.getStringCellValue();
		return data;
	}
	//readDatafrom property file
	public String readPropertFile(String propPath,String key) throws IOException
	{
		FileInputStream fis = new FileInputStream(propPath);
		Properties prop = new Properties();
		prop.load(fis);
		String value = prop.getProperty(key);
		return value;
		
	}

}
