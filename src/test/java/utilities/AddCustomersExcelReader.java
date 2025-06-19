package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class AddCustomersExcelReader {
	@DataProvider
	public Object[][] addCustomers() throws IOException {

		File file = new File(
				"D:\\EclipseWorkSpace\\selenium_project1\\src\\test\\resources\\customerlist.xlsx");
		FileInputStream fis = new FileInputStream(file);
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheet("customerlist");

		int rows = sheet.getPhysicalNumberOfRows();
		System.out.println(rows);
		int cols = sheet.getRow(0).getLastCellNum();
		System.out.println(cols);
		DataFormatter df=new DataFormatter();

		Object[][] data = new Object[rows - 1][cols];
		for (int i = 1; i < rows; i++) {
             for(int j=0;j<cols;j++) {
            	 data[i-1][j]=df.formatCellValue(sheet.getRow(i).getCell(j));
             }
		}
fis.close();
workbook.close();
return data;
	}

}
