package genricUtility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
/**
 * this class contains read data from external resources
 */
public class FileUtility {
	/**
	 * This method is use to fatch the data from property file.
	 * @param key
	 * @return
	 * @throws IOException
	 */
	public String readDataFromPropertiesFile(String key) throws IOException {
		FileInputStream fis = new FileInputStream("./src/test/resources/commonData.properties");
		Properties pro = new Properties();
		pro.load(fis);
	String keyvalue=pro.getProperty(key);
	return keyvalue;
		
	}
	/**
	 * To fatch data from Excel file.
	 * @param sheetname
	 * @param rowNum
	 * @param cellNum
	 * @return
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	public String readDataFromExcelFile(String sheetname,int rowNum,int cellNum) throws EncryptedDocumentException, IOException {
		
		FileInputStream fis = new FileInputStream("./src/test/resources/ExcelData1.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
	String value=	wb.getSheet(sheetname).getRow(rowNum).getCell(cellNum).getStringCellValue();
		return value;
	}

}
