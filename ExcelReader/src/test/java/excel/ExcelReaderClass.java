package excel;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReaderClass {
	String filePath, sheetName;

	public ExcelReaderClass(String filePath, String sheetName) {
		this.filePath = filePath;
		this.sheetName = sheetName;
	}

	public int rowCount() {
		int i = 0;
		try {
			XSSFWorkbook workBook = new XSSFWorkbook(filePath);
			XSSFSheet workSheet = workBook.getSheet(sheetName);
			i = workSheet.getPhysicalNumberOfRows();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return i;
	}

	public int colCount() {
		int i = 0;
		try {
			XSSFWorkbook workBook = new XSSFWorkbook(filePath);
			XSSFSheet workSheet = workBook.getSheet(sheetName);
			i = workSheet.getRow(0).getPhysicalNumberOfCells();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return i;
	}

	public String getData(int row, int col) {
		String data = null;

		try {
			XSSFWorkbook workBook = new XSSFWorkbook(filePath);
			XSSFSheet workSheet = workBook.getSheet(sheetName);
			data = workSheet.getRow(row).getCell(col).getStringCellValue();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return data;
	}
}
