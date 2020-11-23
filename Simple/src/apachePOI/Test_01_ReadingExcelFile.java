package apachePOI;

import java.io.FileInputStream;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Test_01_ReadingExcelFile {

	public static void main(String[] args) throws Exception {
		String excelFilePath = "./datafiles/countries.xlsx";
		FileInputStream fis = new FileInputStream(excelFilePath);
		@SuppressWarnings("resource")
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
//		XSSFSheet sheet = workbook.getSheet("survey");
//		or
		XSSFSheet sheet = workbook.getSheetAt(0);
//		Using for Loop
		/*
		 * int rows = sheet.getLastRowNum(); int cols =
		 * sheet.getRow(1).getLastCellNum(); for (int r = 0; r <= rows; r++) { XSSFRow
		 * row = sheet.getRow(r); for (int c = 0; c < cols; c++) { XSSFCell cell =
		 * row.getCell(c); switch (cell.getCellType()) { case STRING:
		 * System.out.print(cell.getStringCellValue()); break;
		 * 
		 * case NUMERIC: System.out.print(cell.getNumericCellValue()); break;
		 * 
		 * case BOOLEAN: System.out.print(cell.getBooleanCellValue()); break;
		 * 
		 * default: System.out.println("Type Not Found::"); break; }
		 * System.out.print("       "); } System.out.println(); }
		 */

//		Using Iterator
		Iterator<Row> iterator = sheet.iterator();
		while (iterator.hasNext()) {
			XSSFRow row = (XSSFRow) iterator.next();
			Iterator<Cell> cellIterator = row.cellIterator();
			while (cellIterator.hasNext()) {
				XSSFCell cell = (XSSFCell) cellIterator.next();
				switch (cell.getCellType()) {
				case STRING:
					System.out.print(cell.getStringCellValue());
					break;

				case NUMERIC:
					System.out.print(cell.getNumericCellValue());
					break;

				case BOOLEAN:
					System.out.print(cell.getBooleanCellValue());
					break;

				default:
					System.out.println("Type Not Found::");
					break;
				}
				System.out.print("  |  ");
			}
			System.out.println();
		}

	}

}
