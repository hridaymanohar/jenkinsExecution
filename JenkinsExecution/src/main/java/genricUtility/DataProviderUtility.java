package genricUtility;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;
/**
 * this class contain DATA_PROVIDER
 */
public class DataProviderUtility {
	/**
	 * This method is use to send data into the test case
	 * @return
	 * @throws Throwable
	 */
	@DataProvider( name ="dataProviderWithWorkbook")
	public Object[][] dataProviderWithWorkbook() throws Throwable {
		
		FileInputStream fis = new FileInputStream("./src/test/resources/ExcelData1.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet("multipleData");
		
		int lastrownum = sheet.getLastRowNum();
		int physicalcellcount = sheet.getRow(0).getPhysicalNumberOfCells();
		
		Object [][] objarr = new Object[lastrownum][physicalcellcount];
		
		
		for (int i = 1; i <= lastrownum; i++) {
			
			Row row = sheet.getRow(i);
			
			for (int j = 0; j < physicalcellcount; j++) {
				
			Cell cell = row.getCell(j);
			
			
			objarr[i-1][j]= cell.getStringCellValue();
				
			}
			
		}
		return objarr;

	}
}
