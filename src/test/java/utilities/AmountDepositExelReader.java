package utilities;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class AmountDepositExelReader {
	@DataProvider
	public Object[][] exceladata() throws IOException {
		FileInputStream fis = new FileInputStream(
				"D:\\EclipseWorkSpace\\selenium_project1\\src\\test\\resources\\Amounts1.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheet("Amount");
		int rows = sheet.getPhysicalNumberOfRows();

		int col = sheet.getRow(0).getLastCellNum();
		System.out.println(rows);
		System.out.println(col);
		DataFormatter df = new DataFormatter();
		Object[][] data = new Object[rows - 1][col];
		for (int i = 1; i < rows; i++) {
			for (int j = 0; j < col; j++) {
				data[i - 1][j] = df.formatCellValue(sheet.getRow(i).getCell(j));
			}
		}
		
		  fis.close(); 
		  workbook.close();
		 

		return data;
		

	}

}
