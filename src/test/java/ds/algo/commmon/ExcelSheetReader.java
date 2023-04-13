package ds.algo.commmon;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelSheetReader {

	public List<List<String>> readExcelData() throws IOException {

		String excelFilePath = "D:\\selenium\\workspace\\DSAlgoNew\\src\\test\\resources\\excelTestData.xlsx";

		FileInputStream inputStream = new FileInputStream(excelFilePath);

		@SuppressWarnings("resource")
		XSSFWorkbook workbook = new XSSFWorkbook(inputStream);

		XSSFSheet sheet = workbook.getSheet("Sheet1");

		int rows = sheet.getLastRowNum();

		int cols = sheet.getRow(0).getLastCellNum();
		System.out.println("rows :" + rows + " cols: " + cols);
		
		
		List<List<String>> outerList = new ArrayList<List<String>>();

		for (int r = 1; r <= rows; r++) {
			XSSFRow row = sheet.getRow(r);
			List<String> innerList = new ArrayList<String>();

			for (int c = 0; c < cols; c++) {

				XSSFCell cell = row.getCell(c);
				
				innerList.add(cell.getStringCellValue());

			}
			
			outerList.add(innerList);
		}
		
		return outerList;

	}
	
	public static void main(String[] args) throws IOException {
		ExcelSheetReader reader =  new ExcelSheetReader();
		List<List<String>> excelDataTable = reader.readExcelData();
		for(List<String> data : excelDataTable) {
			System.out.println(data.get(0));
			System.out.println(data.get(1));
		}
	}
}
